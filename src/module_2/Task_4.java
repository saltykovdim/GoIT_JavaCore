package module_2;

public class Task_4 {
    public static void main(String[] args) {
        int[] balances = {1200, 250, 2000, 500, 3200};

        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

        String ownerName = "Oww";
        double withdrawal = 100;
       System.out.println(ownerName+" "+balanceAfterFunding(ownerNames,ownerName,balances,withdrawal));
    }


    public static double balanceAfterFunding (String array[], String name, int balances[], double withdrawal){
        int index=-1;
        for (int i=0; i<array.length; i++){
            if(name.equals(array[i])){
                index=i;
            }
        }
        return balances[index]+withdrawal;
    }
}
