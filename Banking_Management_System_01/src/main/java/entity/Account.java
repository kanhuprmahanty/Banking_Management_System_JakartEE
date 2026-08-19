package entity;

import jakarta.persistence.*;

@Entity
@Table(name="accounts")
public class Account {

    @Id
    @GeneratedValue(
    strategy = GenerationType.IDENTITY)

    @Column(name="account_id")
    private int accountId;

    @Column(unique = true)
    private String accountNumber;

    private String accountType;

    private double balance;

    private String status;

    @ManyToOne
    @JoinColumn(
    name="customer_id")

    private Customer customer;
    @ManyToOne
    @JoinColumn(name = "branch_id")
    private Branch branch;

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public Account() {}

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(
            int accountId) {
        this.accountId = accountId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(
            String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(
            String accountType) {
        this.accountType = accountType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(
            double balance) {
        this.balance = balance;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(
            String status) {
        this.status = status;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(
            Customer customer) {
        this.customer = customer;
    }
}