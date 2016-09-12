package module_4.task_1;


public class BankSystemImpl implements BankSystem {
    private Bank bank;

    public BankSystemImpl() {
        this.bank = bank;
    }

    @Override
    public void withdrawOfUser(User user, int amount) {
        if (bank.getCommission(amount) + amount < user.getBalance()) {
            user.setBalance(user.getBalance() - (bank.getCommission(amount) + amount));
        }
    }

    @Override
    public void fundUser(User user, int amount) {
        user.setBalance(user.getBalance() + amount);
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        if (fromUser.getBalance() > amount) {
            fromUser.setBalance(fromUser.getBalance() - amount);
            toUser.setBalance(toUser.getBalance() + amount);
        }
    }

    @Override
    public void paySalary(User user) {
        user.setBalance(user.getBalance() + user.getSalary());
    }

}
