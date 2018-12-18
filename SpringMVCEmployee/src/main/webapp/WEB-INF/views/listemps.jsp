<%@page isELIgnored="false" %>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<table border="1" bgcolor="lightgreen">
<tr bgcolor="white">
<th>Employee ID</th>
<th>Employee Name</th>
<th>Employee Job</th>
<th>Employee Salary</th>
</tr>
<c:forEach var="emp" items="${empList}">
<tr bgcolor="skyblue">
<td><c:out value="${emp.eno}"/></td>
<td><c:out value="${emp.ename}"/></td>
<td><c:out value="${emp.ejob}"/></td>
<td><c:out value="${emp.esalary}"/></td>
</tr>

</c:forEach> 
</table>