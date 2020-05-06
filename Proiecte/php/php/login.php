<?php

if(isset($_POST['login-submit']))
{
	require'dbh.php';
	$username=$_POST['user'];
	$password=$_POST['pass'];
	
	if(empty($username) || empty($password))
	{
		header("Location: ../log.html?error=empty");
		exit();
	}
	else{
		$sql="SELECT * FROM user WHERE name=?;";
		$stmt=mysqli_stmt_init($conn);
		if(!mysqli_stmt_prepare($stmt,$sql))
		{
			header("Location: ../log.html?error=sqlerror");
		    exit();
		}
		else
		{
			mysqli_stmt_bind_param($stmt,"s",$username);
			mysqli_stmt_execute($stmt);
			$result=mysqli_stmt_get_result($stmt);
			if($row=mysqli_fetch_assoc($result))
			{
				$pwdCheck=password_verify($password,$row['password']);
				if($pwdCheck ==false)
				{
					header("Location: ../log.html?error=wrongpass");
		            exit();
				}
				else if($pwdCheck==true){
					session_start();
					$_SESSION['id']=$row['id'];
					$_SESSION['name']=$row['name'];
					$_SESSION['team']=$row['team'];
					
					header("Location: ../pag1.php?login=".$_SESSION['team']);
		            exit();
				}
				else{
					header("Location: ../log.html?error=wrongpass");
		            exit();
				}
			}
			else{
				header("Location: ../log.html?error=".mysql_error());
		        exit();
			}
		}
	}
	
}
else{
	header("Location: ../pag1.php");
	exit();
}