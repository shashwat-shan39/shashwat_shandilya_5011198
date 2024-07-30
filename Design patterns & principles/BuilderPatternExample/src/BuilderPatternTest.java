public class BuilderPatternTest {
    public static void main(String[] args) {
        // Creating different configurations of Computer using the Builder pattern
        Computer gamingComputer = new Computer.Builder()
                .setCPU("Intel Core i9")
                .setRAM("32GB")
                .setStorage("1TB SSD")
                .setGraphicsCard("NVIDIA RTX 3080")
                .setMotherboard("ASUS ROG Maximus")
                .setPowerSupply("750W")
                .setCaseType("Mid Tower")
                .build();

        Computer officeComputer = new Computer.Builder()
                .setCPU("Intel Core i5")
                .setRAM("16GB")
                .setStorage("512GB SSD")
                .setGraphicsCard("Integrated")
                .setMotherboard("ASUS Prime")
                .setPowerSupply("500W")
                .setCaseType("Mini Tower")
                .build();

        Computer budgetComputer = new Computer.Builder()
                .setCPU("AMD Ryzen 3")
                .setRAM("8GB")
                .setStorage("256GB SSD")
                .setGraphicsCard("Integrated")
                .setMotherboard("Gigabyte B450M")
                .setPowerSupply("400W")
                .setCaseType("Micro Tower")
                .build();

        // Displaying the configurations
        System.out.println("Gaming Computer: " + gamingComputer);
        System.out.println("Office Computer: " + officeComputer);
        System.out.println("Budget Computer: " + budgetComputer);
    }
}
