public class Main {
    public static void main(String[] args) {
        long sales[] = {20, 30, 100, 50, 30};

        SalesManager salesManager = new SalesManager(sales);
        System.out.println("Максимальная продажа: " + salesManager.max());
        System.out.println("Средняя продажа: " + salesManager.average());


    }
}

