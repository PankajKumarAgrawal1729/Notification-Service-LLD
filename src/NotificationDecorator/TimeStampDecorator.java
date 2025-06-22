package NotificationDecorator;

public class TimeStampDecorator extends INotificationDecorator {

    public TimeStampDecorator(INotification notification) {
        super(notification);
    }

    @Override
    public String getContent() {
        return "[" + System.currentTimeMillis() + "] " + notification.getContent();
    }

}
