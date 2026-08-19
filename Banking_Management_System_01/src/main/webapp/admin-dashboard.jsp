<%@ page import="dto.DashboardDTO" %>

<%
DashboardDTO d =
(DashboardDTO)
request.getAttribute("dashboard");
%>

<!DOCTYPE html>

<html>

<head>

<title>Admin Dashboard</title>

<link href=
"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
rel="stylesheet">

<script src=
"https://cdn.jsdelivr.net/npm/chart.js">
</script>

<style>

.card-box{
padding:20px;
border-radius:15px;
color:white;
}

</style>

</head>

<body>

<div class="container-fluid">

<h2 class="mt-4">
Bank Admin Dashboard
</h2>

<div class="row mt-4">

<div class="col-md-3">

<div class="card-box bg-primary">

<h5>Total Customers</h5>

<h2>
<%=d.getTotalCustomers()%>
</h2>

</div>

</div>

<div class="col-md-3">

<div class="card-box bg-success">

<h5>Total Accounts</h5>

<h2>
<%=d.getTotalAccounts()%>
</h2>

</div>

</div>
<div class="mt-3">

<a href="auditLogs"
class="btn btn-dark">

Audit Logs

</a>

<a href="loginHistory"
class="btn btn-primary">

Login History

</a>

</div>

<div class="col-md-3">

<div class="card-box bg-warning">

<h5>Total Loans</h5>

<h2>
<%=d.getTotalLoans()%>
</h2>

</div>

</div>

<div class="col-md-3">

<div class="card-box bg-danger">

<h5>Total Transactions</h5>

<h2>
<%=d.getTotalTransactions()%>
</h2>

</div>

</div>

</div>

<hr>

<div class="row mt-4">

<div class="col-md-6">

<canvas id="customerChart">
</canvas>

</div>

<div class="col-md-6">

<canvas id="loanChart">
</canvas>

</div>
<a href="analytics-dashboard.jsp"
class="btn btn-dark">

Analytics Dashboard

</a>

</div>

</div>

<script>

new Chart(
document.getElementById(
'customerChart'),

{
type:'bar',

data:{

labels:[
'Customers',
'Accounts',
'Loans',
'Transactions'
],

datasets:[{

label:'Bank Statistics',

data:[
<%=d.getTotalCustomers()%>,
<%=d.getTotalAccounts()%>,
<%=d.getTotalLoans()%>,
<%=d.getTotalTransactions()%>
]

}]
}
});

new Chart(
document.getElementById(
'loanChart'),

{
type:'pie',

data:{

labels:[
'Customers',
'Accounts',
'Loans'
],

datasets:[{

data:[
<%=d.getTotalCustomers()%>,
<%=d.getTotalAccounts()%>,
<%=d.getTotalLoans()%>
]

}]
}
});

</script>

</body>

</html>