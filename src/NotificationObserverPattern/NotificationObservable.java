package NotificationObserverPattern;

import java.util.ArrayList;
import java.util.List;

import NotificationDecorator.INotification;

public class NotificationObservable implements IObservable {
    private List<IObserver> observers = new ArrayList<>();
    private INotification notification;

    @Override
    public void addObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (IObserver observer : observers) {
            observer.update();
        }
    }

    public void setNotification(INotification notification) {
        this.notification = notification;
        notifyObservers();
    }

    public INotification getNotification() {
        return notification;
    }

    public String getNotificationContent() {
        return notification != null ? notification.getContent() : "No notification set.";
    }

}
