// The Observer Design Pattern is a behavioral design pattern 
// that defines a one-to-many dependency between objects, 
// so that when one object (the subject) changes state, 
// all its dependents (observers) are notified and updated automatically.

// Observer Interface

public interface Observer {
    void update(String message);
}


// Subject Interface
import java.util.ArrayList;
import java.util.List;

public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers();
}


// Concrete Subject Class

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        notifyObservers();
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(state);
        }
    }
}


// Concrete Observer Class

public class ConcreteObserver implements Observer {
    private String observerName;

    public ConcreteObserver(String name) {
        this.observerName = name;
    }

    @Override
    public void update(String message) {
        System.out.println(observerName + " received update: " + message);
    }
}


// Main class to Demonstrate the pattern

public class Main {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        Observer observer1 = new ConcreteObserver("Observer 1");
        Observer observer2 = new ConcreteObserver("Observer 2");

        subject.attach(observer1);
        subject.attach(observer2);

        subject.setState("State 1");
        subject.setState("State 2");
    }
}


// OUTPUT:- 

// Observer 1 received update: State 1
// Observer 2 received update: State 1
// Observer 1 received update: State 2
// Observer 2 received update: State 2
