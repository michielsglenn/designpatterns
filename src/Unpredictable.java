
public class Unpredictable implements State {
public void Answer(Context context) {
		
		System.out.println("I cannot predict this at the moment");
		context.setState(this);
	}

}
