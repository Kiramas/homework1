public class Main {
    public static void main(String[] args) {
        long[] number = {200, 300, 400};
        SalesManager salesManager = new SalesManager(number);
        System.out.println("Максимум на сегодня " + salesManager.max());
        System.out.println("Обрезанное среднее: " + salesManager.croppedMiddle());
    }
}
