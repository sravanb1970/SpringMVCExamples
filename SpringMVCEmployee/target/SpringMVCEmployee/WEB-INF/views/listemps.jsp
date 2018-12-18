<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<table border="1" bgcolor="lightgreen">
<tr bgcolor="white">
<th>Employee ID</th>
<th>Employee Name</th>
<th>Employee Job</th>
<th>Employee Salary</th>
</tr>
<c:forEach var="emp" items="${empList }">
<tr bgcolor="skyblue">
<td><c:out value="${emp.no }"/></td>
<td><c:out value="${emp.name }"/></td>
<td><c:out value="${emp.job }"/></td>
<td><c:out value="${emp.salary }"/></td>

</tr>

</c:forEach>
</table>