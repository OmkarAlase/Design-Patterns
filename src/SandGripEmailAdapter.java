public class SandGripEmailAdapter implements EmailAdapter{
    @Override
    public void sendEmail(String to, String cc, String subject, String body) {
        System.out.println("Sending Email through Sandgrid adapter service");
    }
}
