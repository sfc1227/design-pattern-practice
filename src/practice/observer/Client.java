package practice.observer;

public class Client {
    public static void main(String[] args) {
        NumberGenerator generator = new RandomNumberGenerator();

        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();

        generator.addObserver(observer1);
        generator.addObserver(observer2);

        for(int i = 0; i < 20; i++)
          generator.execute();

        generator.deleteObserver(observer1);
        
        for(int i = 0; i < 20; i++)
        generator.execute();
    }
}
