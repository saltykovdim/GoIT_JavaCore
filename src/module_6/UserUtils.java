package module_6;

public class UserUtils {
    static User[] uniqueUsers(User[] users) {

        int count = 0;
        int r = 0;
        for (int i = 0; i < users.length; i++) {
            for (int w = 0; w < users.length; w++) {
                if (!(users[i].equals(users[w]))) {
                    count++;
                }
            }
        }
        User[] result = new User[count];
        for (int i = 0; i < users.length; i++) {
            for (int w = 0; w < users.length; w++) {
                if (!(users[i].equals(users[w]))) {
                    result[r] = users[i];
                    r++;
                }
            }
        }
        return result;
    }

    static User[] usersWithContitionalBalance(User[] users, int balance) {
        User user = new User(0, null, null, 0, 0);
        int count = 0;
        int ii = 0;
        for (int i = 0; i < users.length; i++) {
            user = users[i];
            if (user.getBalance() == balance) {
                count++;
            }
        }
        User[] result = new User[count];
        for (int i = 0; i < users.length; i++) {
            user = users[i];
            if (user.getBalance() == balance) {
                result[ii] = users[i];
                ii++;
            }
        }
        return result;
    }

    static final User[] paySalaryToUsers(User[] users) {
        User user = new User(0, null, null, 0, 0);

        for (int i = 0; i < users.length; i++) {
            user = users[i];
            user.setBalance(user.getSalary() + user.getBalance());
            users[i] = user;
        }
        return users;
    }

    static final long[] getUsersId(User[] users) {
        User user = new User(0, null, null, 0, 0);
        int count = 0;
        long[] result = new long[users.length];
        for (int i = 0; i < users.length; i++) {
            user = users[i];
            result[count] = user.getId();
            count++;
        }
        return result;
    }

    static User[] deleteEmptyUsers(User[] users) {
        User user = new User(0, null, null, 0, 0);
        int count = 0;
        int ii = 0;
        for (int i = 0; i < users.length; i++) {
            user = users[i];
            if (user.getFirstName() != null & user.getLastName() != null) {
                count++;
            }
        }
        User[] result = new User[count];
        for (int i = 0; i < users.length; i++) {
            user = users[i];
            if (user.getFirstName() != null & user.getLastName() != null) {
                result[ii] = users[i];
                ii++;
            }
        }
        return result;
    }
}
