package practice.command;

interface Order {
    void execute();
}

class BuyStock implements Order {
    private Stock myStock;

    public BuyStock(Stock someStock) {
        myStock = someStock;
    }

    public void execute() {

    }
}

class SellStock implements Order {
    private Stock myStock;

    public SellStock(Stock someStock){
        this.myStock = someStock;
    }

    public void execute() {

    }
}

