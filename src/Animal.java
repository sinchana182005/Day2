abstract class Animal {
    //Normal or Concrete Methods
    //Abstract Methods
    void eat() {
        System.out.println("Animals eat some food!");
    }
    //This method cannot have a body
    //It will be implemented in the child classes
    abstract void run();
    }
    class Cat extends Animal {
    @Override
    void run(){
        System.out.println("Cat runs very fast.");
    }
}
class Cheetah extends Animal {
    @Override
    void run() {
        System.out.println("Cheetah runs very fast.");
    }
}
class Demo2{
    public static void main(String[] args){
        Cat cat = new Cat();
        Cheetah cheetah = new Cheetah();
        cat.eat();
        cat.run();
        cheetah.eat();
        cheetah.run();

    }
}