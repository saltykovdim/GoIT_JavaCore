package module_2;

public class Task_4 {
    public static void main(String[] args) {
        int[] balances = {1200, 250, 2000, 500, 3200};

        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

        String ownerName = "Oww";
        double withdrawal = 100;
        balanceAfterFunding(ownerNames,ownerName,balances,withdrawal);

    }


    public static void balanceAfterFunding (String array[], String name, int balances[], double withdrawal){
        int index=-1;
        for (int i=0; i<array.length; i++){
            if(name.equals(array[i])){
                index=i;
            }
        }
        for (int i=0; i<balances.length; i++){
            if(index == i){
                balances[i]+=withdrawal;
            }
        }
        System.out.println(name+" "+ balances[index]);
        }

}
