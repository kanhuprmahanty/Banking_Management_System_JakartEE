package util;

public class IFSCGenerator {

    public static String generateIFSC(
            String branchCode){

        return "BMS0" +
                branchCode
                .toUpperCase();
    }
}