package practice.abstractFactory;

interface HollyWoodMovie extends Movie {
}

class HollyWoodActionMovie implements HollyWoodMovie {
    @Override
    public String getMovieName()
    {
        return "Hollywood Action Movie";
    }
}

class HollyWoodComedyMovie implements HollyWoodMovie {
    @Override
    public String getMovieName()
    {
        return "Hollywood Comedy Movie";
    }
}