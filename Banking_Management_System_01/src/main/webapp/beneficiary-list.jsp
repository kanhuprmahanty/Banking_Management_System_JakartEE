<%@ page import="java.util.*" %>
<%@ page import="entity.Beneficiary" %>

<h2>Beneficiary List</h2>

<table border="1">

<tr>

<th>ID</th>
<th>Name</th>
<th>Account</th>
<th>Bank</th>
<th>Status</th>
<th>Action</th>

</tr>

<%
List<Beneficiary> list =
(List<Beneficiary>)
request.getAttribute(
"beneficiaries");

for(Beneficiary b : list){
%>

<tr>

<td><%=b.getBeneficiaryId()%></td>

<td><%=b.getBeneficiaryName()%></td>

<td><%=b.getAccountNumber()%></td>

<td><%=b.getBankName()%></td>

<td><%=b.getStatus()%></td>

<td>

<a href=
"verifyBeneficiary?id=<%=b.getBeneficiaryId()%>">
Verify
</a>

|

<a href=
"deleteBeneficiary?id=<%=b.getBeneficiaryId()%>">
Delete
</a>

</td>

</tr>

<%
}
%>

</table>