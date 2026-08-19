<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>Enterprise Banking Management System</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
<link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.css" rel="stylesheet">

<style>

body{
    background:#f5f7fb;
    font-family:'Segoe UI',sans-serif;
}

/* Navbar */

.navbar{
    background:#0d47a1;
}

.navbar-brand{
    font-weight:bold;
    font-size:25px;
}

.nav-link{
    color:white!important;
    margin-left:10px;
}

.nav-link:hover{
    color:#ffd54f!important;
}

/* Hero */

.hero{
    background:linear-gradient(rgba(0,40,80,.75),rgba(0,40,80,.75)),
    url("https://images.unsplash.com/photo-1556740749-887f6717d7e4?q=80&w=1800&auto=format&fit=crop");
    background-size:cover;
    background-position:center;
    color:white;
    padding:120px 20px;
}

.hero h1{
    font-size:55px;
    font-weight:bold;
}

.hero p{
    font-size:20px;
}

.btn-bank{
    padding:12px 28px;
    border-radius:30px;
}

/* Cards */

.card{
    border:none;
    border-radius:15px;
    transition:.4s;
}

.card:hover{
    transform:translateY(-8px);
    box-shadow:0px 15px 35px rgba(0,0,0,.15);
}

.counter{
    font-size:35px;
    font-weight:bold;
}

/* Service */

.service-icon{
    font-size:45px;
    color:#0d6efd;
}

.section-title{
    font-weight:bold;
    color:#0d47a1;
}
/* Scroll Button */

#topBtn{

position:fixed;

right:20px;

bottom:20px;

display:none;

border-radius:50%;

width:55px;

height:55px;

z-index:999;

}

/* Dark Theme */

.dark-mode{

background:#121212!important;

color:white!important;

}

.dark-mode .card{

background:#1f1f1f;

color:white;

}

.dark-mode .navbar{

background:#000!important;

}

.dark-mode footer{

background:#000!important;

}

.card{

transition:0.4s;

}

.card:hover{

transform:translateY(-10px);

}

.counter{

transition:1s;

font-size:35px;

font-weight:bold;

}

</style>

</head>
<body>

<!-- Navbar -->

<nav class="navbar navbar-expand-lg navbar-dark sticky-top">

<div class="container">

<a class="navbar-brand" href="index.jsp">

🏦 MyBank

</a>

<button class="navbar-toggler"
type="button"
data-bs-toggle="collapse"
data-bs-target="#menu">

<span class="navbar-toggler-icon"></span>

</button>

<div class="collapse navbar-collapse"
id="menu">

<ul class="navbar-nav ms-auto">

<li class="nav-item">
<a class="nav-link" href="index.jsp">Home</a>
</li>

<li class="nav-item">
<a class="nav-link" href="#services">Services</a>
</li>

<li class="nav-item">
<a class="nav-link" href="#statistics">Statistics</a>
</li>

<li class="nav-item">
<a class="nav-link" href="login.jsp">Login</a>
</li>

<li class="nav-item">
<a class="nav-link" href="register.jsp">Register</a>
</li>

<li class="nav-item">

<a class="nav-link">

<i class="bi bi-bell-fill"></i>

</a>

</li>

</ul>

<form class="d-flex ms-3">

<input
class="form-control me-2"
type="search"
placeholder="Search">

<button
class="btn btn-warning">

Search

</button>

</form>

</div>

</div>

</nav>

<!-- Hero -->

<section class="hero text-center">

<div class="container">

<h1>

Enterprise Banking Management System

</h1>

<p>

Secure • Smart • Digital Banking Experience

</p>

<div class="mt-4">

<a href="login.jsp"
class="btn btn-warning btn-bank">

<i class="bi bi-box-arrow-in-right"></i>

Login

</a>

<a href="register.jsp"
class="btn btn-light btn-bank">

<i class="bi bi-person-plus-fill"></i>

Open Account

</a>

</div>

</div>

</section>

<!-- Statistics -->

<section class="container mt-5"
id="statistics">

<h2 class="text-center section-title mb-4">

Bank Statistics

</h2>

<div class="row g-4">

<div class="col-lg-3">

<div class="card shadow">

<div class="card-body text-center">

<i class="bi bi-people-fill text-primary fs-1"></i>

