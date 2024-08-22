public class Main {
    public static void main(String[] args) {

        int startBalance = 100; // начальный счёт
        int accountReplenishment = 1100; // сумма пополнения
        int bonus; // Количество бонусов

        if (accountReplenishment > 1000) {
            bonus = accountReplenishment / 100;
        } else {
            bonus = 0;
        }

        int finalBalance = startBalance + accountReplenishment + bonus; // Итоговый счёт

        System.out.println("Количество бонусов: " + bonus + " рублей");
        System.out.println("Итоговый счёт: " + finalBalance + " рублей");
    }
}