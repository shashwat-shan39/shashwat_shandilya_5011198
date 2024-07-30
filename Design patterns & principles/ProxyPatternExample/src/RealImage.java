public class RealImage implements Image {
    private final String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromRemoteServer();
    }

    private void loadFromRemoteServer() {
        System.out.println("Loading " + fileName + " from remote server...");
        // Simulate loading time
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(fileName + " loaded from remote server.");
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }
}
