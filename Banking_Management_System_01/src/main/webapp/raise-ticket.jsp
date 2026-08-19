<form action="raiseTicket"
method="post">

<input type="text"
name="customerId"
placeholder="Customer ID"
class="form-control">

<input type="text"
name="subject"
placeholder="Subject"
class="form-control mt-2">

<textarea
name="description"
class="form-control mt-2"
placeholder="Description">
</textarea>

<select
name="category"
class="form-control mt-2">

<option>ACCOUNT</option>
<option>LOAN</option>
<option>CARD</option>
<option>KYC</option>
<option>TECHNICAL</option>

</select>

<select
name="priority"
class="form-control mt-2">

<option>LOW</option>
<option>MEDIUM</option>
<option>HIGH</option>
<option>CRITICAL</option>

</select>

<button
class="btn btn-primary mt-3">

Raise Ticket

</button>

</form>