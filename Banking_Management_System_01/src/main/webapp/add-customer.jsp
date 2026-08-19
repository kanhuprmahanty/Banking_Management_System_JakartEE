<%@ page contentType="text/html;charset=UTF-8"%>

<!DOCTYPE html>

<html>

<head>

<title>Add Customer</title>

<link href=
"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
rel="stylesheet">

</head>

<body>

<div class="container mt-5">

<div class="card p-4">

<h2>Add Customer</h2>

<form action="addCustomer"
      method="post">

<input class="form-control mb-2"
name="firstName"
placeholder="First Name">

<input class="form-control mb-2"
name="lastName"
placeholder="Last Name">

<input class="form-control mb-2"
name="email"
placeholder="Email">

<input class="form-control mb-2"
name="mobile"
placeholder="Mobile">

<input class="form-control mb-2"
name="aadhaar"
placeholder="Aadhaar">

<input class="form-control mb-2"
name="pan"
placeholder="PAN">

<textarea class="form-control mb-2"
name="address"
placeholder="Address"></textarea>

<button class="btn btn-success">
Save Customer
</button>

</form>

</div>

</div>

</body>

</html>