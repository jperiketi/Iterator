
public class FanAction {

	public static void main(String[] args) {
		
		FanContext context = new FanContext();
		FanState fanOnMode = new FanOnMode();
		FanState fanOffMode = new FanOffMode();
		System.out.println("First phase of fan is in:");
		context.setFanState(fanOnMode);
		context.fanAction();
		System.out.println("Second phase of fan is in:");
		context.setFanState(fanOffMode);
		context.fanAction();
	}

}
