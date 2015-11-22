<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
<link rel="stylesheet" href="css/login.css"></link>
<script language="javascript">
	function check(form) {
		if (form.name.value == "") {
			alert("Please Input Username!");
			form.name.focus();
			return false;
		}
		if (form.pwd.value == "") {
			alert("Please Input Password!");
			form.pwd.focus();
			return false;
		}
	}
</script>
</head>
<body>

	<form name="form1" method="post" action="Login">
		<div class="div0">

			<div class="div1">

				<div class="div2">
					<label>Username:</label><span><input name="username"
						type="text" id="name" size="20"></span>
				</div>

				<div class="div2">
					<label>Password:</label><span> <input name="password"
						type="password" id="pwd" size="20">
					</span>
				</div>

				<div class="div22">
					<input type="submit" value="login" onClick="return check(form1)" />
				</div>

			</div>

		</div>
	</form>
</body>
</html>