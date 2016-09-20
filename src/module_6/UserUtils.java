package module_6;

public class UserUtils {
    User[] uniqueUsers(User[] users) {
        return null;
    }

    User[] usersWithContitionalBalance(User[] users, int balance) {
        User user = new User(0, null, null, 0, 0);
        int count = 0;
        int ii = 0;
        for (int i = 0; i < users.length; i++) {
            user = users[i];
            if (user.getBalance() == balance) {
                count = i;
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

    final User[] paySalaryToUsers(User[] users) {
        return null;
    }

    final long[] getUsersId(User[] users) {
        return null;
    }

    User[] deleteEmptyUsers(User[] users) {
        return null;
    }
}
