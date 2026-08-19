<%@ page import="java.util.*"%>
<%@ page import="entity.Account"%>

<!DOCTYPE html>

<html>

<head>

<title>Accounts</title>

<link href=
"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
rel="stylesheet">

</head>

<body>

<div class="container mt-5">

<h2>Bank Accounts</h2>

<a href="create-account.jsp"
class="btn btn-primary mb-3">

Create Account

</a>

<table
class="table table-bordered">

<tr>

<th>ID</th>
<th>Account Number</th>
<th>Customer ID</th>
<th>Type</th>
<th>Balance</th>
<th>Status</th>

</tr>

<%

List<Account> accounts =
(List<Account>)
request.getAttribute(
"accounts");

for(Account a : accounts){

%>

<tr>

<td>
<%=a.getAccountId()%>
</td>

<td>
<%=a.getAccountNumber()%>
</td>

<td>
<%=a.getCustomer()
.getCustomerId()%>
</td>

<td>
<%=a.getAccountType()%>
</td>

<td>
₹<%=a.getBalance()%>
</td>

<td>
<%=a.getStatus()%>
</td>

</tr>

<%
}
%>

</table>

</div>

</body>

</html>