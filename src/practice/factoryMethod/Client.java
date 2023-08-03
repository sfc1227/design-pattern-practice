package practice.factoryMethod;

public class Client {
	public static void main(String[] args) throws Exception {
		AnimalStore duckStore = new DuckStore();
		AnimalStore tigStore = new TigerStore();

		duckStore.GetAnimalType("").Speak();
		tigStore.GetAnimalType("").Speak();
	}
}