<h5>Total Customers</h5>

<div class="counter">12,548</div>

</div>

</div>

</div>

<div class="col-lg-3">

<div class="card shadow">

<div class="card-body text-center">

<i class="bi bi-bank text-success fs-1"></i>

<h5>Accounts</h5>

<div class="counter">8,420</div>

</div>

</div>

</div>

<div class="col-lg-3">

<div class="card shadow">

<div class="card-body text-center">

<i class="bi bi-cash-stack text-danger fs-1"></i>

<h5>Loans</h5>

<div class="counter">1,258</div>

</div>

</div>

</div>

<div class="col-lg-3">

<div class="card shadow">

<div class="card-body text-center">

<i class="bi bi-currency-rupee text-warning fs-1"></i>

<h5>Transactions</h5>

<div class="counter">58K</div>

</div>

</div>

</div>

</div>

</section>

<!-- Services -->

<section class="container mt-5"
id="services">

<h2 class="text-center section-title mb-5">

Quick Banking Services

</h2>

<div class="row g-4">

<div class="col-md-3">

<a href="create-account.jsp"
class="text-decoration-none">

<div class="card shadow">

<div class="card-body text-center">

<i class="bi bi-person-plus-fill service-icon"></i>

<h5 class="mt-3">

Open Account

</h5>

</div>

</div>

</a>

</div>

<div class="col-md-3">

<a href="deposit.jsp"
class="text-decoration-none">

<div class="card shadow">

<div class="card-body text-center">

<i class="bi bi-wallet2 service-icon"></i>

<h5 class="mt-3">

Deposit

</h5>

</div>

</div>

</a>

</div>

<div class="col-md-3">

<a href="withdraw.jsp"
class="text-decoration-none">

<div class="card shadow">

<div class="card-body text-center">

<i class="bi bi-cash service-icon"></i>

<h5 class="mt-3">

Withdraw

</h5>

</div>

</div>

</a>

</div>

<div class="col-md-3">

<a href="transfer.jsp"
class="text-decoration-none">

<div class="card shadow">

<div class="card-body text-center">

<i class="bi bi-arrow-left-right service-icon"></i>

<h5 class="mt-3">

Transfer

</h5>

</div>

</div>

</a>

</div>

<div class="col-md-3">

<a href="apply-loan.jsp"
class="text-decoration-none">

<div class="card shadow">

<div class="card-body text-center">

<i class="bi bi-house-door-fill service-icon"></i>

<h5 class="mt-3">

Apply Loan

</h5>

</div>

</div>

</a>

</div>

<div class="col-md-3">

<a href="credit-card-apply.jsp"
class="text-decoration-none">

<div class="card shadow">

<div class="card-body text-center">

<i class="bi bi-credit-card-fill service-icon"></i>

<h5 class="mt-3">

Credit Card

</h5>

</div>

</div>

</a>

</div>

<div class="col-md-3">

<a href="statement.jsp"
class="text-decoration-none">

<div class="card shadow">

<div class="card-body text-center">

<i class="bi bi-file-earmark-text-fill service-icon"></i>

<h5 class="mt-3">

Statements

</h5>

</div>

</div>

</a>

</div>

<div class="col-md-3">

<a href="notification-center.jsp"
class="text-decoration-none">

<div class="card shadow">

<div class="card-body text-center">

<i class="bi bi-bell-fill service-icon"></i>

<h5 class="mt-3">

Notifications

</h5>

</div>

</div>

</a>

</div>

</div>

</section>
<!-- ===================== ADMIN PORTAL ===================== -->

