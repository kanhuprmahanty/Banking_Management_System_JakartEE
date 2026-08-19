<%@ page import="java.util.*" %>
<%@ page import="entity.AuditLog" %>

<!DOCTYPE html>
<html>
<head>

<title>Audit Logs</title>

<link rel="stylesheet"
href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css">

</head>

<body>

<div class="container mt-4">

<h2>Audit Log Report</h2>

<table class="table table-bordered">

<tr>

<th>ID</th>
<th>User</th>
<th>Role</th>
<th>Activity</th>
<th>Module</th>
<th>Status</th>
<th>Date</th>

</tr>

<%
List<AuditLog> logs =
(List<AuditLog>)
request.getAttribute("logs");

if(logs != null){

for(AuditLog log : logs){
%>

<tr>

<td><%=log.getAuditId()%></td>

<td><%=log.getUsername()%></td>

<td><%=log.getRole()%></td>

<td><%=log.getActivity()%></td>

<td><%=log.getModuleName()%></td>

<td><%=log.getStatus()%></td>

<td><%=log.getActivityTime()%></td>

</tr>

<%
}
}
%>

</table>

</div>

</body>
</html>