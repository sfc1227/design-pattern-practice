package practice.command;

public class Client {
	public static void main(String[] args) {
		// Receiver
		Stock sStock = new Stock();

		// Command
		BuyStock buyStockOrder = new BuyStock(sStock);
		SellStock sellStockOrder = new SellStock(sStock);

		// invoker
		Broker broker = new Broker();
		broker.takeOrder(buyStockOrder);
		broker.takeOrder(sellStockOrder);
		broker.placeOrders();
	}
}
