/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;


/**
 *
 * @author udaykk
 */
public class TwilioSMSUtil {
     public static String sendTextMessage(String Phonenumber, String msg){
       
        try{
       String ACCOUNT_SID = "ACd10e747a840f102cbfb4efe5800f66c3" ;//System.getenv("TWILIO_SID");
       String AUTH_TOKEN = "31b7c3251400e755ec8748501bcf2297" ;// System.getenv("TWILIO_KEY");

       Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                new com.twilio.type.PhoneNumber(Phonenumber),
                new com.twilio.type.PhoneNumber("+18087360939"),
                msg)
            .create();

        System.out.println(message.getSid());
        
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        return "Message Sent to " + Phonenumber;
    }


    
}
