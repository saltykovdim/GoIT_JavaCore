package module_4.task_1;


public class ChinaBank extends Bank{
    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        int result = 0;
        switch (getCurrency()){
            case USD: result=100;
                break;
            case EUR: result=150;
                break;
        }
        return result;
    }

    @Override
    int getLimitOfFunding() {
        int result = 0;
        switch (getCurrency()){
            case USD: result = 10000;
                break;
            case EUR: result = 5000;
                break;
        }
        return result;
    }

    @Override
    int getMonthlyRate() {
        int result = 0;
        switch (getCurrency()){
            case USD:result=1;
                break;
            case EUR:result=0;
                break;
        }
        return result;
    }

    @Override
    int getCommission(int summ) {
        int result=0;
        switch (getCurrency()){
            case USD:
                if(summ < 1000 && summ==1000){
                    result = 3;
                }else if (summ>1000){
                    result=5;
                }
                break;

            case EUR:   if(summ< 1000 && summ==1000){
                result=10;
            }else if(summ>1000) {
                result = 11;
            }
                break;
        }
        return result;
    }

}
