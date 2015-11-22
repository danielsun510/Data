<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
<head>
<title>Main</title>
<link rel="stylesheet" href="css/frontend.css"></link>
<script type="text/javascript">
	function checkForm() {
		var b = true;
		document.getElementById("m_name").innerHTML = "";
		var m_name = document.getElementById("m_name").value;

		document.getElementsByName("m_pwd").innerHTML = "";
		var m_pwd = document.getElementById("m_pwd").value;

		if (m_name == null || m_name == "") {
			document.getElementById("m_name_msg").innerHTML = "Please input username!";
			b = false;
		} else if (m_pwd == null || m_pwd == "") {
			document.getElementById("m_pwd_msg").innerHTML = "Please input password!";
			b = false;
		}
		return b;
	}
</script>
<script type="text/javascript">
	function Logout() {
		var ok = confirm("Are you sure to logout?");
		if (ok) {
			location.href = "Member_Logout";
		}
	}
</script>
</head>
<body>


	<div id="div0">

		<div id="div3">
			<table>


			
				<tr>

					<td style="width: 200px; height: 30px;"></td>
					<td style="width: 350px; height: 30px;"></td>
					<td style="width: 300px; height: 30px;"></td>
					<td style="width: 70px; height: 30px;"></td>

				</tr>
				<tr>

					<td style="width: 200px; height: 30px;"></td>
					<td style="width: 350px; height: 30px;"></td>
					<td style="width: 300px; height: 30px;" align="right">Search:<input
						id="" type="text" name="" /></td>
					<td style="width: 70px; height: 30px;"></td>

				</tr>
				<tr>

					<td style="width: 200px; height: 30px;"></td>
					<td style="width: 350px; height: 30px;"></td>
					<td colspan="2" style="width: 300px; height: 30px;" align="right"><c:choose>
							<c:when test="${log_or_not==1}">
								<font class="href">Current User:${sesision_m_name}</font>
								<a class="Blue" href="javascript:Logout()">Logout</a>
							</c:when>
							<c:otherwise>
								<font size="4" color="blue">Please Login</font>
	</c:otherwise>
						</c:choose></td>


				</tr>


			</table>
		</div>

		<div id="div4">
			<ul>
				<li><a class="top" href="Front_Home.jsp ">Home</a></li>
				<li><a class="top" href="Front_New.jsp">New Products</a></li>
				<li><a class="top" href="Front_Com.jsp">Top Products</a></li>
				
				<li><a class="top"
					href="CurrentMember?m_name=${sesision_m_name}">User Info</a></li>
				<li><a class="top" href=" ">Order</a></li>
				
			</ul>

		</div>


		<div id="div1">

			<div id="dda">
				<form action="Mem_Login" method="post" onsubmit="return checkForm()">
					<table  align="center">
						<tr>
							<td height="60"></td>
							<td></td>
						</tr>

						<tr>
							<td width="40">Username:</td>
							<td width="70"><input id="m_name" type="text" name="m_name" />
								<font id="m_name_msg" color="red" size="-2"></font></td>
						</tr>
						<tr>
							<td>Password:</td>
							<td><input id="m_pwd" type="password" name="m_pwd" /> <font
								id="m_pwd_msg" color="red" size="-2"></font></td>
						</tr>
						<tr>
							<td></td>
							<td><input type="submit" value="Login" />&nbsp;<a
								href="Front_Register.jsp" class="Blue">Register</a></td>
						</tr>
						<tr>
							<td></td>
							<td><font size="-2" color="red">${message}</font></td>
						</tr>
					</table>
				</form>


			</div>




		</div>


	</div>

</body>
</html>