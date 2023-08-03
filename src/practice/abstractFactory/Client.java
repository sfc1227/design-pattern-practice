package practice.abstractFactory;

public class Client {

    public static void main(String[] args) {
        MovieFactory hollyWoodMovieFactory = new HollyWoodMovieFactory();

        Movie hAction = hollyWoodMovieFactory.getMovie("action");
        Movie hComedy = hollyWoodMovieFactory.getMovie("comedy");

        System.out.println("\nHollyWood movies  are:");
        System.out.println(hAction.getMovieName());
        System.out.println(hComedy.getMovieName());

        MovieFactory bollyWoodMovieFactory = new BollyWoodMovieFactory();

        Movie bAction = bollyWoodMovieFactory.getMovie("action");
        Movie bComedy = bollyWoodMovieFactory.getMovie("comedy");

        System.out.println("\nBollyWood movies  are:");
        System.out.println(bAction.getMovieName());
        System.out.println(bComedy.getMovieName());

    }
}