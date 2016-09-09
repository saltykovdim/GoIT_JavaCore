package module_4.task_1;


public class Main {
    public static void main(String[] args) {
        Bank first = new USBank(123, "german", Currency.USD, 123, 12.0, 1000, 10000);
        first.getTotalCapital();
        System.out.println(first.getTotalCapital());
        System.out.println();

        Bank second = new USBank(1234, "china", Currency.EUR, 1234, 10, 1100, 11000);
        second.getAvrSalaryOfEmployee();
        System.out.println(second.getAvrSalaryOfEmployee());
        System.out.println();

        Bank third = new EUBank(12345, "ukraine", Currency.USD, 12345, 15.5, 1500, 15000);
        third.getCurrency();
        System.out.println(third.getCurrency());
        System.out.println();

        Bank fourth = new EUBank(123456, "france", Currency.EUR, 12456, 15.6, 1600, 16000);
        fourth.getBankCountry();
        System.out.println(fourth.getBankCountry());
        System.out.println();

        Bank fifth = new ChinaBank(124567, "ukraine", Currency.EUR, 1234567, 15.6, 1700, 17000);
        fifth.getNumberOfEmployees();
        System.out.println(fifth.getNumberOfEmployees());
        System.out.println(fifth.getCommission(10));
        User userB = new User(1, "sdfghj", 10000, 5, "WWM", 10, first);
    }
}
