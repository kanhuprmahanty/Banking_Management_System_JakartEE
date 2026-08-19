package service;

public class FDService {

    public double calculateMaturity(

            double principal,
            double rate,
            int months){

        return principal *
                Math.pow(
                (1 + rate/100),
                months/12.0);
    }
}