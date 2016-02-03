
public class Secret implements State{
public void Answer(Context context) {
		
		System.out.println("Its a secret");
		context.setState(this);
	}

}
