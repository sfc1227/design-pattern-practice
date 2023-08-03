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
    public void doSelect()  {
        
    }

    @Override
    public void doPayment() {
        
    }

    @Override
    public void doDelivery(){
        
    }
}

class StoreOrder extends OrderProcessTemplate {

    @Override
    public void doSelect() {
        
    }

    @Override
    public void doPayment() {
        
    }

    @Override
    public void doDelivery()  {
        
    }
}