<section class="container mt-5">

    <h2 class="text-center section-title mb-4">

        <i class="bi bi-speedometer2"></i> Admin Portal

    </h2>

    <div class="row g-4">

        <div class="col-md-3">
            <a href="admin-dashboard.jsp" class="text-decoration-none">
                <div class="card shadow text-center">
                    <div class="card-body">
                        <i class="bi bi-display fs-1 text-primary"></i>
                        <h5 class="mt-3">Dashboard</h5>
                    </div>
                </div>
            </a>
        </div>

        <div class="col-md-3">
            <a href="employee-list.jsp" class="text-decoration-none">
                <div class="card shadow text-center">
                    <div class="card-body">
                        <i class="bi bi-person-workspace fs-1 text-success"></i>
                        <h5 class="mt-3">Employees</h5>
                    </div>
                </div>
            </a>
        </div>

        <div class="col-md-3">
            <a href="customer-list.jsp" class="text-decoration-none">
                <div class="card shadow text-center">
                    <div class="card-body">
                        <i class="bi bi-people-fill fs-1 text-warning"></i>
                        <h5 class="mt-3">Customers</h5>
                    </div>
                </div>
            </a>
        </div>

        <div class="col-md-3">
            <a href="branch-list.jsp" class="text-decoration-none">
                <div class="card shadow text-center">
                    <div class="card-body">
                        <i class="bi bi-bank fs-1 text-danger"></i>
                        <h5 class="mt-3">Branches</h5>
                    </div>
                </div>
            </a>
        </div>

        <div class="col-md-3">
            <a href="analytics-dashboard.jsp" class="text-decoration-none">
                <div class="card shadow text-center">
                    <div class="card-body">
                        <i class="bi bi-bar-chart-fill fs-1 text-info"></i>
                        <h5 class="mt-3">Analytics</h5>
                    </div>
                </div>
            </a>
        </div>

        <div class="col-md-3">
            <a href="reports.jsp" class="text-decoration-none">
                <div class="card shadow text-center">
                    <div class="card-body">
                        <i class="bi bi-file-earmark-bar-graph-fill fs-1 text-secondary"></i>
                        <h5 class="mt-3">Reports</h5>
                    </div>
                </div>
            </a>
        </div>

        <div class="col-md-3">
            <a href="audit-logs.jsp" class="text-decoration-none">
                <div class="card shadow text-center">
                    <div class="card-body">
                        <i class="bi bi-journal-text fs-1 text-dark"></i>
                        <h5 class="mt-3">Audit Logs</h5>
                    </div>
                </div>
            </a>
        </div>

        <div class="col-md-3">
            <a href="loan-list.jsp" class="text-decoration-none">
                <div class="card shadow text-center">
                    <div class="card-body">
                        <i class="bi bi-cash-stack fs-1 text-success"></i>
                        <h5 class="mt-3">Loan Requests</h5>
                    </div>
                </div>
            </a>
        </div>

    </div>

</section>

<!-- ================= CUSTOMER PORTAL ================= -->

<section class="container mt-5">

    <h2 class="text-center section-title mb-4">

        <i class="bi bi-person-circle"></i> Customer Portal

    </h2>

    <div class="row g-4">

        <div class="col-md-3">
            <a href="customer-dashboard.jsp" class="text-decoration-none">
                <div class="card shadow text-center">
                    <div class="card-body">
                        <i class="bi bi-house-door-fill fs-1 text-primary"></i>
                        <h5 class="mt-3">Dashboard</h5>
                    </div>
                </div>
            </a>
        </div>

        <div class="col-md-3">
            <a href="transaction-history.jsp" class="text-decoration-none">
                <div class="card shadow text-center">
                    <div class="card-body">
                        <i class="bi bi-clock-history fs-1 text-success"></i>
                        <h5 class="mt-3">Transactions</h5>
                    </div>
                </div>
            </a>
        </div>

        <div class="col-md-3">
            <a href="statement.jsp" class="text-decoration-none">
                <div class="card shadow text-center">
                    <div class="card-body">
                        <i class="bi bi-file-earmark-pdf-fill fs-1 text-danger"></i>
                        <h5 class="mt-3">Statements</h5>
                    </div>
                </div>
            </a>
        </div>

        <div class="col-md-3">
            <a href="beneficiary-list.jsp" class="text-decoration-none">
                <div class="card shadow text-center">
                    <div class="card-body">
                        <i class="bi bi-person-hearts fs-1 text-warning"></i>
                        <h5 class="mt-3">Beneficiaries</h5>
                    </div>
                </div>
            </a>
        </div>

        <div class="col-md-3">
            <a href="nominee-list.jsp" class="text-decoration-none">
                <div class="card shadow text-center">
                    <div class="card-body">
                        <i class="bi bi-person-vcard-fill fs-1 text-info"></i>
                        <h5 class="mt-3">Nominees</h5>
                    </div>
                </div>
            </a>
        </div>

        <div class="col-md-3">
            <a href="notification-center.jsp" class="text-decoration-none">
                <div class="card shadow text-center">
                    <div class="card-body">
                        <i class="bi bi-bell-fill fs-1 text-primary"></i>
                        <h5 class="mt-3">Notifications</h5>
                    </div>
                </div>
            </a>
        </div>

        <div class="col-md-3">
            <a href="raise-ticket.jsp" class="text-decoration-none">
                <div class="card shadow text-center">
                    <div class="card-body">
                        <i class="bi bi-headset fs-1 text-danger"></i>
                        <h5 class="mt-3">Support</h5>
                    </div>
                </div>
            </a>
        </div>

        <div class="col-md-3">
            <a href="transfer.jsp" class="text-decoration-none">
                <div class="card shadow text-center">
                    <div class="card-body">
                        <i class="bi bi-arrow-left-right fs-1 text-success"></i>
                        <h5 class="mt-3">Fund Transfer</h5>
                    </div>
                </div>
            </a>
        </div>

    </div>

