public class MailGunAdapter implements EmailAdapter{
    @Override
    public void sendEmail(String to, String cc, String subject, String body) {
        System.out.println("Sending mail though mailgun adpter service.");
    }
}
