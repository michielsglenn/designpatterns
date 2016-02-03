
public class Sources implements State {
public void Answer(Context context) {
		
		System.out.println("My sources say no");
		context.setState(this);
	}

}
