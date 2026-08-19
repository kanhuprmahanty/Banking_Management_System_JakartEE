<%@ page import="java.util.*"%>
<%@ page import="entity.Nominee"%>

<table class="table table-bordered">

<tr>

<th>ID</th>
<th>Name</th>
<th>Relationship</th>
<th>Mobile</th>
<th>Share %</th>
<th>Status</th>
<th>Action</th>

</tr>

<%
List<Nominee> nominees =
(List<Nominee>)
request.getAttribute("nominees");

for(Nominee nominee : nominees){
%>

<tr>

<td>
<%=nominee.getNomineeId()%>
</td>

<td>
<%=nominee.getNomineeName()%>
</td>

<td>
<%=nominee.getRelationship()%>
</td>

<td>
<%=nominee.getMobileNumber()%>
</td>

<td>
<%=nominee.getNomineeSharePercentage()%>
</td>

<td>
<%=nominee.getStatus()%>
</td>

<td>

<a href=
"deleteNominee?id=<%=nominee.getNomineeId()%>"
class="btn btn-danger btn-sm">

Delete

</a>

</td>

</tr>

<%
}
%>

</table>