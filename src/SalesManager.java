public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public long croppedMiddle() {
        long maxNum = 0;
        long minNum = 0;

        for (int i = 0; i < sales.length; i++) {
            maxNum = Math.max(maxNum, sales[i]);
        }

        for (int i = 0; i < sales.length; i++) {
            minNum = Math.min(minNum, sales[i]);
        }
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }

        long res;
        res = (sum - maxNum - minNum) / sales.length;
        return res;
    }
}