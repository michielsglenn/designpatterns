
public class Certain implements State{

	
	public void Answer(Context context) {
		
		System.out.println("It is certain");
		context.setState(this);
	}

}
