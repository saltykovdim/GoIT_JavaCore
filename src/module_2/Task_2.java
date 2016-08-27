package module_2;

public class Task_2 {
    public static void main(String[] args) {
        double balance = 100;
        double withdrawal = 950;
        double comission = 5;
        double res=withdrawBalance(balance,withdrawal);
        if( res>0){
        System.out.println("OK "+ withdrawal*comission/100+" "+res);
        }else{
            System.out.println("NO");
        }
    }
    static double withdrawBalance(double balance, double withdrawal) {
        double res= balance-(withdrawal+withdrawal*5/100);


        return res;
    }
}
