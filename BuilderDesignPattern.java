// The Builder Design Pattern is a creational design pattern 
// used to construct complex objects step by step. It separates 
// the construction of a complex object from its representation, 
// allowing the same construction process to create different representations.

// Product Class

public class Computer {
    private String CPU;
    private String RAM;
    private String storage;
    private String graphicsCard;

    // Private constructor
    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", RAM='" + RAM + '\'' +
                ", storage='" + storage + '\'' +
                ", graphicsCard='" + graphicsCard + '\'' +
                '}';
    }

    // Builder class
    public static class Builder {
        private String CPU;
        private String RAM;
        private String storage;
        private String graphicsCard;

        public Builder setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        public Builder setRAM(String RAM) {
            this.RAM = RAM;
            return this;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}

// Director Class -- optional

public class ComputerDirector {
    private Computer.Builder builder;

    public ComputerDirector(Computer.Builder builder) {
        this.builder = builder;
    }

    public Computer constructGamingComputer() {
        return builder.setCPU("Intel Core i9")
                      .setRAM("32GB")
                      .setStorage("1TB SSD")
                      .setGraphicsCard("NVIDIA RTX 3080")
                      .build();
    }

    public Computer constructOfficeComputer() {
        return builder.setCPU("Intel Core i5")
                      .setRAM("16GB")
                      .setStorage("512GB SSD")
                      .setGraphicsCard("Integrated Graphics")
                      .build();
    }
}

// Client Code

public class Main {
    public static void main(String[] args) {
        Computer.Builder builder = new Computer.Builder();
        ComputerDirector director = new ComputerDirector(builder);

        // Build a gaming computer
        Computer gamingComputer = director.constructGamingComputer();
        System.out.println("Gaming Computer: " + gamingComputer);

        // Build an office computer
        Computer officeComputer = director.constructOfficeComputer();
        System.out.println("Office Computer: " + officeComputer);
    }
}
