
public class Count implements State{
public void Answer(Context context) {
		
		System.out.println("Don't count on it");
		context.setState(this);
	}

}
