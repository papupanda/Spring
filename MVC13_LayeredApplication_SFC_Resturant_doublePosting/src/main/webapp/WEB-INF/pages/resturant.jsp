<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <h1 style="color:red;text-align:center">Resturant</h1>
   <form:form method="POST" commandName="rstCmd">
   Item Name:<form:input path="itemname"/>
   Catagory:<form:input path="catagory"/>
   Item Price:<form:input path="price"/>
   Available:<form:input path="availabe"/>
   <input type="submit" value="register">
   
   </form:form>