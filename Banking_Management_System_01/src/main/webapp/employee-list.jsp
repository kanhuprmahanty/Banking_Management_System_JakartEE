<%@ page import="java.util.*"%>
<%@ page import="entity.Employee"%>

<table class="table table-bordered">

<tr>
<th>ID</th>
<th>Code</th>
<th>Name</th>
<th>Department</th>
<th>Designation</th>
<th>Salary</th>
<th>Status</th>
</tr>

<%
List<Employee> employees =
(List<Employee>)
request.getAttribute("employees");

for(Employee emp : employees){
%>

<tr>

<td><%=emp.getEmployeeId()%></td>

<td><%=emp.getEmployeeCode()%></td>

<td>
<%=emp.getFirstName()%>
<%=emp.getLastName()%>
</td>

<td><%=emp.getDepartment()%></td>

<td><%=emp.getDesignation()%></td>

<td>₹<%=emp.getSalary()%></td>

<td><%=emp.getStatus()%></td>

</tr>

<%
}
%>

</table>