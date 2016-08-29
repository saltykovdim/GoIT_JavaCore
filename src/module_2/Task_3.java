package module_2;

public class Task_3 {

    public static void main(String[] args) {
        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        String ownerName = "Own";
        double withdrawal = 490;

        int index=-1;
        for (int i=0; i<ownerNames.length; i++){
            if(ownerName.equals (ownerNames[i])){
                index=i;
            }
        }
        double balanceOwnerName=-1;
        for (int i=0; i<balances.length; i++){
            if(index == i){
                balanceOwnerName=balances[i];
            }
        }

        double rest = balanceOwnerName - (withdrawal+withdrawal*5/100);
        if (rest>0){
            System.out.println(ownerName+" "+withdrawal+" "+rest);

        }else{
            System.out.println(ownerName+" NO");
        }

    }
}
