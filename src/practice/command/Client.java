package practice.command;

public class Client {
    public static void main(String[] args) {
        Stock sStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(sStock);
        SellStock sellStockOrder = new SellStock(sStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
