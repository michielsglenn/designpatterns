
public class Think implements State {
public void Answer(Context context) {
		
		System.out.println("The answer lies within the depths of your mind");
		context.setState(this);
	}

}
