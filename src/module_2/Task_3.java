package module_2;

public class Task_3 {

    public static void main(String[] args) {
        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        String ownerName = "Jane";
        double withdrawal = 490.5;

        int index = -1;
        for (int i = 0; i < ownerNames.length; i++) {
            if (ownerName.equals(ownerNames[i])) {
                index = i;
            }
        }
        double balanceOwnerName = -1;
        for (int i = 0; i < balances.length; i++) {
            if (index == i) {
                balanceOwnerName = balances[i];
            }
        }
        double rest = withdrawBalance(balanceOwnerName, withdrawal);
        if ( rest > 0) {
            System.out.println(ownerName + " " + withdrawal + " " + rest);
        } else {
            System.out.println(ownerName + " NO");
        }


    }

    public static double withdrawBalance(double balance, double withdrawal ) {

        double res = balance - (withdrawal + withdrawal * 5 / 100);
        return res;

    }
}
