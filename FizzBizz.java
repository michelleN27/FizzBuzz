
//Players generally sit in a circle. The player designated to go first says the number "1", and each player thenceforth counts one number in turn. However, any number divisible by three is replaced by the word fizz and any divisible by five by the word buzz. Numbers divisible by both become fizz buzz. A player who hesitates or makes a mistake is eliminated from the game.
import java.util.* ;
 
public class FizzBizz { 


	public static void main(String[] args) {


		ArrayList<String> fizz = new ArrayList<String>();

		//loop for 100 ints 
		for (int i=1; i <= 100; i++ ) {

			//Printing fizz for every num divisible by 3
			if (i % 3 == 0) {
				System.out.print("fizz"+" ");
			}
			//Printing buzz for every num divisible by 5
			else if (i % 5 == 0) {
				System.out.print("buzz"+" ");
			}

			//Printing fizz buzz for every num divisible by 3
			else if (i%15==0) {
				System.out.print("fizz buzz"+" ");
			}
			else 
				System.out.print(i+" ");
		}

	}
}