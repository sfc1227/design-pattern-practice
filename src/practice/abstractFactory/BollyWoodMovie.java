package practice.abstractFactory;

interface BollyWoodMovie extends Movie {
}

class BollyWoodActionMovie implements BollyWoodMovie {
    @Override
    public String getMovieName() {
        return "Bollywood Action Movie";
    }
}

class BollyWoodComedyMovie implements BollyWoodMovie {
    @Override
    public String getMovieName() {
        return "Bollywood Comedy Movie";
    }
}
