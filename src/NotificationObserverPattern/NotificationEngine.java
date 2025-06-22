package NotificationObserverPattern;

import java.util.ArrayList;
import java.util.List;

import NotificationObserverPattern.NotificationStrategy.INotificationStrategy;
import NotificationService.NotificationService;

public class NotificationEngine implements IObserver {
    private NotificationObservable notificationObservable;
    List<INotificationStrategy> notificationStrategies = new ArrayList<>();

    public NotificationEngine() {
        this.notificationObservable = NotificationService.getInstance().getObservable();
        this.notificationObservable.addObserver(this);
    }

    public NotificationEngine(NotificationObservable notificationObservable) {
        this.notificationObservable = notificationObservable;
        this.notificationObservable.addObserver(this);
    }

    public void addNotificationStrategy(INotificationStrategy strategy) {
        notificationStrategies.add(strategy);
    }

    @Override
    public void update() {
        for (INotificationStrategy strategy : notificationStrategies) {
            strategy.sendNotification(notificationObservable.getNotificationContent());
        }
    }
    
}
