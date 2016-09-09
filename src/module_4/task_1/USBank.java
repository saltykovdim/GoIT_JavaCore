package module_4.task_1;

public class USBank extends Bank {
    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public String toString() {
        return "USBank";
    }

    @Override
    int getLimitOfWithdrawal() {
        //1000 if currency is USD and 1200 if currency is EUR
        int result = 0;
        switch (getCurrency()) {
            case USD:
                result = 1000;
                break;
            case EUR:
                result = 1200;
                break;
        }
        return result;
    }

    @Override
    int getLimitOfFunding() {
        int result = 0;
        switch (getCurrency()) {
            case USD:
                result = Integer.MAX_VALUE;
                break;
            case EUR:
                result = 10000;
                break;
        }
        return result;
    }

    @Override
    int getMonthlyRate() {
        //monthly rate - 1% with USD and 1.5% with EUR
        int result = 0;
        switch (getCurrency()) {
            case USD:
                result = 1;
                break;
            case EUR:
                result = 2;
                break;
        }
        return result;
    }

    @Override
    int getCommission(int summ) {
        int result = 0;
        switch (getCurrency()) {
            case USD:
                if (summ < 1000 && summ == 1000) {
                    result = 5;
                } else if (summ > 1000) {
                    result = 7;
                }
                break;

            case EUR:
                if (summ < 1000 && summ == 1000) {
                    result = 6;
                } else if (summ > 1000) {
                    result = 8;
                }
                break;
        }
        return result;
    }

}
