package me.whiteship.designpatterns._02_structure_patterns._10_facade._03_atfer;

public class Client {

    public static void main(String[] args) {
        EmailSettings emailSettings = new EmailSettings();
        emailSettings.setHost("127.0.0.1");

        EmailMessage emailMessage = new EmailMessage();
        emailMessage.setFrom("whiteship@whiteship.me");
        emailMessage.setTo("keesun@whiteship.me");
        emailMessage.setSubject("Test Mail from Java Program");
        emailMessage.setText("message");

        EmailSender emailSender = new EmailSender(emailSettings);
        emailSender.sendEmail(emailMessage);

    }
}
