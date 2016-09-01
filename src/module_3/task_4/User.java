package module_3.task_4;


public class User {
    public String name;
    public int balance;
    public int monthsOfEmployment;
    public String companyName;
    public int salary;
    public String currency;

    public User(String name, int balance, int monthsOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public void paySalary(){
       setBalance(getBalance()+getSalary());
    }
   public int withdraw(int summ){
        if(summ<1000){
            return summ+summ*5/100;
        }else{
            return summ+summ*10/100;
        }
    }
    public int companyNameLength (String companyName){
        int length=0;
        for (int i=0; i<companyName.length(); i++){
            length = i;
        }
        return length;
    }
    public void monthIncreaser(int addMonth){
        setMonthsOfEmployment(getMonthsOfEmployment()+addMonth);
    }
}
