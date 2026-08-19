<%@ page contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>
<html>

<head>

<title>Create Account</title>

<link href=
"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
rel="stylesheet">

</head>

<body>

<div class="container mt-5">

<div class="card p-4">

<h2>Create Bank Account</h2>

<form action="createAccount"
method="post">

<input
class="form-control mb-3"
name="customerId"
placeholder="Customer ID">

<select
class="form-control mb-3"
name="accountType">

<option>
Savings
</option>

<option>
Current
</option>

</select>

<input
class="form-control mb-3"
name="balance"
placeholder="Opening Balance">

<button
class="btn btn-success">

Create Account

</button>

</form>

</div>

</div>

</body>

</html>