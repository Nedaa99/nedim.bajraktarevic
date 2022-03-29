<?php

session_start();
 
$dbhost = "localhost"; // ovo je server host 
$dbname = "neda"; // ime baze
$dbuser = "root"; // username
$dbpass = ""; // password
 
$con = mysqli_connect($dbhost, $dbuser, $dbpass, $dbname) or die("MySQL Error: " . mysql_error());