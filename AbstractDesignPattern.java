// The Abstract Factory Design Pattern provides a way to 
// encapsulate a group of individual factories that have a 
// common theme. It helps in creating families of related objects 
// without specifying their concrete classes, promoting consistency and 
// reducing dependencies between code components.

//Abstract Products

public interface Button {
    void paint();
}

public interface Checkbox {
    void paint();
}


// Concrete Products

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Rendering a Windows button.");
    }
}

public class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("Rendering a macOS button.");
    }
}

public class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Rendering a Windows checkbox.");
    }
}

public class MacOSCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Rendering a macOS checkbox.");
    }
}


// Abstract Factory

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}


// Concrete Factories

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}

// Client Code

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }

    public static void main(String[] args) {
        GUIFactory factory;
        
        // Create a Windows UI
        factory = new WindowsFactory();
        Application app = new Application(factory);
        app.paint();

        // Create a macOS UI
        factory = new MacOSFactory();
        app = new Application(factory);
        app.paint();
    }
}


// ## Output 
// Rendering a Windows button.
// Rendering a Windows checkbox.
// Rendering a macOS button.
// Rendering a macOS checkbox.


