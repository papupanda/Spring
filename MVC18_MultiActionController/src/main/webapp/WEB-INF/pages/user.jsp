<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <h1 style="color:red;text-align:center">MultiActionControler App</h1>
    <form action="crud.htm" method="POST">
    UserId::<input type="text" name="userId"><br>
    UserName::<input type="text" name="uname"><br>
    Address::<input type="text" name="addrs"><br>
    Email::<input type="text" name="mail"><br><br>
    <input type="submit" name="p1" value="insert"> 
   <input type="submit" name="p1" value="update"> 
   <input type="submit" name="p1" value="delete"> 
   <input type="submit" name="p1" value="view"> 
    </form>
    <br><br>
   ${operation } is performed.
