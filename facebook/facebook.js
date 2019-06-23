
function checkLogin(){
	var username = document.getElementById("email");
	var password1 = document.getElementById("password1");
	
	if ( username == "admin" && password1 == "12345"){
		alert('Login successfull! Welcome admin');
	}else 
	{
		alert('Login failed!!!');
	}	
	
}