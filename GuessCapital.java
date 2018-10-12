import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;

class GuessCapital{
	public static void main(String[]args){
		System.out.println("Welcome to Capital Guess Game!");
		
		try(Scanner scanner = new Scanner(System.in);
		    BufferedReader br = new BufferedReader(new FileReader("C:\\DEV\\App\\git_by_vpp\\data.csv"));){
			
			String line=null;
			while((line=br.readLine())!=null){
			
				String[] countryCapital = line.split(",");
				System.out.println("Please enter capital of "+countryCapital[0]);
				String lineEntered= scanner.next();
			
				if(lineEntered.equals(countryCapital[1])){
					System.out.println("correct!");
				}else{
					System.out.println("wrong!");
				}
			}
		}catch(Exception e){
		}
	}
}