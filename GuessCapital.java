import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;

class GuessCapital{
	public static void main(String[]args){
		System.out.println("Welcome to Capital Guess Game!");
		int total = 0;
		int correct = 0;
		try(Scanner scanner = new Scanner(System.in);
		    BufferedReader br = new BufferedReader(new FileReader("C:\\DEV\\App\\git_by_vpp\\data.csv"));){
			
			String line=null;
			while((line=br.readLine())!=null){
				total++;
				
				String[] countryCapital = line.split(",");
				System.out.println("Please enter capital of "+countryCapital[0]);
				String lineEntered= scanner.next();
			
				if(lineEntered.equalsIgnoreCase(countryCapital[1])){
					System.out.println("correct!");
					correct++;
				}else{
					System.out.println("wrong!");
				}
			}
		}catch(Exception e){
		}
		
		System.out.println("Total correctness is "+correct+" of "+total);
	}
}