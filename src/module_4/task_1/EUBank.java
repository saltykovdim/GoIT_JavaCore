package module_4.task_1;


public class EUBank extends Bank {
    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        int result = 0;
        switch (getCurrency()) {
            case USD:
                result = 2000;
                break;
            case EUR:
                result = 2200;
                break;
        }
        return result;
    }

    @Override
    int getLimitOfFunding() {
        int result = 0;
        switch (getCurrency()) {
            case USD:
                result = 10000;
                break;
            case EUR:
                result = 20000;
                break;
        }
        return result;
    }

    @Override
    int getMonthlyRate() {
        int result = 0;
        switch (getCurrency()) {
            case USD:
                result = 0;
                break;
            case EUR:
                result = 1;
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
                    result = 2;
                } else if (summ > 1000) {
                    result = 4;
                }
                break;
        }
        return result;
    }


}
