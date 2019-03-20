<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
<style type="text/css">
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
}</style>
</head>
<body>
<div align="center">
<h2>
Welcome ${associate.firstName}&nbsp &nbsp ${associate.lastName } U R  Registration has been done successfully!!!
</h2>
<h2>AssociateId :- ${associate.associateId}</h2>
</div><br><br>
<div align="center" ><a href="index">||Home||</a></div>
</body>
</html>