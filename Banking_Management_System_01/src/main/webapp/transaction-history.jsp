<%@ page import="java.util.*" %>
<%@ page import="entity.Transaction" %>

<table class="table table-bordered">

<tr>
<th>ID</th>
<th>Account</th>
<th>Type</th>
<th>Amount</th>
<th>Date</th>
</tr>

<%
List<Transaction> list =
(List<Transaction>)
request.getAttribute(
"transactions");

for(Transaction tx : list){
%>

<tr>

<td>
<%=tx.getTransactionId()%>
</td>

<td>
<%=tx.getAccount()
.getAccountNumber()%>
</td>

<td>
<%=tx.getTransactionType()%>
</td>

<td>
₹<%=tx.getAmount()%>
</td>

<td>
<%=tx.getTransactionDate()%>
</td>

</tr>

<%
}
%>

</table>