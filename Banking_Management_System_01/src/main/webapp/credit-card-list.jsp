<%@ page import="java.util.*" %>
<%@ page import="entity.CreditCard" %>

<table class="table table-bordered">

<tr>

<th>ID</th>
<th>Card Type</th>
<th>Limit</th>
<th>Status</th>
<th>Action</th>

</tr>

<%
List<CreditCard> cards =
(List<CreditCard>)
request.getAttribute("cards");

for(CreditCard card : cards){
%>

<tr>

<td>
<%=card.getCardId()%>
</td>

<td>
<%=card.getCardType()%>
</td>

<td>
₹<%=card.getCreditLimit()%>
</td>

<td>
<%=card.getStatus()%>
</td>

<td>

<a href=
"approveCreditCard?id=<%=card.getCardId()%>">

Approve

</a>

</td>

</tr>

<%
}
%>

</table>