public class EmailHelper {
    EmailAdapter adapter;
    public EmailHelper(EmailAdapter adapter){
        this.adapter = adapter;
    }

    public void sendEmail(String to,String cc,String sub,String body){
        this.adapter.sendEmail(to,cc,sub,body);
    }
}