</section>

<!-- ================= EMPLOYEE PORTAL ================= -->

<section class="container mt-5">

    <h2 class="text-center section-title mb-4">

        <i class="bi bi-person-badge-fill"></i> Employee Portal

    </h2>

    <div class="row g-4">

        <div class="col-md-3">
            <a href="employee-list.jsp" class="text-decoration-none">
                <div class="card shadow text-center">
                    <div class="card-body">
                        <i class="bi bi-person-lines-fill fs-1 text-success"></i>
                        <h5 class="mt-3">Employees</h5>
                    </div>
                </div>
            </a>
        </div>

        <div class="col-md-3">
            <a href="customer-list.jsp" class="text-decoration-none">
                <div class="card shadow text-center">
                    <div class="card-body">
                        <i class="bi bi-person-check-fill fs-1 text-primary"></i>
                        <h5 class="mt-3">Verify Customer</h5>
                    </div>
                </div>
            </a>
        </div>

        <div class="col-md-3">
            <a href="loan-list.jsp" class="text-decoration-none">
                <div class="card shadow text-center">
                    <div class="card-body">
                        <i class="bi bi-bank2 fs-1 text-warning"></i>
                        <h5 class="mt-3">Loan Approval</h5>
                    </div>
                </div>
            </a>
        </div>

        <div class="col-md-3">
            <a href="support-dashboard.jsp" class="text-decoration-none">
                <div class="card shadow text-center">
                    <div class="card-body">
                        <i class="bi bi-life-preserver fs-1 text-danger"></i>
                        <h5 class="mt-3">Support Dashboard</h5>
                    </div>
                </div>
            </a>
        </div>

    </div>

</section>

<!-- ================= LOAN & CARD MODULE ================= -->

<section class="container mt-5 mb-5">

<h2 class="text-center section-title mb-4">

<i class="bi bi-credit-card-2-front-fill"></i>

Loans & Cards

</h2>

<div class="row g-4">

<div class="col-md-3">
<a href="apply-loan.jsp" class="text-decoration-none">
<div class="card shadow text-center">
<div class="card-body">
<i class="bi bi-house-fill fs-1 text-primary"></i>
<h5 class="mt-3">Apply Loan</h5>
</div>
</div>
</a>
</div>

<div class="col-md-3">
<a href="loan-list.jsp" class="text-decoration-none">
<div class="card shadow text-center">
<div class="card-body">
<i class="bi bi-cash-stack fs-1 text-success"></i>
<h5 class="mt-3">Loan List</h5>
</div>
</div>
</a>
</div>

<div class="col-md-3">
<a href="credit-card-apply.jsp" class="text-decoration-none">
<div class="card shadow text-center">
<div class="card-body">
<i class="bi bi-credit-card-fill fs-1 text-warning"></i>
<h5 class="mt-3">Apply Card</h5>
</div>
</div>
</a>
</div>

<div class="col-md-3">
<a href="credit-card-list.jsp" class="text-decoration-none">
<div class="card shadow text-center">
<div class="card-body">
<i class="bi bi-wallet-fill fs-1 text-danger"></i>
<h5 class="mt-3">Card List</h5>
</div>
</div>
</a>
</div>

</div>

</section>
<!-- ================= ANALYTICS SECTION ================= -->

