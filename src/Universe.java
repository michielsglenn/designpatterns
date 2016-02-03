
public class Universe implements State{
public void Answer(Context context) {
		
		System.out.println("The Answer is 42 according to the universe");
		context.setState(this);
	}

}
