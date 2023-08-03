package practice.singleton;

public class Client {

    public static void main (String [] args) {
        System.out.println("***Singleton Pattern Demo: Bill Pugh ***");

        Captain c1 = Captain.getCaptain();
        c1.sayHello();

        System.out.println("Trying to make another captain:");
        Captain c2 = Captain.getCaptain();
        c1.sayHello();

        if (c1 == c2)
            System.out.println("c1 and c2 are the same instance.\n");

        

        System.out.println("***Singleton Pattern Demo: enum ***");

        CaptainEnum c3 = CaptainEnum.Instance;
        c3.sayHello();
    
        System.out.println("Trying to make another captain:");
        CaptainEnum c4 = CaptainEnum.Instance;
        c4.sayHello();
    
        if (c3 == c4)
            System.out.println("c3 and c4 are the same instance.\n");        

    }
}