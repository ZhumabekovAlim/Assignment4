package observer;

public class Main {
    public static void main(String[] args) {
        TechShopSale techShopSale = new TechShopSale();

        Customer customer1 = new Customer("Alim");
        Customer customer2 = new Customer("Aibek");

        techShopSale.addObserver(customer1);
        techShopSale.addObserver(customer2);

        techShopSale.setSalePercentage(10);

        techShopSale.deleteObserver(customer1);

        techShopSale.setSalePercentage(15);
    }
}
