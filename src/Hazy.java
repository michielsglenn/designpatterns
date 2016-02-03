
public class Hazy implements State {
public void Answer(Context context) {
		
		System.out.println("My vision is hazy, try again later");
		context.setState(this);
	}

}
