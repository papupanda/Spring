<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<body >
<h1 style="color:red;text-align:center">Edit Student Detail</h1>
<form:form  method="POST" commandName="studentcommand">
<table  border="1"  style="text-align: center">
<tr>
<td>Student Id:</td><td><form:input path="sid" disabled="true"/></td></tr>
<tr><td>Student Name:</td><td><form:input path="sname"/></td></tr>
<tr><td>Student Age:</td><td><form:input path="age"/></td></tr>
<tr><td>FatherName:</td><td><form:input path="fathername"/></td></tr>
<tr><td>Student AdharNo:</td><td><form:input path="adharno"/></td></tr>
<tr><td>Permanet Address:</td><td><form:input path="address"/></td></tr>
<tr><td>Parent PhoneNumber:</td><td><form:input path="phonenumber"/></td><tr>
<tr><td>Student Batch:</td><td><form:input path="batch"/></td></tr>
 
</table>
<tr><td><input type="submit" value="Update"></td></tr>
</form:form>
</body>