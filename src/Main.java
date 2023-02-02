public class Main {
    public static void main(String[] args) {
        long[] number = {200, 300, 400};
        SalesManager salesManager = new SalesManager(number);
        System.out.println("Максимум на сегодня " + salesManager.max());

        int maxNum = number[0];
        int minNum = number[0];

        for (int i = 1; i < number.length; i++) {
            maxNum = Math.max(maxNum, number[i]);
        }

        for (int i = 1; i < number.length; i++) {
            minNum = Math.min(minNum, number[i]);
        }
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            sum += number[i];
        }

        int res;
        res = (sum - maxNum - minNum) / number.length;
        System.out.println("Обрезанное среднее: " + res);
    }
}
