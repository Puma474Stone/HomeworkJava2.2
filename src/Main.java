//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.

        int balance = 100;
        int amount = 1100;
        int bonusThreshold = 1000;
        int bonusPerHundred = 1;
        int bonus = 0;

        if (amount > bonusThreshold)
        {
            bonus = (amount / 100 * bonusPerHundred);

        }
        int finalBalance = balance + amount + bonus;

        System.out.println("итоговая сумма на счету " + finalBalance + " RUB" );
        System.out.println("колличество бонусных рублей " + bonus + " RUB");





        }
    }
