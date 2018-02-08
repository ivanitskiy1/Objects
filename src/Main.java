import java.util.Scanner;

public class Main {
    private static String firstName;
    private static String lastName;
    private static String yearOfBorne;
    // yearOfBorn

    public static void main(String[] args) {
        for (; ; ) {
            Scanner in = new Scanner(System.in);
            System.out.print("command> ");
            String command = in.nextLine();
            if (command.equals("exit")) {
                System.exit(0);
            } else if (command.equals("help")) {
                System.out.println("help - правка");
                System.out.println("exit - выход");
                System.out.println("user_add - создать пользователя");
                System.out.println("user_print - список пользователей");
            } else if (command.equals("user_add")) {
                System.out.print("Enter first name: ");
                firstName = in.nextLine();
                System.out.print("Enter last name: ");
                lastName = in.nextLine();
                System.out.print("Enter year of born: ");
                yearOfBorne = in.nextLine();
                public static String[] add_user (String[]add_user, String add_user){
                    String[] newArray = new String[new.length + 1];
                    for (int i = 0; i < add_user.length; i++) {
                        newArray[i] = add_user[i];


                    } else if (command.equals("user_print")) {
                        System.out.println(firstName);
                        System.out.println(lastName);
                        System.out.println(yearOfBorne);
                    } else {
                        System.out.println("Command \"" + command + "\" not found enter \"help\" for more info");
                    }
                }
            }
        }
    }
}