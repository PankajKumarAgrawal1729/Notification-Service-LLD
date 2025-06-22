package NotificationObserverPattern.NotificationStrategy;

public class EmailStrategy implements INotificationStrategy {
    private String email;

    public EmailStrategy(String email) {
        this.email = email;
    }

    @Override
    public void sendNotification(String message) {
        // Simulate sending an email notification
        System.out.println("Sending email to " + email + ": " + message);
    }

}
