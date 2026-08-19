<form action="applyLoan"
method="post">

<input
name="customerId"
class="form-control"
placeholder="Customer ID">

<select
name="loanType"
class="form-control mt-2">

<option>Home Loan</option>
<option>Personal Loan</option>
<option>Vehicle Loan</option>
<option>Education Loan</option>

</select>

<input
name="amount"
class="form-control mt-2"
placeholder="Loan Amount">

<input
name="interestRate"
class="form-control mt-2"
placeholder="Interest Rate">

<input
name="durationMonths"
class="form-control mt-2"
placeholder="Duration Months">

<button
class="btn btn-primary mt-3">

Apply Loan

</button>

</form>