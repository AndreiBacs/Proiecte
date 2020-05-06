function carousel() {
  var i;
  var x = document.getElementsByClassName("mySlides");
  for (i = 0; i < x.length; i++) {
    x[i].style.display = "none";  
  }
  myIndex++;
  if (myIndex > x.length) {myIndex = 1}    
  x[myIndex-1].style.display = "block";  
  setTimeout(carousel, 4000);    
}
function isLog()
{
	if(localStorage.getItem("loged")==true){
		document.getElementById('login').innerHTML = 'LOGOUT';
	}	
}
function logOut()
{
	if(localStorage.getItem("loged")==true){
		localStorage.setItem("loged",0);
	document.getElementById('login').innerHTML = 'LOGIN';
	 location.reload(); }
	
	else
	    location.href = 'log.html';
}