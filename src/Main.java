public class Main {
    public static void main(String[] args) {

        int startAmount = 100;  //начальная сумма на балансе
        int amountIn = 1001;     //сумма пополнения
        int amountBonus = amountIn / 100;  //расчёт бонуса
        int amountFinish;       //итоговый счёт на балансе
        if (amountIn > 1000) {
            amountFinish = (startAmount + amountIn + amountBonus);
            System.out.println("Итоговая сумма на счёте " + amountFinish);
            System.out.println("Сумма бонусов " + amountBonus);
        } else {
            amountFinish = (startAmount + amountIn);
            System.out.println("Итоговая сумма на счёте " + (amountFinish));
            System.out.println("Сумма бонусов 0");
        }

    }
}
