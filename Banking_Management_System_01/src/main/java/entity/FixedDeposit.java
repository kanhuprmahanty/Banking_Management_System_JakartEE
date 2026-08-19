package entity;

import jakarta.persistence.*;

@Entity
@Table(name="fixed_deposits")
public class FixedDeposit {

    @Id
    @GeneratedValue(strategy =
    GenerationType.IDENTITY)

    private int fdId;

    private double amount;

    private double interestRate;

    private int tenureMonths;

    private double maturityAmount;

    private String status;

    @ManyToOne
    private Customer customer;

    public int getFdId() {
        return fdId;
    }

    public void setFdId(int fdId) {
        this.fdId = fdId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(
            double amount) {
        this.amount = amount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(
            double interestRate) {
        this.interestRate = interestRate;
    }

    public int getTenureMonths() {
        return tenureMonths;
    }

    public void setTenureMonths(
            int tenureMonths) {
        this.tenureMonths = tenureMonths;
    }

    public double getMaturityAmount() {
        return maturityAmount;
    }

    public void setMaturityAmount(
            double maturityAmount) {
        this.maturityAmount = maturityAmount;
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