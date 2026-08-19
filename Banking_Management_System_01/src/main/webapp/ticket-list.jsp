<%@ page import="java.util.*"%>
<%@ page import="entity.SupportTicket"%>

<table class="table table-bordered">

<tr>

<th>ID</th>
<th>Subject</th>
<th>Category</th>
<th>Priority</th>
<th>Status</th>
<th>Assigned To</th>

</tr>

<%
List<SupportTicket> tickets =
(List<SupportTicket>)
request.getAttribute(
"tickets");

for(SupportTicket ticket : tickets){
%>

<tr>

<td>
<%=ticket.getTicketId()%>
</td>

<td>
<%=ticket.getSubject()%>
</td>

<td>
<%=ticket.getCategory()%>
</td>

<td>
<%=ticket.getPriority()%>
</td>

<td>
<%=ticket.getStatus()%>
</td>

<td>

<%=ticket.getAssignedEmployee()
!= null ?

ticket.getAssignedEmployee()
.getFirstName()

:

"Not Assigned"%>

</td>

</tr>

<%
}
%>

</table>