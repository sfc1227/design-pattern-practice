package practice.interpreter;

class Context {
	String input; // 입력 문자열

	public Context(String input) {
		this.input = input;
	}

	// 입력 문자열에 data가 포함되어 있는지 검사하는 메소드
	public boolean getResult(String data) {
		// ???
		return input.contains(data);
	}
}
