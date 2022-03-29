<?php

switch ($_GET['action']) {

	case 'contact':
		
		$contact_name = $_POST['contact_name'];
		$contact_email = $_POST['contact_email'];
		$contact_message = $_POST['contact_message'];

		$nas_email = 'aljovicemir@gmail.com';
		$naslov = 'Beze nesto';

		$headers[] = 'From: '. $contact_name .' <'. $contact_email .'>';

		mail($nas_email, $naslov, $contact_message, implode("\r\n", $headers));

		break;

	case 'test':

	$nesto = "hahaha";

		echo $nesto .'<br/>';
		echo md5($nesto);
	break;
}