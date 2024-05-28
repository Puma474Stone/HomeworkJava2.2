//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
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
