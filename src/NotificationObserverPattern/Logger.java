package NotificationObserverPattern;

import NotificationService.NotificationService;

public class Logger implements IObserver {
    private NotificationObservable notificationObservable;

    public Logger() {
        this.notificationObservable = NotificationService.getInstance().getObservable();
        this.notificationObservable.addObserver(this);
    }

    public Logger(NotificationObservable notificationObservable) {
        this.notificationObservable = notificationObservable;
        this.notificationObservable.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Logger received notification: " + notificationObservable.getNotificationContent());
    }

}
