<?php

include ("db.php"); //putanja do datoteke za spajanje na bazu

if(!empty($_SESSION['LoggedIn']) and !empty($_SESSION['Username']))
{
 
echo '<h1>Samo za članove</h1>
     <p>Hvala za logiranje! Vi ste <b></b> a Vaša email adresa je: <b></b>.</p>';
 
}
elseif(!empty($_POST['username']) and !empty($_POST['password']))
{
    $username = mysqli_real_escape_string($con, $_POST['username']);
    $password = md5(mysqli_real_escape_string($con, $_POST['password']));
 
    $checklogin = mysqli_query($con, "SELECT * FROM users WHERE Username = '".$username."' AND Password = '".$password."'");
 
    if(mysqli_num_rows($checklogin) == 1)
    {
    	$row = mysqli_fetch_assoc($checklogin);
        $email = $row['EmailAddress'];
 
        $_SESSION['Username'] = $username;
        $_SESSION['EmailAddress'] = $email;
        $_SESSION['LoggedIn'] = 1;
 
    	echo "<h1>Uspjeh</h1>";
        echo "<p>Šaljemo Vas u područje za članove.</p>";
        echo "";
    }
    else
    {
    	echo "<h1>Greška</h1>";
        echo "<p>Klik na  <a href=\"index.php\">i probajte ponovno!</a></p>";
    }
}
else
{
 
   echo '<h1>Login</h1>
 
   <p>Hvala na posjeti! Logirajte se, ili <a href="http://www.kroativ.net/web-development/registracija-login-korisnika-php-mysql-tutorijal/">registrirajte</a>.</p>
 
	<form method="POST" action="login.php" name="loginform">
    	<fieldset>
    		<label for="username">Username:</label><input type="text" name="username"><br />
    		<label for="password">Password:</label><input type="password" name="password"><br />
        
            <button type="submit">Prijava</button>

    	</fieldset>
	</form>';
}