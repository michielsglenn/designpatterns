
public class Again implements State{
public void Answer(Context context) {
		
		System.out.println("Ask again later");
		context.setState(this);
	}

}
