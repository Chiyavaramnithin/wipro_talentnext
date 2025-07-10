package oops_inheritance;

public class AnimalTest {

    
    class Animal {
        public void eat() {
            System.out.println("Animal is eating");
        }

        public void sleep() {
            System.out.println("Animal is sleeping");
        }
    }

    class Bird extends Animal {
        public void fly() {
            System.out.println("Bird is flying");
        }

   
        public void eat() {
            System.out.println("Bird is pecking at food");
        }

        public void sleep() {
            System.out.println("Bird is sleeping on a tree");
        }
    }

    public static void main(String[] args) {
        AnimalTest obj = new AnimalTest();
        Animal a = obj.new Animal();
        a.eat();
        a.sleep();

        System.out.println("----");

        Bird b = obj.new Bird();
        b.eat();
        b.sleep();
        b.fly();
    }
}