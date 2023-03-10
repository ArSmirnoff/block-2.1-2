public class Main {
    public static void main(String[] args) {
        int balance = 200; //начальный счет
        int amountDeposit = 1100; //сумма пополнения
        int bonus; //бонус

        if (amountDeposit > 1000) {
            bonus= amountDeposit / 100;
        } else  {
            bonus= 0;
        }
        int z = amountDeposit + balance + bonus;
        System.out.println("На вашем счету:" + z + "руб");
    }
}