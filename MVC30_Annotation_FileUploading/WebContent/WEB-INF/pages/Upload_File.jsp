<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<h1 style="color: red;text-align: center">Upload Here...</h1>
<form:form method="POST" modelAttribute="upcmd" enctype="multipart/form-data">
File1:<input type="file" name="file1"><br>
File2:<input type="file" name="file2"><br>
<input type="submit" value="Uploaad">

</form:form>