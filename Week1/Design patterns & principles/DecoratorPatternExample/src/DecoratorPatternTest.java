public class DecoratorPatternTest {
    public static void main(String[] args) {
        // Create an EmailNotifier
        Notifier notifier = new EmailNotifier();

        // Decorate it with SMSNotifier and SlackNotifier
        notifier = new SMSNotifierDecorator(notifier);
        notifier = new SlackNotifierDecorator(notifier);

        // Send a notification
        notifier.send("This is a test notification.");
    }
}
