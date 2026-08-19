<!DOCTYPE html>
<html>
<head>

<title>Analytics Dashboard</title>

<link href=
"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
rel="stylesheet">

<script src=
"https://cdn.jsdelivr.net/npm/chart.js">
</script>

</head>

<body>

<div class="container mt-4">

<h2>Bank Analytics Dashboard</h2>

<div class="row">

<div class="col-md-6">

<canvas id="customerChart">
</canvas>

</div>

<div class="col-md-6">

<canvas id="revenueChart">
</canvas>

</div>

</div>

<br>

<div class="row">

<div class="col-md-6">

<canvas id="loanChart">
</canvas>

</div>

<div class="col-md-6">

<canvas id="branchChart">
</canvas>

</div>

</div>

</div>

<script src="js/analytics.js">
</script>

</body>
</html>