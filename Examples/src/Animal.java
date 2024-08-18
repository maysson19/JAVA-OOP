// Inheritance

public class Animal {
    String name;
    int age;
}

class Cat extends Animal{
    String name;
    int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

