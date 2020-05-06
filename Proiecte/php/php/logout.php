<?php

if(isset($_POST['submit-logout']))
{
	session_start();
	session_unset();
	session_destroy();
	header("Location:../pag1.php");
}
else{
session_start();
	session_unset();
	session_destroy();
	header("Location:../pag1.php");
}