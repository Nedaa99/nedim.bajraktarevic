<?php

include ("db.php"); //putanja do datoteke za spajanje na bazu

if(!empty($_POST['username']) and !empty($_POST['password']))
{
    $username = mysqli_real_escape_string($_POST['username']);
    $password = md5(mysql_real_escape_string($_POST['password']));
    $email = mysqli_real_escape_string($_POST['email']);
 
    $checkusername = mysqli_query("SELECT * FROM users WHERE Username = '".$username."'");
 
     if(mysql_num_rows($checkusername) == 1)
     {
     	echo "<h1>Greška</h1>";
        echo "<p>To korisničko ime već postoji, probajte ponovno.</p>";
     }
     else
     {
     	$registerquery = mysqli_query("INSERT INTO users (Username, Password, EmailAddress) VALUES('".$username."', '".$password."', '".$email."')");
        if($registerquery)
        {
        	echo "<h1>Uspjeh</h1>";
        	echo "<p>Uspješno ste se regitrirali. Klik <a href=\"index.php\">ovdje za login</a>.</p>";
        }
        else
        {
     		echo "<h1>Greška</h1>";   
        }    	
     }
}
else
{
 
 
   echo '<h1>Register</h1>
 
   <p>Please enter your details below to register.</p>
 
	<form method="post" action="register.php" name="registerform">
	<fieldset>
		<label for="username">Username:</label><input type="text" name="username"><br />
		<label for="password">Password:</label><input type="password" name="password"><br />
                <label for="email">Email Address:</label><input type="email" name="email"><br />
            <button type="submit">Registracija</button>    
 
	</fieldset>
	</form>';
}