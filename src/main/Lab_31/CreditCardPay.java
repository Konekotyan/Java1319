package main.Lab_31;

public class CreditCardPay implements PayStrategy {
    @Override
    public void pay(int sum) {
        System.out.println("Оплата через кредитную карту на сумму: " + sum);
    }
}