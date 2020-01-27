package com.example.demo;

import com.twilio.Twilio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TwilioInitialaizer {

    private final static Logger LOGGER = LoggerFactory.getLogger(TwilioInitialaizer.class);

    private final TwilioConfiguration twilioConfiguration;

    @Autowired
    public TwilioInitialaizer(TwilioConfiguration twilioConfiguration) {
        this.twilioConfiguration = twilioConfiguration;
        Twilio.init(
                twilioConfiguration.getAccountSid(),
                twilioConfiguration.getAuthToken()
        );
        LOGGER.info("Twilio initialized ... with accont sid {}", twilioConfiguration.getAccountSid());

    }
}
