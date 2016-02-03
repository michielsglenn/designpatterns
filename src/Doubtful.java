
public class Doubtful implements State {
public void Answer(Context context) {
		
		System.out.println("It is doubtful");
		context.setState(this);
	}

}
