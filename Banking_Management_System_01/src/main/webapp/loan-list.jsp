<%@ page import="java.util.*"%>
<%@ page import="entity.Loan"%>

<table class="table table-bordered">

<tr>

<th>ID</th>
<th>Customer</th>
<th>Loan Type</th>
<th>Amount</th>
<th>EMI</th>
<th>Status</th>
<th>Action</th>

</tr>

<%

List<Loan> loans =
(List<Loan>)
request.getAttribute("loans");

for(Loan loan : loans){

%>

<tr>

<td><%=loan.getLoanId()%></td>

<td>
<%=loan.getCustomer()
.getCustomerId()%>
</td>

<td>
<%=loan.getLoanType()%>
</td>

<td>
₹<%=loan.getAmount()%>
</td>

<td>
₹<%=String.format(
"%.2f",
loan.getEmi())%>
</td>

<td>
<%=loan.getStatus()%>
</td>

<td>

<a href="approveLoan?id=
<%=loan.getLoanId()%>">

Approve

</a>

|

<a href="rejectLoan?id=
<%=loan.getLoanId()%>">

Reject

</a>

</td>

</tr>

<%
}
%>

</table>