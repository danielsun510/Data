<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Register</title>
<script type="text/javascript">
	function checkForm() {
		var b = true;
		document.getElementById("m_name").innerHTML = "";
		var m_name = document.getElementById("m_name").value;

		document.getElementsByName("m_pwd").innerHTML = "";
		var m_pwd = document.getElementById("m_pwd").value;

		document.getElementsByName("cm_pwd").innerHTML = "";
		var cm_pwd = document.getElementById("cm_pwd").value;

		document.getElementsByName("m_sex").innerHTML = "";
		var m_sex = document.getElementById("m_sex").value;

		document.getElementsByName("m_kind").innerHTML = "";
		var m_kind = document.getElementById("m_kind").value;

		document.getElementsByName("m_marriage").innerHTML = "";
		var m_marriage = document.getElementById("m_marriage").value;

		document.getElementsByName("m_income").innerHTML = "";
		var m_income = document.getElementById("m_income").value;

		document.getElementsByName("m_age").innerHTML = "";
		var m_age = document.getElementById("m_age").value;

		document.getElementsByName("m_address").innerHTML = "";
		var m_address = document.getElementById("m_address").value;

		if (m_name == null || m_name == "") {
			document.getElementById("m_name_msg").innerHTML = "Please Input Your Username!";
			b = false;
		} else if (m_income == null || m_income == "") {
			document.getElementById("m_income_msg").innerHTML = "Please Input Your Income!";
			b = false;
		} else if (m_age == null || m_age == "") {
			document.getElementById("m_age_msg").innerHTML = "Please Input Your Age!";
			b = false;
		} else if (m_address == null || m_address == "") {
			document.getElementById("m_address_msg").innerHTML = "Please Input Your Address!";
			b = false;
		} else if (m_pwd == null || m_pwd == "") {
			document.getElementById("m_pwd_msg").innerHTML = "Please Input Your Password!";
			b = false;
		} else if (cm_pwd == null || cm_pwd == "") {
			document.getElementById("cm_pwd_msg").innerHTML = "Please Comfirm Your Password!";
			b = false;
		} else if ((m_pwd) != (cm_pwd)) {
			document.getElementById("cm_pwd_msg").innerHTML = "You Input the Different Password!";
			b = false;
		}
		return b;
	}
</script>

<script type="text/javascript">
	//AJAX - 页面不刷新，但可以和服务器交换数据。

	var xmlhttp;
	function checkm_name() {
		//1.创建对象
		//IE7+,Chrome,Firefox,...
		if (window.XMLHttpRequest) {
			xmlhttp = new XMLHttpRequest();
		} else {
			// IE5,IE6
			xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
		}

		//2.打开和后台（控制层）连接
		var m_name = document.Mem_form.m_name.value;
		var url = "Check_m_name?m_name=" + m_name;////
		xmlhttp.open("get", url, true); //请求方式，请求路径，是否异步
		//3.设置状态变更的回调函数
		xmlhttp.onreadystatechange = stateChange; //每次的状态改变，会执行后面的函数
		//4.发送数据
		xmlhttp.send(null);
	}

	function stateChange() {
		//0:请求未初始化，1：服务器连接已经建立，2：请求已经接收，3：请求处理中，4：请求已经完成，并给出响应
		if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
			var res = xmlhttp.responseText;
			var font = document.getElementById("m_name_msg");
			if (res == "true") {
				font.innerHTML = "Unavaliable Username!Please Input New Username!";
			} else {
				font.innerHTML = "Avaliable Username!";
			}
		}

	}
</script>
</head>
<body>
<jsp:include page="FrontMain.jsp"></jsp:include>
<div id="div2">
	<form action="Mem_Register" name="Mem_form" method="post"
		onsubmit="return checkForm()">
		<table border="1" bordercolor="#3ABE7C" align="center">
			<tr>
				<td width="100">Username:</td>
				<td width="280"><input id="m_name" type="text" name="m_name"
					onblur="checkm_name()" />
				<!-- onblur离开框执行函数 --> <font id="m_name_msg" color="red" size="-2"></font>
				</td>
			</tr>
			<tr>
			<tr>
				<td>Password:</td>
				<td><input id="m_pwd" type="password" name="m_pwd" /> <font
					id="m_pwd_msg" color="red" size="-2"></font></td>
			</tr>
			<tr>
				<td>Confirm:</td>
				<td><input id="cm_pwd" type="password" name="cm_pwd" /> <font
					id="cm_pwd_msg" color="red" size="-2"></font></td>
			</tr>
			<tr>
				<td>Gender:</td>
				<td><select name="m_sex"><option value="1"
							selected="selected">Male</option>
						<option value="0">Female</option>
				</select> <font id="m_sex_msg" color="red" size="-2"></font></td>
			</tr>

			<tr>
				<td>Kind:</td>
				<td><select name="m_kind"><option value="1"
							selected="selected">Business</option>
						<option value="0">Home</option>
				</select> <font id="m_kind_msg" color="red" size="-2"></font></td>
			</tr>
			<tr>
				<td>Marriage:</td>
				<td><select name="m_marriage"><option value="1"
							selected="selected">Married</option>
						<option value="0">Unmarried</option>
				</select> <font id="m_marriage_msg" color="red" size="-2"></font></td>
			</tr>


			<tr>
				<td>Income:</td>
				<td><input id="m_income" type="text" name="m_income" /> <font
					id="m_income_msg" color="red" size="-2"></font></td>
			</tr>

			<tr>
				<td>Age:</td>
				<td><input id="m_age" type="text" name="m_age" /> <font
					id="m_age_msg" color="red" size="-2"></font></td>
			</tr>
			<tr>

				<td>Address:</td>
				<td><textarea rows="3" cols="19" id="m_address"
						name="m_address"></textarea> <font id="m_address_msg" color="red"
					size="-2"></font></td>

			</tr>



			<tr>

			</tr>
			<tr>

			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Register" /> <font size="-2"
					color="red"> ${message} </font></td>
			</tr>
		</table>
	</form>
</div>


</body>
</html>