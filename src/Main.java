public class Main {
    public static void main(String[] args) {
        long[] sales = { 40, 4, 20, 80};
        SalesManager manager = new SalesManager(sales);

        System.out.println("averageValue : " + manager.averageValue());

    }
}
