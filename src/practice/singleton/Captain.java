package practice.singleton;

class Captain {

	private static Captain instance;

	private Captain() {
	}

	static Captain getCaptain() {
		if (instance == null) {
			instance = new Captain();
		}
		return instance;
	}

	public void sayHello() {
		System.out.println("Caption: hello!");
	}
}