<section class="container mt-5">

    <h2 class="text-center section-title mb-5">
        <i class="bi bi-bar-chart-line-fill"></i>
        Banking Analytics
    </h2>

    <div class="row">

        <div class="col-lg-6 mb-4">

            <div class="card shadow">

                <div class="card-header bg-primary text-white">

                    Monthly Transactions

                </div>

                <div class="card-body">

                    <canvas id="transactionChart"></canvas>

                </div>

            </div>

        </div>

        <div class="col-lg-6 mb-4">

            <div class="card shadow">

                <div class="card-header bg-success text-white">

                    Loan Distribution

                </div>

                <div class="card-body">

                    <canvas id="loanChart"></canvas>

                </div>

            </div>

        </div>

    </div>

</section>
<!-- ================= PRODUCTS ================= -->

<section class="container mt-5">

<h2 class="text-center section-title mb-5">

Our Banking Products

</h2>

<div class="row g-4">

<div class="col-md-3">

<div class="card shadow">

<div class="card-body text-center">

<i class="bi bi-wallet2 fs-1 text-primary"></i>

<h5 class="mt-3">Savings Account</h5>

<p>Safe & Secure Savings</p>

</div>

</div>

</div>

<div class="col-md-3">

<div class="card shadow">

<div class="card-body text-center">

<i class="bi bi-bank fs-1 text-success"></i>

<h5 class="mt-3">Current Account</h5>

<p>Business Banking</p>

</div>

</div>

</div>

<div class="col-md-3">

<div class="card shadow">

<div class="card-body text-center">

<i class="bi bi-house-fill fs-1 text-warning"></i>

<h5 class="mt-3">Home Loan</h5>

<p>Low Interest Rate</p>

</div>

</div>

</div>

<div class="col-md-3">

<div class="card shadow">

<div class="card-body text-center">

<i class="bi bi-car-front-fill fs-1 text-danger"></i>

<h5 class="mt-3">Vehicle Loan</h5>

<p>Easy EMI Options</p>

</div>

</div>

</div>

</div>

</section>
<!-- ================= TESTIMONIAL ================= -->

<section class="container mt-5">

<h2 class="text-center section-title mb-5">

Happy Customers

</h2>

<div id="testimonialCarousel"
class="carousel slide"
data-bs-ride="carousel">

<div class="carousel-inner">

<div class="carousel-item active">

<div class="card shadow">

<div class="card-body text-center">

<h3>★★★★★</h3>

<p>

Excellent Banking Experience. Fast and Secure.

</p>

<h5>- Rahul Sharma</h5>

</div>

</div>

</div>

<div class="carousel-item">

<div class="card shadow">

<div class="card-body text-center">

<h3>★★★★★</h3>

<p>

Very Fast Loan Approval.

</p>

<h5>- Priya Das</h5>

</div>

</div>

</div>

<div class="carousel-item">

<div class="card shadow">

<div class="card-body text-center">

<h3>★★★★★</h3>

<p>

Highly Recommended Digital Banking.

</p>

<h5>- Amit Kumar</h5>

</div>

</div>

</div>

</div>

<button class="carousel-control-prev"
type="button"
data-bs-target="#testimonialCarousel"
data-bs-slide="prev">

<span class="carousel-control-prev-icon"></span>

</button>

<button class="carousel-control-next"
type="button"
data-bs-target="#testimonialCarousel"
data-bs-slide="next">

<span class="carousel-control-next-icon"></span>

</button>

</div>

</section>
<!-- ================= BRANCH ================= -->

<section class="container mt-5">

<h2 class="text-center section-title mb-5">

Our Branches

</h2>

<div class="row">

<div class="col-md-3">

<div class="card shadow text-center">

<div class="card-body">

<i class="bi bi-geo-alt-fill fs-1 text-danger"></i>

<h5>New Delhi</h5>

<p>Main Branch</p>

</div>

</div>

</div>

<div class="col-md-3">

<div class="card shadow text-center">

<div class="card-body">

<i class="bi bi-geo-alt-fill fs-1 text-success"></i>

<h5>Bengaluru</h5>

<p>Regional Office</p>

</div>

</div>

</div>

<div class="col-md-3">

<div class="card shadow text-center">

<div class="card-body">

