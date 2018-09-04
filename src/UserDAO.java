public class UserDAO {

    public User[] create(User[] users, User user){
        for (User user1 : users) {
            if (user1 == null){
                user1 = user;
                break;
            }
        }
        return users;
    }

    public User read(User[] users, String login){
        for (User user : users) {
            if (user != null && user.getLogin().equals(login)){
                return user;
            }
        }
        return null;
    }

    private int readIndexById(User[] users, int id){
        for (int i = 0; i <users.length ; i++) {
            if(users[i] != null && users[i].getId() == id){
                return i;
            }
        }
        return -1;
    }

    public User [] update(User[] users, User user){
        int index = readIndexById(users,user.getId());
        if(index != -1){
            users[index] = user;
        }
        return users;
    }

    public User[] delete(User[] users, User user){
        int index = readIndexById(users,user.getId());
        if(index != -1){
            users[index] = null;
        }
        return users;
    }
}
