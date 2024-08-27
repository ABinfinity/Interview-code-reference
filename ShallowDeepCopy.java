// Java program to illustrate the difference between shallow
// and deep copy
import java.util.ArrayList;

// Class of Car
class ShallowDeepCopy {
    public String name;
    public ArrayList<String> colors;

    public ShallowDeepCopy(String name, ArrayList<String> colors)
    {
        this.name = name;
        this.colors = colors;
    }
    public static void main(String[] args)
    {
        // Create a Honda car object
        ArrayList<String> hondaColors = new ArrayList<>();
        hondaColors.add("Red");
        hondaColors.add("Blue");
        ShallowDeepCopy honda = new ShallowDeepCopy("Honda", hondaColors);

        // Deep copy of Honda
        ShallowDeepCopy deepcopyHonda = new ShallowDeepCopy(
            honda.name, new ArrayList<>(honda.colors));
        deepcopyHonda.colors.add("Green");
        System.out.print("Deepcopy: ");
        for (String color : deepcopyHonda.colors) {
            System.out.print(color + " ");
        }
        System.out.println("\nOriginal: ");
        for (String color : honda.colors) {
            System.out.print(color + " ");
        }
        System.out.println();

        // Shallow Copy of Honda
        ShallowDeepCopy copyHonda = honda;
        copyHonda.colors.add("Green");
        System.out.print("Shallow Copy: ");
        for (String color : copyHonda.colors) {
            System.out.print(color + " ");
        }
        System.out.println("\nOriginal: ");
        for (String color : honda.colors) {
            System.out.print(color + " ");
        }
        System.out.println();
    }
}


// Expected Output

// Deepcopy: Red Blue Green 
// Original: Red Blue 

// Shallow Copy: Red Blue Green 
// Original: Red Blue Green 
