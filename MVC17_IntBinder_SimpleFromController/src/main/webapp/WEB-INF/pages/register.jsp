<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<form:form commandName="regCmd" method="POST">
   <form:errors path="*"/>
   name ::  <form:input path="name"/> <br>
   DOB ::<form:input path="dob"/> (dd-MM-yyyy)<br>
   DOJ :: <form:input path="doj"/>(dd-MM-yyyy) <br>
   DOM :: <form:input path="dom"/>(dd-MM-yyyy) <br>
   <input type="submit"  value="register">
</form:form>