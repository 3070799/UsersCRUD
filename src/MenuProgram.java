import java.util.Scanner;

public class MenuProgram {

    public static boolean theEndProgram = false;

    private static String menuAdmin = "c - create \n" +
            "r - read \n" +
            "u - update \n" +
            "d - delete \n" +
            "exit - for finish program";

    private static String menuСlient ="r - read \n" +
            "u - update \n" +
            "exit - for finish program";

    public static User authorization(User[] users){

        String login;
        String pass;
        LoggerUser.d("Authorization", "Enter Data for Authorization");
        LoggerUser.w("", "Enter Login:");
        login = readConsoleValue();
        LoggerUser.w("", "Enter Password:");
        pass = readConsoleValue();

        return Authorization.authorization(users,login,pass);
    }

    public static User [] menuAdmin(User[] users, User user){
        LoggerUser.d(user.getName(), "Main Admin menu \n" + menuAdmin);
        readConsoleValue();

        return users;
    }

    public static User[] menuClient(User[] users, User user){
        LoggerUser.d(user.getName(), "Main Client menu \n" + menuСlient);
        readConsoleValue();

        return users;
    }

    private static String readConsoleValue() {
        String value;
        Scanner scanner = new Scanner(System.in);
        value = scanner.nextLine();
        return value;
    }
}
