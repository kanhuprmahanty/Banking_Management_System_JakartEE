<%@ page import="java.util.*" %>
<%@ page import="entity.Notification" %>

<h2>Notification Center</h2>

<table class="table table-bordered">

<tr>

<th>ID</th>
<th>Title</th>
<th>Message</th>
<th>Type</th>
<th>Status</th>
<th>Action</th>

</tr>

<%
List<Notification> list =
(List<Notification>)
request.getAttribute(
"notifications");

for(Notification n : list){
%>

<tr>

<td><%=n.getNotificationId()%></td>

<td><%=n.getTitle()%></td>

<td><%=n.getMessage()%></td>

<td><%=n.getType()%></td>

<td>

<%=n.isRead()
? "READ"
: "UNREAD"%>

</td>

<td>

<a href=
"markRead?id=<%=n.getNotificationId()%>"
class=
"btn btn-success btn-sm">

Mark Read

</a>

</td>

</tr>

<%
}
%>

</table>