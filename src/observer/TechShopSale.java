package observer;
import java.util.ArrayList;
import java.util.List;

public class TechShopSale implements Subject{
    private List<Observer> observers = new ArrayList<>();
    private int salePercentage;

    public void setSalePercentage(int salePercentage) {
        this.salePercentage = salePercentage;
        notifyObservers();
    }
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(salePercentage);
        }
    }
}
