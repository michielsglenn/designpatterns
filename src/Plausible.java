
public class Plausible implements State{
public void Answer(Context context) {
		
		System.out.println("Plausible");
		context.setState(this);
	}

}
