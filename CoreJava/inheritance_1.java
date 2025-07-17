class Animal{
    public void walk()
    {
        System.out.println("Animals can walk");
    }
    public void sound()
    {
        System.out.println("Animals can make sounds");
    }
}
class Dog extends Animal{
    public void bark()
    {
        System.out.println("Dog barks");
    }
    public void loyal(){
        System.out.println("Dogs are loyal");
    }
}
public class inheritance_1 {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound();
        a.walk();

        Dog d = new Dog();
        d.bark();
        d.loyal();
        d.walk();
        d.sound();
    }
}
