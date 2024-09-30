//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        StockGrabber stockGrabber = new StockGrabber();
        StockObserver observer1 = new StockObserver(stockGrabber);

        stockGrabber.setIbmPrice(223.43);
        stockGrabber.setApplPrice(227.52);
        stockGrabber.setGoogPrice(163.83);
    }
}