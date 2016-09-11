package module_4.task_1;


public class Main {
    public static void main(String[] args) {
        BankSystemImpl bank = new BankSystemImpl();

        Bank usBankUsd = new USBank(123, "german", Currency.USD, 123, 12.0, 1000, 10000);
        Bank usBankEur = new USBank(1234, "china", Currency.EUR, 1234, 10, 1100, 11000);
        Bank euBankUsd = new EUBank(12345, "ukraine", Currency.USD, 12345, 15.5, 1500, 15000);
        Bank euBankEur = new EUBank(123456, "france", Currency.EUR, 12456, 15.6, 1600, 16000);
        Bank chinaBankUsd = new ChinaBank(123678, "china", Currency.USD, 51, 123.5, 123465, 123456);
        Bank chinaBankEur = new ChinaBank(124567, "ukraine", Currency.EUR, 1234567, 15.6, 1700, 17000);

        User userB = new User(1, "sdfghj", 10000, 5, "WWM", 10, usBankEur);
        User userA = new User(2, "asdf", 10000, 10, "Google", 15, usBankUsd);
        User userC = new User(3, "kjsdhf", 10000, 15, "YAHOO", 20, euBankUsd);
        User userD = new User(4, "gb", 10000, 20, "EPAM", 25, chinaBankEur);
        User userH = new User(5, "dxcgv", 10000, 20, "Yandex", 30, euBankEur);
        User userG = new User(6, "dsfghn", 10000, 15, "GMail", 35, chinaBankUsd);
        bank.transferMoney(userB, userA, 1000);
        System.out.println(userA.getBalance());
        System.out.println(userB.getBalance());

    }
}
