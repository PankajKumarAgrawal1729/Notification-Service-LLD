package NotificationObserverPattern.NotificationStrategy;

public class PopUpStrategy implements INotificationStrategy {

    @Override
    public void sendNotification(String message) {
        // Simulate displaying a pop-up notification
        System.out.println("Pop-up notification: " + " - " + message);
    }

}
