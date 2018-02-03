package samples;

import java.util.Scanner;

public class ObjectArray {
    private static Dog[] dogs = new Dog[0];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Dog 1");
        System.out.print("Enter dog name: ");
        String dogName = in.nextLine();
        Dog newDog = new Dog(dogName);
        dogs = addToArray(dogs, newDog);

        System.out.println("Dog 2");
        System.out.print("Enter dog name: ");
        String dogName2 = in.nextLine();
        Dog newDog2 = new Dog(dogName2);
        dogs = addToArray(dogs, newDog2);

        System.out.println("--------------------------------------------------");
        for (int i = 0; i < dogs.length; i++) {
            System.out.println("Dog is " + dogs[i].getName());
        }
    }

    public static Dog[] addToArray(Dog[] array, Dog newElement) {
        Dog[] newArray = new Dog[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[newArray.length - 1] = newElement;
        return newArray;
    }
}
