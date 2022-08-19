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

    public long min() {
        long min = 1000_000_000;
        for (long sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }


    public long average() {
        long sum = 0;
        long j = 0;
        long maxSale = this.max();
        long minSale = this.min();
        for (long sale : sales) {
            if (sale < maxSale && sale > minSale) {
                sum += sale;
                j += 1;
            }
        }
        return sum / j;
    }

}
