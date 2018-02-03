package samples;

public class AddElementToArray {
    public static void main(String[] args) {
        String[] arr = new String[] {"s1", "s2", "s3"};
        printArray(arr);
        System.out.println("------------------------------------------------------------");
        arr = addToArray(arr, "newS");
        printArray(arr);
    }

    public static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(i + " -> ");
            System.out.println(array[i]);
        }
    }

    public static String[] addToArray(String[] array, String newElement) {
        String[] newArray = new String[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[newArray.length - 1] = newElement;
        return newArray;
    }
}
