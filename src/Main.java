
public class Main extends Work{

	public static void main(String[] args) {
		int a  = 0;	
		while (a != 5){
			System.out.println("Welcome to the grading program.");
			System.out.println("Choose an option:");
			System.out.println("1. Convert numeric grade into letter grade.");
			System.out.println("2. Add weighted grade to course.");
			System.out.println("3. Return sum of all weighted grades inputted. (Also clears all grades to recalculate with new values for new class)");
			System.out.println("4. Convert letter grade into value on 4.0 GPA scale.");
			System.out.println("5. Exit program.");
			a = input.nextInt();
			input.nextLine();
			if(a == 1){
				System.out.println(GradeScale());
			} 
			else if(a == 2){
				System.out.println(WeightedGrade());
			}
			else if(a == 3){
				System.out.println(TotalGrade());
			}
			else if(a == 4){
				System.out.println(GPAScale());
			}
			else if(a == 5){
				a = 5;
			} else {
				System.out.println("Invalid input:");
			}
		}
	}
}
