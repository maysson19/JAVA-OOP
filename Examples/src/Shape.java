// Abstract
//Abstract class: Shape

abstract class Shape {
    // Abstract method without implementation
    abstract double calculateArea();

    // Concrete method with implementation
    void displayInfo() {
        System.out.println("This is a shape.");
    }
}

// Subclass: Circle (inherits from Shape)
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Subclass: Rectangle (inherits from Shape)
class Rectangle extends Shape {
    double width;
    double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return width * height;
    }
}


