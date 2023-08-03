package practice.command;

public class Stock {
    private String name = "삼성전자";
    private int quantity = 100;

    public void buy() {
        System.out.println("Buy Stock: " + name + ", " + quantity + " 주");
    }

    public void sell(){
        String result = String.format("Sell Stock: %s, %d 주", name, quantity);
        System.out.println(result);
    }
}
