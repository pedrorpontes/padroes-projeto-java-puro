import java.util.ArrayList;

public class StockGrabber implements Subject {

    public ArrayList<Observer> observers;
    private double ibmPrice;
    private double applPrice;
    private double googPrice;

    public StockGrabber() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void register(Observer newObserver) {
        observers.add(newObserver);
    }


    @Override
    public void unregister(Observer newObserver) {
        int observerIndex = observers.indexOf(newObserver);

        System.out.println("Observer " + (observerIndex + 1) + "deletado");

        observers.remove(observerIndex);

    }


    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(ibmPrice, applPrice, googPrice);
        }
    }

    public void setIbmPrice(double newIbmPrice) {
        this.ibmPrice = newIbmPrice;
        notifyObserver();
    }

    public void setApplPrice(double newApplPrice) {
        this.ibmPrice = newApplPrice;
        notifyObserver();
    }

    public void setGoogPrice(double newGoogPrice) {
        this.ibmPrice = newGoogPrice;
        notifyObserver();
    }
}
