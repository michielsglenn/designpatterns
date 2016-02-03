
public class Bet implements State {
public void Answer(Context context) {
		
		System.out.println("Don't bet on it");
		context.setState(this);
	}

}
