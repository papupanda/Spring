<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <h1 style="color:red;text-align:center"> Login Page </h1>
    <form:form modelAttribute="empcmd">
    Login Username:<form:input path="username"/><br>
    Login Password:<form:input path="password"/><br>
    <input type="submit" value="Login">
    </form:form>
