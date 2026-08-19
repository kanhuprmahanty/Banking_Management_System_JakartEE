package service;

public class SalaryService {

    public double calculateSalary(
            double basic,
            double bonus,
            double deduction){

        return basic +
                bonus -
                deduction;
    }
}