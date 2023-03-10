public class Main {
    public static void main(String[] args) {
        int x = 100; //начальный счет
        int y = 1100; //сумма пополнения
        int f = y / 100; //бонус
        int z = y + x; // итоговая сумма

        if (y > 1000) {
            System.out.println("На вашем счету:" + (z + f) + "руб");
        }
        if (y < 1000) {
            System.out.println("На вашем счету:" + z + "руб");
        }
    }
}