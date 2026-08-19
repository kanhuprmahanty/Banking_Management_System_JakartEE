<%@ page import="java.util.*"%>
<%@ page import="entity.Branch"%>

<table class="table table-bordered">

<tr>

<th>ID</th>
<th>Branch Name</th>
<th>IFSC</th>
<th>Manager</th>
<th>City</th>
<th>Status</th>
<th>Action</th>

</tr>

<%
List<Branch> branches =
(List<Branch>)
request.getAttribute("branches");

for(Branch branch : branches){
%>

<tr>

<td>
<%=branch.getBranchId()%>
</td>

<td>
<%=branch.getBranchName()%>
</td>

<td>
<%=branch.getIfscCode()%>
</td>

<td>
<%=branch.getManagerName()%>
</td>

<td>
<%=branch.getCity()%>
</td>

<td>
<%=branch.getStatus()%>
</td>

<td>

<a href=
"deleteBranch?id=<%=branch.getBranchId()%>"
class="btn btn-danger btn-sm">

Delete

</a>

</td>

</tr>

<%
}
%>

</table>