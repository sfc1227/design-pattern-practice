package practice.abstractFactory;

interface MovieFactory {
    Movie getMovie(String type);
}

class HollyWoodMovieFactory implements MovieFactory {
    public Movie getMovie(String type)
    {
        if (type.equalsIgnoreCase("action"))
            
        else if (type.equalsIgnoreCase("comedy"))
            

        return null;
    }
}

class BollyWoodMovieFactory implements MovieFactory {

    public Movie getMovie(String type) {
        if(type.equalsIgnoreCase("action"))
            
        else if (type.equalsIgnoreCase("comedy"))
            

        return null;
    }
}

