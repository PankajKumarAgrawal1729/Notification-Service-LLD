package NotificationService;

import java.util.ArrayList;
import java.util.List;

import NotificationDecorator.INotification;
import NotificationObserverPattern.NotificationObservable;

public class NotificationService {
    private NotificationObservable notificationObservable;
    private static NotificationService instance = null;
    List<INotification> notifications = new ArrayList<>();

    private NotificationService() {
        this.notificationObservable = new NotificationObservable();
    }

    public static NotificationService getInstance() {
        if (instance == null) {
            instance = new NotificationService();
        }
        return instance;
    }

    public NotificationObservable getObservable() {
        return notificationObservable;
    }

    public void sendNotification(INotification notification) {
        notifications.add(notification);
        notificationObservable.setNotification(notification);
    }
}
