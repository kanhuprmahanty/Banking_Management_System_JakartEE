package service;

import dao.AccountDAO;
import entity.Account;

import java.util.List;
import java.util.Random;

public class AccountService {

    private AccountDAO dao =
            new AccountDAO();

    public String generateAccountNumber(){

        Random random =
                new Random();

        return "ACC"
                + (100000000
                + random.nextInt(
                900000000));
    }

    public void createAccount(
            Account account){

        account.setAccountNumber(
                generateAccountNumber());

        account.setStatus(
                "ACTIVE");

        dao.save(account);
    }

    public List<Account>
    getAllAccounts(){

        return dao.getAllAccounts();
    }

    public Account getById(
            int id){

        return dao.getById(id);
    }

    public Account getByAccountNumber(
            String acc){

        return dao.getByAccountNumber(
                acc);
    }

    public void updateAccount(
            Account account){

        dao.update(account);
    }
}