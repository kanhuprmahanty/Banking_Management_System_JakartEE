package service;

import dao.CreditCardDAO;
import entity.CreditCard;

import java.util.Calendar;

public class CreditCardService {

    private CreditCardDAO dao =
            new CreditCardDAO();

    public void applyCard(
            CreditCard card){

        card.setStatus(
                "PENDING");

        card.setAvailableLimit(
                card.getCreditLimit());

        card.setOutstandingAmount(
                0);

        dao.save(card);
    }

    public void approveCard(
            int cardId){

        CreditCard card =
                dao.getById(cardId);

        card.setStatus(
                "APPROVED");

        card.setCardNumber(
                generateCardNumber());

        card.setCvv(
                generateCVV());

        Calendar cal =
                Calendar.getInstance();

        cal.add(
                Calendar.YEAR,
                5);

        card.setExpiryDate(
                cal.getTime());

        dao.update(card);
    }

    public void blockCard(
            int cardId){

        CreditCard card =
                dao.getById(cardId);

        card.setStatus(
                "BLOCKED");

        dao.update(card);
    }

    private String generateCardNumber(){

        return "4532" +
                System.currentTimeMillis();
    }

    private String generateCVV(){

        return String.valueOf(
                (int)
                (Math.random()
                * 900 + 100));
    }
}