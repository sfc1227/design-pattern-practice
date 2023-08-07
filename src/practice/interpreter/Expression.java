package practice.interpreter;

public interface Expression {
	public boolean interpret(Context context);
}

class TerminalExpression implements Expression {
	private String data;

	public TerminalExpression(String data) {
		this.data = data;
	}

	@Override
	public boolean interpret(Context context) {
		// ??? // 파싱할 문장에 이 익스프레션의 data가 있는지 검사함
		return context.getResult(data);
	}
}
