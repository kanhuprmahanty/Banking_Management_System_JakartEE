loadCustomerChart();
loadRevenueChart();
loadLoanChart();
loadBranchChart();

function loadCustomerChart(){

fetch("analytics/customer")
.then(response=>response.json())
.then(data=>{

new Chart(
document.getElementById(
"customerChart"),

{
type:"line",

data:{
labels:data.map(
d=>d.label),

datasets:[{
label:"Customers",

data:data.map(
d=>d.value)
}]
}
});
});
}

function loadRevenueChart(){

fetch("analytics/revenue")
.then(r=>r.json())
.then(data=>{

new Chart(
document.getElementById(
"revenueChart"),

{
type:"bar",

data:{
labels:data.map(
d=>d.label),

datasets:[{
label:"Revenue",

data:data.map(
d=>d.value)
}]
}
});
});
}

function loadLoanChart(){

fetch("analytics/loan")
.then(r=>r.json())
.then(data=>{

new Chart(
document.getElementById(
"loanChart"),

{
type:"pie",

data:{
labels:data.map(
d=>d.label),

datasets:[{
data:data.map(
d=>d.value)
}]
}
});
});
}

function loadBranchChart(){

fetch("analytics/branch")
.then(r=>r.json())
.then(data=>{

new Chart(
document.getElementById(
"branchChart"),

{
type:"doughnut",

data:{
labels:data.map(
d=>d.label),

datasets:[{
data:data.map(
d=>d.value)
}]
}
});
});
}