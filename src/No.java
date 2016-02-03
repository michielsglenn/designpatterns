
public class No implements State{
public void Answer(Context context) {
		
		System.out.println("No");
		context.setState(this);
	}

}
