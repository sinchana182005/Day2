package hi;

public interface Cat {
        default void sound(){
            System.out.println("hello");
        }
    }
    interface Dog{
        default void sound(){
            System.out.println("Woof!");
        }
    }
    class Cog implements Cat,Dog{
        public void sound(){
            //ystem.out.println("Some sound");
            Dog.super.sound();
        }
    }
    class Demo{
        public static void main(String[] args){
            Cog cog = new Cog();
            cog.sound();
        }
    }


