package com.introduction;

public class MailService {
    public void sendEmail(){
        connect(1);
        authenticate();
        //Send Email
        disconnect();
    }
    private void connect(int timeout){
        System.out.println("Connect");
    }
    private void disconnect(){
        System.out.println("Discount");
   }
    private void authenticate(){
       System.out.println("Authenticate");
   }

}
