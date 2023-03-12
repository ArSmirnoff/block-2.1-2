public class Main {
    public static void main(String[] args) {
        int startingBalance = 200; //начальный баланс
        int amountDeposit = 200; //сумма пополнения
        int bonus; //бонус

        if (amountDeposit > 1000) {
            bonus = amountDeposit / 100;
        } else {
            bonus = 0;
        }
        int balance = amountDeposit + startingBalance + bonus; //баланс конечный
        System.out.println("На вашем счету:" + balance + "руб");
    }
}