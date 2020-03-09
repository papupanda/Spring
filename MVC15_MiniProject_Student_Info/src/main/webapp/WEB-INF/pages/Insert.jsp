<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<form:form method="POST" commandName="studentcommand">
Student no::<form:input path="sid"/><br>
Student Name::<form:input path="sname"/><br>
Student Age::<form:input path="age"/><br>
Father name::<form:input path="fathername"/><br>
AdharNo::<form:input path="adharno"/><br>
Address::<form:input path="address"/><br>
PhoneNumber::<form:input path="phonenumber"/>
Batch::<form:input path="batch"/>
<input type="submit" value="Insert"/>

</form:form>