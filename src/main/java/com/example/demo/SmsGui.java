//package com.example.demo;
//
//import com.vaadin.flow.component.Component;
//import com.vaadin.flow.component.button.Button;
//import com.vaadin.flow.component.orderedlayout.VerticalLayout;
//import com.vaadin.flow.component.textfield.TextField;
//import com.vaadin.flow.router.Route;
//import org.springframework.beans.factory.annotation.Autowired;
//
//@Route
//public class SmsGui extends VerticalLayout {
//
//    private TextField textFieldNumber;
//    private TextField textFieldMessage;
//    private Button buttonSendSms;
//
//    @Autowired
//    public SmsGui(TwilioSmsSender twilioSmsSender) {
//
//        textFieldNumber = new TextField();
//        textFieldMessage = new TextField();
//        buttonSendSms = new Button("Send sms ! ! ! ");
//        add(textFieldNumber, textFieldMessage,buttonSendSms);
//
//        buttonSendSms.addClickListener(buttonClickEvent -> twilioSmsSender.sendSms(textFieldNumber.getValue(), textFieldMessage.getValue()));
//
//    }
//
//}
