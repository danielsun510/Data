<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.*, com.infsci.bean.Good "%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
<link rel="stylesheet" href="css/frontend.css"></link>
</head>
<body>
	<jsp:include page="FrontMain.jsp"></jsp:include>

	<div id="div2">

		<div id="divgood">
			<table>
				<tr>
					<td colspan="3" style="height: 40px;"><img
						src="images/commendproduct.jpg" alt=""></td>
				</tr>

				<tr>
					<td rowspan="5" style="width: 150px; height: 200px;"><img
						src="images/"></td>
					<td style="width: 200px; height: 30px;">Name:${good.gname}</td>
					<td style="width: 200px; height: 30px;">Date:${good.indate}</td>


				</tr>
				<tr>
					<td style="width: 150px; height: 30px;">Normal
						Price:${good.price1}</td>
					<td style="width: 150px; height: 30px;">Member
						Price:${good.price2}</td>


				</tr>
				<tr>
					<td style="width: 150px; height: 30px;">Category:${good.gtype}</td>
					<td style="width: 150px; height: 30px;">Class:${good.gclass}</td>


				</tr>
				<tr>
					<td style="width: 150px; height: 30px;">Brand:${good.gbrand}</td>
					<td style="width: 150px; height: 30px;">Amount:${good.gnumber}</td>


				</tr>
				<tr>
					<td colspan="2" style="width: 150px; height: 30px;">Remark:${good.gremark}</td>

				</tr>
				<tr>
					<td height="30"></td>
					<td></td>
					<td></td>
				</tr>
			</table>
		</div>
		<div id="divgood">
			<table>
				<tr>
					<td colspan="3" style="height: 40px;"><img
						src="images/newproduct.jpg" alt=""></td>
				</tr>
				<tr>
					<td rowspan="5" style="width: 150px; height: 200px;"><img
						src="images/"></td>
					<td style="width: 200px; height: 30px;">Name:${good.gname}</td>
					<td style="width: 200px; height: 30px;">Date:${good.indate}</td>


				</tr>
				<tr>
					<td style="width: 150px; height: 30px;">Normal
						Price:${good.price1}</td>
					<td style="width: 150px; height: 30px;">Member
						Price:${good.price2}</td>


				</tr>
				<tr>
					<td style="width: 150px; height: 30px;">Category:${good.gtype}</td>
					<td style="width: 150px; height: 30px;">Class:${good.gclass}</td>


				</tr>
				<tr>
					<td style="width: 150px; height: 30px;">Brand:${good.gbrand}</td>
					<td style="width: 150px; height: 30px;">Amount:${good.gnumber}</td>


				</tr>
				<tr>
					<td colspan="2" style="width: 150px; height: 30px;">Remark:${good.gremark}</td>

				</tr>
				<tr>
					<td height="30"></td>
					<td></td>
					<td></td>
				</tr>

			</table>
		</div>

		<div id="divgood">
			<table>

				<tr>
					<td colspan="3" style="height: 40px;"><img
						src="images/popularproduct.jpg" alt=""></td>
				</tr>
				<tr>
					<td rowspan="5" style="width: 150px; height: 200px;"><img
						src="images/"></td>
					<td style="width: 200px; height: 30px;">Name:${good.gname}</td>
					<td style="width: 200px; height: 30px;">Date:${good.indate}</td>


				</tr>
				<tr>
					<td style="width: 150px; height: 30px;">Normal
						Price:${good.price1}</td>
					<td style="width: 150px; height: 30px;">Member
						Price:${good.price2}</td>


				</tr>
				<tr>
					<td style="width: 150px; height: 30px;">Category:${good.gtype}</td>
					<td style="width: 150px; height: 30px;">Class:${good.gclass}</td>


				</tr>
				<tr>
					<td style="width: 150px; height: 30px;">Brand:${good.gbrand}</td>
					<td style="width: 150px; height: 30px;">Amount:${good.gnumber}</td>


				</tr>
				<tr>
					<td colspan="2" style="width: 150px; height: 30px;">Remark:${good.gremark}</td>

				</tr>
				<tr>
					<td height="30"></td>
					<td></td>
					<td></td>
				</tr>

			</table>
		</div>

	</div>


</body>
</html>