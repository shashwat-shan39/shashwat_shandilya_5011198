public class CommandPatternTest {
    public static void main(String[] args) {
        // Create receiver
        Light livingRoomLight = new Light();

        // Create command objects
        Command lightOnCommand = new LightOnCommand(livingRoomLight);
        Command lightOffCommand = new LightOffCommand(livingRoomLight);

        // Create invoker
        RemoteControl remoteControl = new RemoteControl();

        // Turn the light on
        remoteControl.setCommand(lightOnCommand);
        remoteControl.pressButton();

        // Turn the light off
        remoteControl.setCommand(lightOffCommand);
        remoteControl.pressButton();
    }
}
