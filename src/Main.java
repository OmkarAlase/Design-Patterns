public class Main {
    public static void main(String[] args) {
        EmailAdapter adapter = new MailGunAdapter();
        EmailHelper helper = new EmailHelper(adapter);
        helper.sendEmail("ad@gmail.com","addf@gmail.com","subject","body");
    }
}