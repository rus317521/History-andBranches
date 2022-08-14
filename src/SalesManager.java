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

    public int min() {
        int min = 1000_000_000;
        for (int sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }


    public int average() {
        int sum = 0;
        int j = 0;
        int maxSale = this.max();
        int minSale = this.min();
        for (int sale : sales) {
            if (sale < maxSale && sale > minSale) {
                sum += sale;
                j += 1;
            }
        }
        return sum / j;
    }

}
