import java.util.Scanner;
public class main {
	
	public static void main( String[] args ){
		String input = "";
		for(int i = 0; i < args.length; i++){
			input += args[i];
		}
		int inputInteger = 0;
		for ( int i = 0; i<input.length(); i++)
			if (Character.isDigit(input.charAt(i))){
				inputInteger = Integer.parseInt(input.substring(i, input.length()) );
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
