public class Main {
    public static void main(String[] args) {
        int[] number = {200, 300, 400};
        SalesManager salesManager = new SalesManager(number);
        System.out.println("Максимум на сегодня " + salesManager.max());
    }
}