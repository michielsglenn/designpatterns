
public class Likely implements State {
public void Answer(Context context) {
		
		System.out.println("Most likely");
		context.setState(this);
	}

}
