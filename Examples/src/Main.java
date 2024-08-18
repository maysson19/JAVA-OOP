public class Main {

    public static void main(String[] args) {


        //////////////////////////////////////////////////////
       //Example
        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Member member = new Member("John Doe", 12345);

        book.borrow();
        member.displayInfo();

        /////////////////////////////////////////////////////////
       //Abstract
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);

        circle.displayInfo();
        System.out.println("Circle Area: " + circle.calculateArea());

        rectangle.displayInfo();
        System.out.println("Rectangle Area: " + rectangle.calculateArea());

 ///////////////////////////////////////////////////
        //class and object

        Dog dog1 = new Dog();
        dog1.name="raaft";
        dog1.age=4;

        Dog dog2 = new Dog();
        dog2.name="jeje";
        dog2.age=5;

        dog1.bark();
        dog2.bark();
        ////////////////////
    }
}