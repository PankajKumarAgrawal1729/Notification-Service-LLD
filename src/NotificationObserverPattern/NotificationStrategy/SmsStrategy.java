package NotificationObserverPattern.NotificationStrategy;

public class SmsStrategy implements INotificationStrategy {
    private String phoneNumber;

    public SmsStrategy(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void sendNotification(String message) {
        // Simulate sending an SMS notification
        System.out.println("Sending SMS to " + phoneNumber + ": " + message);
    }

}
