<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
<style>
#customers {
  font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

#customers td, #customers th {
  border: 1px solid #ddd;
  padding: 8px;
}

#customers tr:nth-child(even){background-color: #f2f2f2;}

#customers tr:hover {background-color: #ddd;}

#customers th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: #1161ee;
  color: white;
}
</style>
</head>
<body>
	<div>
		<table id="customers">
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Yearly Investment under 80C</th>
				<th>Department</th>
				<th>Designation</th>
				<th>Pan Card</th>
				<th>Email Id</th>
				<th>Basic Salary</th>
				<th>EPF</th>
				<th>Company PF</th>
				<th>Account Number</th>
				<th>Bank Name</th>
				<th>IFSC code</th>
				<th>HRA</th>
				<th>Personal Allowance</th>
				<th>Conveyance Allowance</th>
				<th>Other Allowance</th>
				<th>Gross Salary</th>
				<th>Monthly Tax</th>
				<th>Net Salary</th>
			</tr>
			<c:forEach var="associate" items="${requestScope.associate}">
				<tr>
					<td>${associate.firstName}</td>
					<td>${associate.lastName}</td>
					<td>${associate.yearlyInvestmentUnder8oC}</td>
					<td>${associate.department}</td>
					<td>${associate.designation}</td>
					<td>${associate.panCard}</td>
					<td>${associate.emailId}</td>
					<td>${associate.salary.basicSalary}</td>
					<td>${associate.salary.epf}</td>
					<td>${associate.salary.companyPf}</td>
					<td>${associate.bankDetails.accountNumber}</td>
					<td>${associate.bankDetails.bankName}</td>
					<td>${associate.bankDetails.ifscCode}</td>
					<td>${associate.salary.hra}</td>
					<td>${associate.salary.personalAllowance}</td>
					<td>${associate.salary.conveyenceAllowance}</td>
					<td>${associate.salary.otherAllowance}</td>
					<td>${associate.salary.grossSalary}</td>
					<td>${associate.salary.monthlyTax}</td>
					<td>${associate.salary.netSalary}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>