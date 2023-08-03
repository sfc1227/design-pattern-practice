package practice.factoryMethod;

public abstract class AnimalStore {
    public abstract Animal GetAnimalType(String type) throws Exception;
}

class DuckStore extends AnimalStore {
    public Animal GetAnimalType(String type) {

    }
}

class TigerStore extends AnimalStore {
    public Animal GetAnimalType(String type) {

    }
}

