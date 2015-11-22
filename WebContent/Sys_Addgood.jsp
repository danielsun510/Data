<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Commodity</title>
<link 	rel="stylesheet" href="css/management.css"></link>
<script type="text/javascript">
	var b = false; 
	function addc(){
		ok = confirm("Comfirm Operation?");
		if(ok){
			b =true;
		}
		return b;
	}
</script>
</head>
<body>
<jsp:include page="Sys_main.jsp"></jsp:include>

 <div id="div2">
		<form name="form" action="AddGood" method="post" onsubmit="return addc()">
			<table width="670" align="left" border="1">
				<tbody><tr>
					<td colspan="2" align="center">Add Commodity</td>
				</tr>
				<tr>
					<td>Name:</td>
					<td>
						<input type="text" name="gname" size="30" maxlength="10">
					</td>
				</tr>
				<tr>
					<td>Date into Market:</td>
					<td>
						<select name="year">
							<option value="1995" selected="">1995</option>
							<option value="1996">1996</option>
							<option value="1997">1997</option>
							<option value="1998">1998</option>
							<option value="1999">1999</option>
							<option value="2000">2000</option>
							<option value="2001">2001</option>
							<option value="2002">2002</option>
							<option value="2003">2003</option>
							<option value="2004">2004</option>
							<option value="2005">2005</option>
							<option value="2006">2006</option>
							<option value="2007">2007</option>
							<option value="2008">2008</option>
							<option value="2009">2009</option>
							<option value="2010">2010</option>
							<option value="2011">2011</option>
							<option value="2012">2012</option>
							<option value="2013">2013</option>
							<option value="2014">2014</option>
						</select>Year
						
						<select name="month">
							<option value="01" selected="">01</option>
							<option value="02">02</option>
							<option value="03">03</option>
							<option value="04">04</option>
							<option value="05">05</option>
							<option value="06">06</option>
							<option value="07">07</option>
							<option value="08">08</option>
							<option value="09">09</option>
							<option value="10">10</option>
							<option value="11">11</option>
							<option value="12">12</option>
						</select>Month
							<select name="day">
							<option value="01" selected="">01</option>
							<option value="02">02</option>
							<option value="03">03</option>
							<option value="04">04</option>
							<option value="05">05</option>
							<option value="06">06</option>
							<option value="07">07</option>
							<option value="08">08</option>
							<option value="09">09</option>
							<option value="10">10</option>
							<option value="11">11</option>
							<option value="12">12</option>
							<option value="13">13</option>
							<option value="14">14</option>
							<option value="15">15</option>
							<option value="16">16</option>
							<option value="17">17</option>
							<option value="18">18</option>
							<option value="19">19</option>
							<option value="20">20</option>
							<option value="21">21</option>
							<option value="22">22</option>
							<option value="23">23</option>
							<option value="24">24</option>
							<option value="25">25</option>
							<option value="26">26</option>
							<option value="27">27</option>
							<option value="28">28</option>
							<option value="29">29</option>
							<option value="30">30</option>
							<option value="31">31</option>
						</select>Day
						
					</td>
				</tr>
				<tr>
					<td>Price:</td>
					<td>
					<input type="text" name="gprice" size="20" maxlength="8">$   
						
					</td>
				</tr>
				<tr>
					<td>Kind of Product:</td>
					<td>
					<select name="gtype">
							<option value="Mobile Phone" selected="">Mobile Phone</option>
							<option value="Computer">Computer</option>
							<option value="Food">Food</option>
							<option value="Car">Car</option>
							<option value="TV">TV</option>
							<option value="Cloth">Cloth</option>
						</select>
					</td>
				</tr>
			
				<tr>
					<td>Salesman:</td>
					<td>
						<input type="text" name="gsalesman" size="15" maxlength="12">
					</td>
				</tr>
				
					
					
				
					<tr>
					<td>Amount:</td>
					<td>
						<input type="text" name="gnumber" size="15" maxlength="12">
					</td>
				</tr>
				
				   	<tr>
					<td>Picture:</td>
					<td>
						<input type="file" name="gpic">
					</td>
				</tr>
				
				<tr>
					<td>Description:</td>
					<td>
						<textarea rows="6" cols="60" name="gdescription"></textarea>
					</td>
				</tr>
				
				<tr>
					<td></td>
					<td>
						<input type="submit" value="ADD">
						<input type="reset" value="RESET">
						<font color ="red">${msg}</font>
					</td>
				</tr>
				
			</tbody></table>
		</form>
		 
		 </div>
</body>
</html>