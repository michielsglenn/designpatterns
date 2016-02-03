
public class Nothing implements State {
public void Answer(Context context) {
		
		System.out.println("Nothing");
		context.setState(this);
	}

}
