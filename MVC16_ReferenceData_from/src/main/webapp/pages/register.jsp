<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <form:form method="POST" commandName="regCmd">
    Name::<form:input path="name"/><br>
    Courses::<form:select path="course" multiple="true">
              <form:options items="${course}"/>
             </form:select><br>
    Hobies::<form:checkboxes items="${hobies}" path="hobies"/><br>
    Country::<form:select path="countries">
             <form:options items="${countries}"/>
    </form:select><br>
    <input type="submit" value="register"/>
    
    </form:form>
