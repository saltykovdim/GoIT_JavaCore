package module_6;


import java.util.Queue;
import java.util.List;
import java.util.PriorityQueue;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArraysUtils array = new ArraysUtils();
        int [] res = {8, 10, 2, 5, 50};
        res=array.reverse(res);
        res=array.findEvenElements(res);
        for (int i=0; i<res.length; i++){
            System.out.println(res[i]);
        }
        User user1 = new User(123, "ferst Name", "last Name", 5000, 100000);
        User user2 = new User(123, "Name", "Name", 500, 10000);
        User[] users = new User[2];
        users[0]=user1;
        users[1]=user2;
        UserUtils userUtils = new UserUtils();
        userUtils.getUsersId(users);
        userUtils.deleteEmptyUsers(users);
        User[] ress = userUtils.paySalaryToUsers(users);
        for (int i=0; i<ress.length; i++) {
            System.out.println(ress[i]);
        }
    }
}
