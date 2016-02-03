import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class EightBall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		Scanner scan =new Scanner(System.in);
		 Context context = new Context();
		 TempState temp = TempState.getInstance();
		 int[]controle = new int[10] ;
	     
		
		for(int i = 0; i< 10;i++){
			System.out.println("geef je vraag in");
			 String question;
			 question = scan.nextLine();
			 
		int answer = random.nextInt(20);
		if(Arrays.asList(controle).contains(answer)){
			
			answer = random.nextInt(20);
		}
		else{	
			
		
		System.out.println(question);
		 switch (answer){
		 case 0:  temp.setState(new Again()); context.setState(temp.getState());controle[i] = 0; break;
		 case 1:  temp.setState(new Bet()); context.setState(temp.getState());controle[i] = 1; break;
		 case 2:  temp.setState(new Certain()); context.setState(temp.getState());controle[i] = 2; break;
		 case 3:  temp.setState(new Count()); context.setState(temp.getState());controle[i] = 3; break;
		 case 4:  temp.setState(new Definitely()); context.setState(temp.getState());controle[i] = 4; break;
		 case 5:  temp.setState(new Doubtful()); context.setState(temp.getState()); controle[i] = 5;break;
		 case 6:  temp.setState(new Error()); context.setState(temp.getState()); controle[i] = 6;break;
		 case 7:  temp.setState(new Government()); context.setState(temp.getState()); controle[i] = 7;break;
		 case 8:  temp.setState(new Hazy()); context.setState(temp.getState()); controle[i] = 8;break;
		 case 9:  temp.setState(new Likely()); context.setState(temp.getState());controle[i] = 9; break;
		 case 10:  temp.setState(new No()); context.setState(temp.getState()); controle[i] = 10;break;
		 case 11:  temp.setState(new Nothing()); context.setState(temp.getState());controle[i] = 11; break;
		 case 12:  temp.setState(new Plausible()); context.setState(temp.getState());controle[i] = 12; break;
		 case 13:  temp.setState(new Secret()); context.setState(temp.getState());controle[i] = 13; break;
		 case 14:  temp.setState(new Sources()); context.setState(temp.getState());controle[i] = 14; break;
		 case 15:  temp.setState(new Think()); context.setState(temp.getState()); controle[i] = 15;break;
		 case 16:  temp.setState(new Uncertain()); context.setState(temp.getState());controle[i] = 16; break;
		 case 17:  temp.setState(new Universe()); context.setState(temp.getState()); controle[i] = 17;break;
		 case 18:  temp.setState(new Unpredictable()); context.setState(temp.getState());controle[i] = 18; break;
		 case 19:  temp.setState(new Yes()); context.setState(temp.getState());controle[i] = 19; break;
		 
		 }
		 context.getState().Answer(context);
		 }
		}
	
	
	}

}
