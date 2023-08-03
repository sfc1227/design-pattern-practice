package practice.strategy;

public class Context {
	public int executeStrategy(Strategy strategy, int num1, int num2) {
		return strategy.calculate(num1, num2);
	}
}