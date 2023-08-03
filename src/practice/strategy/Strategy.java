package practice.strategy;

interface Strategy {
	int calculate(int a, int b);

}

class OperationAdd implements Strategy {
	@Override
	public int calculate(int a, int b) {
		return a + b;
	}
}

class OperationSubtract implements Strategy {
	@Override
	public int calculate(int a, int b) {
		return a - b;
	}
}

class OperationMultiply implements Strategy {
	@Override
	public int calculate(int a, int b) {
		return a * b;
	}
}
