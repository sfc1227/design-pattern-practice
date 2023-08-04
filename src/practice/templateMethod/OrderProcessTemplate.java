package practice.templateMethod;

abstract class OrderProcessTemplate {
	public boolean isGift;

	public abstract void doSelect();

	public abstract void doPayment();

	public final void giftWrap() {
		System.out.println("Gift wrap successfull");
	}

	public abstract void doDelivery();

	// the actual template method
	public final void processOrder(boolean isGift) {
		doSelect();
		doPayment();

		if (isGift) {
			giftWrap();
		}

		doDelivery();
	}
}

class NetOrder extends OrderProcessTemplate {
	@Override
	public void doSelect() {
		System.out.println("Item added to online shopping cart");
	}

	@Override
	public void doPayment() {
		System.out.println("Online payment");
	}

	@Override
	public void doDelivery() {
		System.out.println("Ship the item");
	}
}

class StoreOrder extends OrderProcessTemplate {

	@Override
	public void doSelect() {
		System.out.println("Item chosen");
	}

	@Override
	public void doPayment() {
		System.out.println("Counter payment");
	}

	@Override
	public void doDelivery() {
		System.out.println("Item delivered");
	}
}
