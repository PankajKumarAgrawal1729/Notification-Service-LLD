import NotificationDecorator.INotification;
import NotificationDecorator.SignatureDecorator;
import NotificationDecorator.SimpleNotification;
import NotificationDecorator.TimeStampDecorator;
import NotificationObserverPattern.Logger;
import NotificationObserverPattern.NotificationEngine;
// import NotificationObserverPattern.NotificationObservable;
import NotificationObserverPattern.NotificationStrategy.EmailStrategy;
import NotificationObserverPattern.NotificationStrategy.PopUpStrategy;
import NotificationObserverPattern.NotificationStrategy.SmsStrategy;
import NotificationService.NotificationService;

public class App {
    public static void main(String[] args) throws Exception {
        // Create NotificationService.
        NotificationService notificationService = NotificationService.getInstance();

        // Get Observable
        // NotificationObservable notificationObservable = notificationService.getObservable();

        // Create Logger Observer
        Logger logger = new Logger();

        // Create NotificationEngine observers.
        NotificationEngine notificationEngine = new NotificationEngine();

        notificationEngine.addNotificationStrategy(new EmailStrategy("random.person@gmail.com"));
        notificationEngine.addNotificationStrategy(new SmsStrategy("+91 9876543210"));
        notificationEngine.addNotificationStrategy(new PopUpStrategy());

        // Add observers to the observable.
        // notificationObservable.addObserver(logger);
        // notificationObservable.addObserver(notificationEngine);

        INotification notification = new SimpleNotification("Your order has been shipped!");
        notification = new TimeStampDecorator(notification);
        notification = new SignatureDecorator(notification, "Customer Care");

        notificationService.sendNotification(notification);
    }
}
