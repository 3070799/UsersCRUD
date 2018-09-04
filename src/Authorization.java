public class Authorization {

    public User authorization(User[] users, String login, String pass){
        for (User user : users) {
            if(user != null && user.getLogin().equals(login) && user.getPass().equals(pass)){
                return user;
            }
        }
        return null;
    }
}
