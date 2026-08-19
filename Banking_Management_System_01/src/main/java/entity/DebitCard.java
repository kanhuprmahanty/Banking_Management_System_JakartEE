package entity;

import jakarta.persistence.*;

@Entity
@Table(name="debit_cards")
public class DebitCard {

    @Id
    @GeneratedValue(
    strategy =
    GenerationType.IDENTITY)

    private int cardId;

    private String cardNumber;

    private String cardStatus;

    private double dailyLimit;

    @OneToOne
    private Account account;

    public int getCardId() {
        return cardId;
    }

    public void setCardId(
            int cardId) {
        this.cardId = cardId;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(
            String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardStatus() {
        return cardStatus;
    }

    public void setCardStatus(
            String cardStatus) {
        this.cardStatus = cardStatus;
    }

    public double getDailyLimit() {
        return dailyLimit;
    }

    public void setDailyLimit(
            double dailyLimit) {
        this.dailyLimit = dailyLimit;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(
            Account account) {
        this.account = account;
    }
}