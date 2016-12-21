import java.util.Scanner;
public class main {
	
	public static void main( String[] args ){
		Scanner keyboard = new Scanner( System.in );
		String input = keyboard.nextLine();
		int inputInteger = 0;
		for ( int i = 0; i<input.length(); i++)
			if (input.substring(i, i+1).contains(" ")){
				inputInteger = Integer.parseInt(input.substring(i+1, input.length()) );
				input = input.substring(0, i);
			}
		System.out.println(input);
		for (int i = input.length()-1; i>=0; i-- )
			System.out.print(input.charAt(i));
		System.out.println();
		System.out.println(input.length());
		System.out.println(inputInteger%10);
	}
}
