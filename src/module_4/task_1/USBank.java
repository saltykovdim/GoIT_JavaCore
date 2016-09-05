package module_4.task_1;


public class USBank extends Bank{
    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    int getLimitOfWithdrawal() {
        //1000 if currency is USD and 1200 if currency is EUR
        int result = 0;
        if (getCurrency().equals(Currency.USD)){
            result=1000;
        }else if(getCurrency().equals(Currency.EUR)){
            result=1200;
        }
        return result;
    }

    @Override
    int getLimitOfFunding() {
        int result = 0;
        if (getCurrency().equals(Currency.EUR)){
            result= 10000;
        }else if(getCurrency().equals(Currency.USD)){
            //
        }
        return result;
    }

    @Override
    double getMonthlyRate() {
        //monthly rate - 1% with USD and 1.5% with EUR
        double result = 0;
        if (getCurrency().equals(Currency.USD)){
            result = 1;
        }else if(getCurrency().equals(Currency.EUR)){
            result = 1.5;
        }

        return result;
    }

    @Override
    int getCommission() {
        int result=0;
        if (getCurrency().equals(Currency.USD)) {
            if(getTotalCapital() < 1000 && getTotalCapital()==1000){
                result = 5;
            }else if (getTotalCapital()>1000){
                result=7;
            }
        }else if(getCurrency().equals(Currency.EUR)){
            if(getTotalCapital()< 1000 && getTotalCapital()==1000){
                result=6;
            }else if(getTotalCapital()>1000){
                result=8;
            }
        }
        return result;
    }

    @Override
    double moneyPaidMonthlyForSalary() {
        long result = (long)getAvrSalaryOfEmployee()+getTotalCapital();
        setTotalCapital(result);
        return result;
    }
}
