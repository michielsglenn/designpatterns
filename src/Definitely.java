
public class Definitely implements State {
public void Answer(Context context) {
		
		System.out.println("Definitely");
		context.setState(this);
	}

}
