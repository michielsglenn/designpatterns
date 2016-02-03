
public class Error implements State {
public void Answer(Context context) {
		
		System.out.println("My magical connection is broken, try again later");
		context.setState(this);
	}

}
