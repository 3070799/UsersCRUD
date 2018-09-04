public class Main {
    public static void main(String[] args) {

        int lengthArr = 10;
        User[] users = new User[lengthArr];
        Authorization authorization = new Authorization();

        //users[0] = new User("user1", "pass1");
        users[1] = new User("user2", "pass2");

        for (User user : users) {
            if(user != null) {
                System.out.println(user.toString());
            }
        }

        System.out.println(authorization.authorization(users,"user2","pass2"));




    }
}
