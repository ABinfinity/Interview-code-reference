// The Prototype Design Pattern is a creational design pattern 
// used to create duplicate objects while keeping performance in mind. 
// The pattern involves creating a new object by copying an existing object, 
// known as the prototype, rather than creating a new instance from scratch.

// NOTE:- The clone here is the SHALLOW COPY of the original.

// Prototype Interface

public interface Prototype {
    Prototype clone();
}

// Concrete Prototype Classes

public class Circle implements Prototype {
    private String color;
    private int radius;

    public Circle(String color, int radius) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    public Prototype clone() {
        return new Circle(this.color, this.radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color='" + color + '\'' +
                ", radius=" + radius +
                '}';
    }
}

public class Rectangle implements Prototype {
    private String color;
    private int length;
    private int width;

    public Rectangle(String color, int length, int width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }

    @Override
    public Prototype clone() {
        return new Rectangle(this.color, this.length, this.width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "color='" + color + '\'' +
                ", length=" + length +
                ", width=" + width +
                '}';
    }
}

// Client Code

public class Main {
    public static void main(String[] args) {
        Circle originalCircle = new Circle("Red", 5);
        Circle clonedCircle = (Circle) originalCircle.clone();

        Rectangle originalRectangle = new Rectangle("Blue", 10, 20);
        Rectangle clonedRectangle = (Rectangle) originalRectangle.clone();

        System.out.println("Original Circle: " + originalCircle);
        System.out.println("Cloned Circle: " + clonedCircle);

        System.out.println("Original Rectangle: " + originalRectangle);
        System.out.println("Cloned Rectangle: " + clonedRectangle);
    }
}

// Expected Output

//Original Circle: Circle{color='Red', radius=5}
//Cloned Circle: Circle{color='Red', radius=5}
//Original Rectangle: Rectangle{color='Blue', length=10, width=20}
//Cloned Rectangle: Rectangle{color='Blue', length=10, width=20}

