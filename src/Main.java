public class Main {
    public static void main(String[] args) {

        int x = 100; // начальный счёт
        int y = 1100; // сумма пополнения
        int bonus; // Количество бонусов

        if (y >= 1000) {
            bonus = y/100;
        } else {
            bonus = 0;
        }

        int z = x + y + bonus; // Итоговый счёт

        System.out.println("Количество бонусов: " + bonus + " рублей");
        System.out.println("Итоговый счёт: " + z + " рублей");
    }
}