<i class="bi bi-geo-alt-fill fs-1 text-primary"></i>

<h5>Hyderabad</h5>

<p>Customer Care</p>

</div>

</div>

</div>

<div class="col-md-3">

<div class="card shadow text-center">

<div class="card-body">

<i class="bi bi-geo-alt-fill fs-1 text-warning"></i>

<h5>Mumbai</h5>

<p>Branch Office</p>

</div>

</div>

</div>

</div>

</section>
<footer class="bg-dark text-white mt-5">

<div class="container">

<div class="row py-5">

<div class="col-md-4">

<h4>

🏦 MyBank

</h4>

<p>

Enterprise Banking Management System

</p>

<p>

Secure Banking

</p>

<p>

24×7 Customer Support

</p>

</div>

<div class="col-md-2">

<h5>

Quick Links

</h5>

<ul class="list-unstyled">

<li><a href="index.jsp" class="text-white text-decoration-none">Home</a></li>

<li><a href="login.jsp" class="text-white text-decoration-none">Login</a></li>

<li><a href="register.jsp" class="text-white text-decoration-none">Register</a></li>

<li><a href="contact.jsp" class="text-white text-decoration-none">Contact</a></li>

</ul>

</div>

<div class="col-md-3">

<h5>

Banking Services

</h5>

<ul class="list-unstyled">

<li>Savings Account</li>

<li>Current Account</li>

<li>Loans</li>

<li>Credit Cards</li>

<li>Fixed Deposits</li>

</ul>

</div>

<div class="col-md-3">

<h5>

Contact

</h5>

<p>

📍 New Delhi, Odisha

</p>

<p>

☎ 1800-123-4567

</p>

<p>

✉ support@mybank.com

</p>

<div>

<i class="bi bi-facebook fs-3 me-3"></i>

<i class="bi bi-twitter-x fs-3 me-3"></i>

<i class="bi bi-instagram fs-3 me-3"></i>

<i class="bi bi-linkedin fs-3"></i>

</div>

</div>

</div>

<hr>

<div class="text-center pb-3">

© 2026 MyBank Banking Management System

</div>

</div>

</footer>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/chart.js"></script>

<script>

const ctx1=document.getElementById("transactionChart");

new Chart(ctx1,{

type:"bar",

data:{

labels:["Jan","Feb","Mar","Apr","May","Jun"],

datasets:[{

label:"Transactions",

data:[120,190,300,500,220,650],

backgroundColor:[
"#0d6efd",
"#198754",
"#ffc107",
"#dc3545",
"#6610f2",
"#20c997"
]

}]

}

});

const ctx2=document.getElementById("loanChart");

new Chart(ctx2,{

type:"pie",

data:{

labels:["Home","Vehicle","Education","Personal"],

datasets:[{

data:[40,20,15,25],

backgroundColor:[

"#0d6efd",
"#198754",
"#ffc107",
"#dc3545"

]

}]

}

});

</script>
<script>

/* Scroll Button */

let topBtn=document.getElementById("topBtn");

window.onscroll=function(){

if(document.body.scrollTop>300 ||

document.documentElement.scrollTop>300)

topBtn.style.display="block";

else

topBtn.style.display="none";

};

topBtn.onclick=function(){

window.scrollTo({

top:0,

behavior:"smooth"

});

};

/* Dark Mode */

document.getElementById("themeBtn")

.addEventListener("click",function(){

document.body.classList.toggle("dark-mode");

});

/* Counter Animation */

let counters=document.querySelectorAll(".counter");

counters.forEach(counter=>{

let value=0;

let target=parseInt(

counter.innerText.replace(/[^0-9]/g,'')

);

let interval=setInterval(()=>{

value+=Math.ceil(target/100);

if(value>=target){

counter.innerText=target.toLocaleString();

clearInterval(interval);

}else{

counter.innerText=value.toLocaleString();

}

},20);

});

/* Search */

const searchBox=document.querySelector("input[type='search']");

searchBox.addEventListener("keyup",function(){

let value=this.value.toLowerCase();

document.querySelectorAll(".card").forEach(card=>{

let txt=card.innerText.toLowerCase();

card.style.display=

txt.includes(value)

?

"block"

:

"none";

});

});

</script>
</body>
</html>