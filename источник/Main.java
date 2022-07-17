public class Main {
    public static void main(String[] args) throws Exception {
        int balance  = 200; // баланс счета
        int payment = 900; // сумма пополнения

        int bonus; // бонус за каждые 100 руб. пополнения свыше 1000 р.
        if (payment > 1000) {
            bonus = payment / 100;
        }  else {
            bonus = 0;
        }

        int finalBalance = balance + payment + bonus;
        System.out.println("Общий счет: " + finalBalance);
        System.out.println("<Бонус: " + bonus);
    }
