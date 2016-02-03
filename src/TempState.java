
public class TempState implements State {
	 private State state;
	 private static TempState instance = new TempState();
	 private TempState(){
		 
		 
	 }
	 public static TempState getInstance(){
	      return instance;
	   }
	public void Answer(Context context) {

	}
	public void setState(State state){
	      this.state = state;		
	   }

	   public State getState(){
	      return state;
	   }

}
