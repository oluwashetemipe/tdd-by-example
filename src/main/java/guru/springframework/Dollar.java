package guru.springframework;

public class Dollar  {
     private int amount;


    public Dollar(int amount,String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    @Override
    protected String currency() {
        return currency;
    }

    @Override
    public Money times(int multiplier){
//    amount *= multiplier;
    return Money.dollar(amount * multiplier);
    }
    public boolean equals(Object object){
        Money dollar = (Money) object;
        return amount == dollar.amount;
    }
}
