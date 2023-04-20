##SMS Gateway using Twilio API
This project is a Spring Boot and Vaadin application that uses Twilio API as an SMS gateway. It allows you to send SMS messages from the web interface to any phone number.

##Getting started
Prerequisites
To run this application, you need to have:


A Twilio account with an active phone number
A Twilio API key and secret

##Installing
Clone this repository to your local machine.
Open the project in your IDE of choice.
Edit the application.properties file to include your Twilio API key, secret, and phone number.
Run the application.

##Configuration
To configure the application, you need to edit the application.properties file. Here are the properties you can configure:

twilio.account.sid: Your Twilio API account SID.
twilio.auth.token: Your Twilio API authentication token.
twilio.phone.number: Your Twilio phone number.

##Usage
To send an SMS message, open the web interface and enter the recipient phone number and message text. Then click the "Send" button.

##Built with
This project was built with:

Spring Boot
Vaadin
Twilio API
