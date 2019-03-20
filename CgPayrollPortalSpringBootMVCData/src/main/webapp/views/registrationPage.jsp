<%@ page contentType="text/html; charset=ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<title>Registration</title>
<!-- <style type="text/css">
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
.error {
	color: red;
	font-weight: bold;
}
</style> -->
<style type="text/css">
.error {
	color: red;
	font-weight: bold;
}</style>
</head>
<body>
	<div align="center">
		<h2>Enroll Associate Details Here</h2>
		<table>
			<form:form action="registerAssociate" method="post"
				modelAttribute="associate">
				<tr>
					<td>FirstName:</td>
					<td><form:input path="firstName" size='30' /></td>
					<td><form:errors path="firstName" cssClass="error"></form:errors></td>
				</tr>
				<tr>
					<td>LastName:</td>
					<td><form:input path="lastName" size='30' /></td>
					<td><form:errors path="lastName" cssClass="error"></form:errors></td>
				</tr>
<tr>
					<td>Department:</td>
					<td><form:input path="department" size='30' /></td>
					<td><form:errors path="department" cssClass="error"></form:errors></td>
				</tr>
	<tr>
					<td>yearlyInvestmentUnder8oC:</td>
					<td><form:input path="yearlyInvestmentUnder8oC" size='30' /></td>
					<td><form:errors path="yearlyInvestmentUnder8oC" cssClass="error"></form:errors></td>
				</tr>
				<tr>
					<td>Designation:</td>
					<td><form:input path="designation" size='30' /></td>
					<td><form:errors path="designation" cssClass="error"></form:errors></td>
				</tr>
				<tr>
					<td>PanCard:</td>
					<td><form:input path="panCard" size='30' /></td>
					<td><form:errors path="panCard" cssClass="error"></form:errors></td>
				</tr>
				<tr>
					<td>EmailId:</td>
					<td><form:input path="emailId" size='30' /></td>
					<td><form:errors path="emailId" cssClass="error"></form:errors></td>
				</tr>
				<tr>
					<td>AccountNumber:</td>
					<td><form:input path="bankDetails.accountNumber" size='30' /></td>
					<td><form:errors path="bankDetails.accountNumber" cssClass="error"></form:errors></td>
				</tr>
				<tr>
					<td>BankName:</td>
					<td><form:input path="bankDetails.bankName" size='30' /></td>
					<td><form:errors path="bankDetails.bankName" cssClass="error"></form:errors></td>
				</tr>
				<tr>
					<td>IfscCode:</td>
					<td><form:input path="bankDetails.ifscCode" size='30' /></td>
					<td><form:errors path="bankDetails.ifscCode" cssClass="error"></form:errors></td>
				</tr>
				<tr>
					<td>BasicSalary:</td>
					<td><form:input path="salary.basicSalary" size='30' /></td>
					<td><form:errors path="salary.basicSalary" cssClass="error"></form:errors></td>
				</tr>
				<tr>
					<td>Epf:</td>
					<td><form:input path="salary.epf" size='30' /></td>
					<td><form:errors path="salary.epf" cssClass="error"></form:errors></td>
				</tr>
				<tr>
					<td>CompanyPf:</td>
					<td><form:input path="salary.companyPf" size='30' /></td>
					<td><form:errors path="salary.companyPf" cssClass="error"></form:errors></td>
				</tr>
				
				<tr>
				<td><input type="submit" value="Submit"/></td>
				</tr>
			</form:form>

		</table>


	</div>
</body>
</html>