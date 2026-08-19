<%@ page import="java.util.*" %>
<%@ page import="entity.Customer" %>

<!DOCTYPE html>
<html>
<head>

<title>Customers</title>

<link href=
"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
rel="stylesheet">

</head>

<body>

<div class="container mt-5">

<h2>Customer List</h2>

<a href="add-customer.jsp"
class="btn btn-primary mb-3">

Add Customer

</a>

<table
class="table table-bordered">

<tr>

<th>ID</th>
<th>Name</th>
<th>Email</th>
<th>Mobile</th>
<th>KYC</th>
<th>Action</th>

</tr>

<%

List<Customer> customers =
(List<Customer>)
request.getAttribute(
"customers");

for(Customer c : customers){

%>

<tr>

<td>
<%=c.getCustomerId()%>
</td>

<td>
<%=c.getFirstName()%>
<%=c.getLastName()%>
</td>

<td>
<%=c.getEmail()%>
</td>

<td>
<%=c.getMobile()%>
</td>

<td>
<%=c.getKycStatus()%>
</td>

<td>

<a class="btn btn-danger btn-sm"
href="deleteCustomer?id=
<%=c.getCustomerId()%>">

Delete

</a>

</td>

</tr>

<%
}
%>

</table>

</div>

</body>

</html>