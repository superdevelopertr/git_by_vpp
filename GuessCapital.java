import java.util.Scanner;

class GuessCapital{
	public static void main(String[]args){
		System.out.println("Welcome to Guess Game!");
		
		try(Scanner scanner = new Scanner(System.in)){
			System.out.println("Please enter capital of Turkey");
			String lineEntered= scanner.next();
			if(lineEntered.equalsIgnoreCase("Ankara")){
				System.out.println("correct!");
			}else{
				System.out.println("wrong!");
			}
		}catch(Exception e){
		}
	}
}