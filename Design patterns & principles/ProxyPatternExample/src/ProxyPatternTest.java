public class ProxyPatternTest {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("image1.jpg");
        Image image2 = new ProxyImage("image2.jpg");

        // Image will be loaded from remote server
        image1.display();
        System.out.println();

        // Image will not be loaded from remote server
        image1.display();
        System.out.println();

        // Image will be loaded from remote server
        image2.display();
        System.out.println();

        // Image will not be loaded from remote server
        image2.display();
    }
}
