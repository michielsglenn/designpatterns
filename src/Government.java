
public class Government implements State {
public void Answer(Context context) {
		
		System.out.println("That is what they want you to believe");
		context.setState(this);
	}

}
