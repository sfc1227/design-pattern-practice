package practice.state;

public class AlertStateContext {
	MobileAlertState currentState;

	public AlertStateContext() {
		currentState = new Vibration(); // default state
	}

	public void setState(MobileAlertState state) {
		this.currentState = state;
	}

	public void alert() {
		currentState.alert();
	}
}
