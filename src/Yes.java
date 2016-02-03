
public class Yes implements State {
public void Answer(Context context) {
		
		System.out.println("Yes");
		context.setState(this);
	}

}
