public final class ImmutableClass {
    // Step 1: Declare fields as private and final
    private final String name;
    private final int age;

    // Step 2: Initialize fields via the constructor
    public ImmutableClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Step 3: Provide getter methods to access field values
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Optional: Override toString() for better readability
    @Override
    public String toString() {
        return "ImmutableClass{name='" + name + "', age=" + age + "}";
    }

    // Step 4: No setter methods or methods that modify the state
    // No other methods that alter the fields' values are provided

    // Main method to demonstrate the usage of the ImmutableClass class
    public static void main(String[] args) {
        // Create an instance of ImmutableClass
        ImmutableClass person = new ImmutableClass("Alice", 30);

        // Access the fields via getter methods
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Print the person object using toString()
        System.out.println(person);
    }
}
