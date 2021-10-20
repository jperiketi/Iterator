
public class FanContext implements FanState{

	private FanState fanState;
	

	public FanState getFanState() {
		return this.fanState;
	}


	public void setFanState(FanState fanState) {
		this.fanState = fanState;
	}


	@Override
	public void fanAction() {
		this.fanState.fanAction();		
	}
}
