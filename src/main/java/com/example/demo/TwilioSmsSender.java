package com.example.demo;

import com.twilio.rest.api.v2010.account.Message;
import com.twilio.rest.api.v2010.account.MessageCreator;
import com.twilio.type.PhoneNumber;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("twilio")
public class TwilioSmsSender implements SmsSender {

    private static final Logger LOGGER = LoggerFactory.getLogger(TwilioSmsSender.class);

    private final TwilioConfiguration twilioConfiguration;

    @Autowired
    public TwilioSmsSender(TwilioConfiguration twilioConfiguration) {
        this.twilioConfiguration = twilioConfiguration;
    }

    @Override
    public void sendSms(SmsRequset smsRequset) {
        if (isPhoneNumberValid(smsRequset.getPhoneNumber())) {
            PhoneNumber to = new PhoneNumber(smsRequset.getPhoneNumber());
            PhoneNumber from = new PhoneNumber(twilioConfiguration.getTrialNumber());
            String message = smsRequset.getMessage();
            MessageCreator creator = Message.creator(to, from, message);
            creator.create();//sending sms
            LOGGER.info("send sms {}" + smsRequset);
        } else {
            throw new IllegalArgumentException("Phone number (" + smsRequset.getPhoneNumber() + " ) is not a valid number ");
        }
        //to verbal com + opt + v
    }

    private boolean isPhoneNumberValid(String phoneNumber) {
        //TODO: implement phone number vakidator
        return true;
    }


}

