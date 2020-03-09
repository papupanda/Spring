<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <h1 style="color:red;text-align:center">Resturant</h1>
    <script type="JavaScript" onclick="validate.js">


</script>
   <form:form method="POST" commandName="rstCmd">
   <!--<p style='color:red'><form:errors path="*"/> </p>-->
   Item Name:<form:input path="itemname"/><form:errors path="itemname"/><span id="itemnameER"></span> <br>
   Catagory:<form:input path="catagory"/><form:errors path="catagory"/><span id="catagoryER"></span> <br>
   Item Price:<form:input path="price"/><form:errors path="price"/><span id="priceER"></span> <br>
   Available:<form:input path="availabe"/><form:errors path="availabe"/><span id="availabeER"></span> <br>
   
   <input type="submit" value="register">
   
    </form:form> 