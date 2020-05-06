<?php

if(isset($_POST['register-submit']))
{
 
 require'dbh.php';
 
$username=$_POST['user'];
$pass=$_POST['password'];
$passRepeat=$_POST['repeatPass'];
$team=$_POST['team'];

  if($pass!==$passRepeat){
	header("Location: ../register.html?error=passMatch");
	exit();
 
  }
  $sql="SELECT * FROM user WHERE name=?";
  $stmt= mysqli_stmt_init($conn);
  if(!mysqli_stmt_prepare($stmt,$sql))
  {
	  header("Location: ../register.html?error=sqlerror");
	  exit();
  }
  else
  {
	  mysqli_stmt_bind_param($stmt,"s",$username);
	  mysqli_stmt_execute($stmt);
	  mysqli_store_result($stmt);
	  $resultCheck=mysqli_stmt_num_rows($stmt);
	  if($resultCheck >0){
		   header("Location: ../register.html?error=userTaken");
	       exit();
	  }
	  else
	  {
		$sql="INSERT INTO user(name,password,team) VALUES (?,?,?)";
		$stmt= mysqli_stmt_init($conn);
		if(!mysqli_stmt_prepare($stmt,$sql))
		{
			header("Location: ../register.html?error=sqlerror");
			exit();
		}
		else
		{
			$hashPass=password_hash($pass,PASSWORD_DEFAULT);
			mysqli_stmt_bind_param($stmt,"sss",$username,$hashPass,$team);
			mysqli_stmt_execute($stmt);
			header("Location: ../log.html");
			exit();
			
		}
			
	  }
  }
  mysqli_stmt_close($stmt);
  mysqli_close($conn);
  
}
else{
	header("Location: ../log.html");
	exit();
}    
?>