package module_4.task_1;


public class BankSystemImpl implements BankSystem {
    private Bank bank;

    public BankSystemImpl() {
        this.bank = bank;
    }

    @Override
    public void withdrawOfUser(User user, int amount) {

        if (user.getBalance()> amount){
            user.setBalance(user.getBalance()-(bank.getCommission(amount)+(double) amount));
        }
    }

    @Override
    public void fundUser(User user, int amount) {


    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {

    }

    @Override
    public void paySalary(User user) {

    }
}
