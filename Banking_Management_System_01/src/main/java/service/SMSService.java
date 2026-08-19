package service;

public class SMSService {

    public void sendSMS(
            String mobile,
            String message){

        System.out.println(
                "SMS SENT");

        System.out.println(
                mobile);

        System.out.println(
                message);
    }
}