package NotificationDecorator;

public abstract class INotificationDecorator implements INotification {
    protected INotification notification;

    public INotificationDecorator(INotification notification) {
        this.notification = notification;
    }
}
