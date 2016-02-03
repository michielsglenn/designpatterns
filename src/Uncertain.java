
public class Uncertain implements State {
public void Answer(Context context) {
		
		System.out.println("Of this i am uncertain");
		context.setState(this);
	}

}
