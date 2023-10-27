package observer;

public class Customer implements Observer{
    private String name;

    public Customer(String name) {
        this.name = name;
    }
    @Override
    public void update(float salePercentage) {
        System.out.println(name + ", the sale percent now is: " + salePercentage + "%");
    }
}
