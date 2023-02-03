package oscar.learning.ch4;

public class GoodDogTestDrive {

    public static void main(String[] args) {

        GoodDog one = new GoodDog();
        one.setSize(70);
        GoodDog two = new GoodDog();
        two.setSize(8);

        System.out.println("Dog one is size " + one.getSize());
        System.out.print("Its barking sounds like ");
        one.bark();
        System.out.println();

        System.out.println("Dog one is size " + two.getSize());
        System.out.print("Its barking sounds like ");
        two.bark();

    }

}