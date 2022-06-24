public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int payment = 1100;
        int bonus = payment / 100;

        if ((payment) >= 1000) {
            System.out.println("Ваш баланс:");
            System.out.println(balance + payment + bonus);
            System.out.println("Ваши бонусные рубли:");
            System.out.println(bonus);
        } else {
            System.out.println("Ваш баланс:");
            System.out.println(balance + payment);
            System.out.println("Бонусов нет");
        }
    }
}
