package service;

import dao.AccountDAO;
import dao.TransactionDAO;
import entity.Account;
import entity.Transaction;

import java.util.List;

public class TransactionService {

    private AccountDAO accountDAO =
            new AccountDAO();

    private TransactionDAO transactionDAO =
            new TransactionDAO();

    public void deposit(
            String accountNumber,
            double amount){

        Account account =
                accountDAO
                .getByAccountNumber(
                        accountNumber);

        if(account==null)
            return;

        account.setBalance(
                account.getBalance()
                + amount);

        accountDAO.update(account);

        Transaction tx =
                new Transaction();

        tx.setAccount(account);
        tx.setAmount(amount);
        tx.setTransactionType("DEPOSIT");
        tx.setDescription(
                "Cash Deposit");

        transactionDAO.save(tx);
    }

    public boolean withdraw(
            String accountNumber,
            double amount){

        Account account =
                accountDAO
                .getByAccountNumber(
                        accountNumber);

        if(account==null)
            return false;

        if(account.getBalance()
                < amount){

            return false;
        }

        account.setBalance(
                account.getBalance()
                - amount);

        accountDAO.update(account);

        Transaction tx =
                new Transaction();

        tx.setAccount(account);
        tx.setAmount(amount);
        tx.setTransactionType("WITHDRAW");
        tx.setDescription(
                "Cash Withdrawal");

        transactionDAO.save(tx);

        return true;
    }

    public boolean transfer(
            String fromAcc,
            String toAcc,
            double amount){

        Account sender =
                accountDAO
                .getByAccountNumber(
                        fromAcc);

        Account receiver =
                accountDAO
                .getByAccountNumber(
                        toAcc);

        if(sender==null ||
                receiver==null){

            return false;
        }

        if(sender.getBalance()
                < amount){

            return false;
        }

        sender.setBalance(
                sender.getBalance()
                - amount);

        receiver.setBalance(
                receiver.getBalance()
                + amount);

        accountDAO.update(sender);
        accountDAO.update(receiver);

        Transaction debit =
                new Transaction();

        debit.setAccount(sender);
        debit.setAmount(amount);
        debit.setTransactionType(
                "TRANSFER_DEBIT");

        debit.setDescription(
                "Transferred to "
                + toAcc);

        transactionDAO.save(debit);

        Transaction credit =
                new Transaction();

        credit.setAccount(receiver);
        credit.setAmount(amount);
        credit.setTransactionType(
                "TRANSFER_CREDIT");

        credit.setDescription(
                "Received from "
                + fromAcc);

        transactionDAO.save(credit);

        return true;
    }

    public List<Transaction>
    getAllTransactions(){

        return transactionDAO
                .getAllTransactions();
    }
}
