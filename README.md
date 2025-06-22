# Notification Service

A modular Java notification service demonstrating the use of Decorator, Observer, and Strategy design patterns. The system supports extensible notification types and delivery strategies, with logging and notification history.

## Features

- **Decorator Pattern**: Compose notifications with additional features (e.g., timestamp, signature) dynamically.
- **Observer Pattern**: Observers (like loggers) are notified of new notifications.
- **Strategy Pattern**: Easily switch between notification delivery methods (Email, SMS, PopUp, etc.).
- **Singleton Service**: Centralized notification service for managing and dispatching notifications.

## Folder Structure

## Key Classes

- [`NotificationDecorator.INotification`](src/NotificationDecorator/INotification.java): Notification interface with `getContent()`.
- [`NotificationDecorator.SimpleNotification`](src/NotificationDecorator/SimpleNotification.java): Basic notification implementation.
- [`NotificationDecorator.TimeStampDecorator`](src/NotificationDecorator/TimeStampDecorator.java): Adds timestamp to notifications.
- [`NotificationDecorator.SignatureDecorator`](src/NotificationDecorator/SignatureDecorator.java): Adds signature to notifications.
- [`NotificationObserverPattern.IObservable`](src/NotificationObserverPattern/IObservable.java): Observable interface for observer pattern.
- [`NotificationObserverPattern.IObserver`](src/NotificationObserverPattern/IObserver.java): Observer interface.
- [`NotificationObserverPattern.Logger`](src/NotificationObserverPattern/Logger.java): Observer that logs notifications.
- [`NotificationObserverPattern.NotificationEngine`](src/NotificationObserverPattern/NotificationEngine.java): Handles notification strategies.
- [`NotificationObserverPattern.NotificationStrategy.INotificationStrategy`](src/NotificationObserverPattern/NotificationStrategy/INotificationStrategy.java): Strategy interface for sending notifications.
- [`NotificationService.NotificationService`](src/NotificationService/NotificationService.java): Singleton service managing notifications.

## How to Build & Run

1. **Compile:**
   ```sh
   javac -d bin src/**/*.java

2. **Run:**
   ```sh
   java -cp bin App


## Extending the System
- **Add a new notification type**: Implement INotification and decorate as needed.
- **Add a new delivery method**: Implement INotificationStrategy and register it with the engine.
- **Add observers**: Implement IObserver and register with observables.
