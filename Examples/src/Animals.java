//Polymorphism,Overriding

public class Animals {
    void makeSound(){
        System.out.println("Make Sound");
    }

}

class Lion extends Animals{
    @Override
    void makeSound(){
        System.out.println("AAAAAAAAAA");
    }
}