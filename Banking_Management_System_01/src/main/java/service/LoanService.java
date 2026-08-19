package service;

import dao.LoanDAO;
import entity.Loan;

import java.util.List;

public class LoanService {

    private LoanDAO dao =
            new LoanDAO();

    public double calculateEMI(
            double principal,
            double annualRate,
            int months){

        double monthlyRate =
                annualRate /
                (12 * 100);

        return (principal *
                monthlyRate *
                Math.pow(
                1 + monthlyRate,
                months))

                /

                (Math.pow(
                1 + monthlyRate,
                months) - 1);
    }

    public void applyLoan(
            Loan loan){

        double emi =
                calculateEMI(
                loan.getAmount(),
                loan.getInterestRate(),
                loan.getDurationMonths());

        loan.setEmi(emi);

        loan.setStatus(
                "PENDING");

        dao.save(loan);
    }

    public void approveLoan(
            int loanId){

        Loan loan =
                dao.getById(loanId);

        loan.setStatus(
                "APPROVED");

        dao.update(loan);
    }

    public void rejectLoan(
            int loanId){

        Loan loan =
                dao.getById(loanId);

        loan.setStatus(
                "REJECTED");

        dao.update(loan);
    }

    public List<Loan> getAllLoans(){

        return dao.getAllLoans();
    }
}
