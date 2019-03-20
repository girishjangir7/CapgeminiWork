<!DOCTYPE html>
<html>
<head>
<style type="text/css">
.error {
	color: red;
	font-weight: bold;
}
body,html{
font-family: Arial, Helvetica, sans-serif;
}
.f{
font-family: Arial, Helvetica, sans-serif;
font-size:50px;
}
.bg-img {
  min-height: 380px;
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
  position: relative;
}

input[type=text], select {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}

input[type=submit] {
  width: 100%;
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: #45a049;
}

div {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}
</style>
</head>
<body>
	<div align="center">
		<form action="netSalary" method="post">
			<table>
				<tr>
					<td>Associate Id</td>
					<td><input type="text" name="associateId" /></td>
					<td><input type="submit" name="Find" /></td><br><br>
					<td><a href="index">||Home||</a></td>
				</tr>
			</table>
		</form>
	</div><br><br>
	<div align="center" class="error">${errorMessage }</div><br><br>

	<div align="center">
		<table>
			<tr>
				<th>Associate Net Salary</th>
			</tr>
			<tr>
				<td>${associate.salary.netSalary }</td>
				
			</tr>
		</table>
	</div>

</body>
</html>