package module_6;


public class Main {
    public static void main(String[] args) {
        //ArraysUtils array = new ArraysUtils();
        int[] res = {8, 10, 2, 5, 50};
        res = ArraysUtils.reverse(res);
        res = ArraysUtils.findEvenElements(res);
        for (int i = 0; i < res.length; i++) {
       //     System.out.println(res[i]);
        }
        User user1 = new User(1, "last name", "Name", 5000, 1000);
        User user2 = new User(2, "Name","lase namw", 5000, 10000);
        User user3 = new User(3, "Name1", "Name1", 50, 100);
        User[] users = new User[3];
        users[0] = user1;
        users[1] = user2;
        users[2] = user3;



       /* long[] ress=userUtils.getUsersId(users);
        for (int i = 0; i < ress.length; i++) {
            System.out.println(ress[i]);
        }*/
        System.out.println();
        User[] result = UserUtils.uniqueUsers(users);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

}
