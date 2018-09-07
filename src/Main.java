import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int lengthArr = 10;
        User[] users = new User[lengthArr];
        User user = null;

        users[0] = new User("login1", "pass1");
        users[1] = new User("login2", "pass2");
        users[0].setRoles("admin");
        System.out.println(Arrays.asList(users));


        while (!MenuProgram.theEndProgram){
            while (user == null){
                user = MenuProgram.authorization(users);
            }
            if(user.getRoles().right.equals("admin")){
                while (user != null){
                    users = MenuProgram.menuAdmin(users, user);
                }
            }else  if(user.getRoles().right.equals("client")){
                while (user != null){
                    users = MenuProgram.menuClient(users, user);
                }
            }
        }

    }
}
