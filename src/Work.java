import java.util.Scanner;
import java.util.ArrayList;
public class Work {
		double grade;
		double weight;
		double weightedGrade;
		double totalGrade;
		double GPA;
		char a;
		String gpa;
		String response;
		Scanner in = new Scanner(System.in);
		ArrayList<Double> weightedGrades = new ArrayList<Double>();
		public String GradeScale(){ // decides numerical grade value
			System.out.println("Enter numerical grade to be converted into letter grade:");
			grade = in.nextDouble();
			if(grade >= 90){
				a = 'A';
			} 
			else if(grade >= 80){
				a = 'B';
			}
			else if(grade >= 70){
				a = 'C';
			}
			else if (grade >= 65){
				a = 'D';
			} 
			else if(grade >= 0){
				a = 'F';
			}
			response = "Your letter grade is ";
			return response + a + ".";
		}
		public String WeightedGrade(){ //multiplies grade with weight and divides by 100 to add weighted grade to arraylist
			System.out.println("Enter weight of grade in decimal form (i.e. 10% = 0.1):");
			weight = in.nextDouble();
			System.out.println("Enter unweighted grade:");
			grade = in.nextDouble();
			weightedGrade = (weight * grade) / 100;
			weightedGrades.addAll(weightedGrades);
			response = "Your weighted grade is ";
			return response + weightedGrade + ".";
		}
		public String TotalGrade(){ //sums all weighted grades
			for(int i = 0; i < weightedGrades.size(); i++){
				totalGrade += i;
			}
			response = "Your total grade is ";
			return response + totalGrade + ".";
			weightedGrades.clear();
		}
		public String GPAScale(){ //decides numerical GPA value
			System.out.println("Enter alphabetical grade for  your class:");
			gpa = in.nextLine();
			if (gpa == ("A")){
			    GPA= 4.00;}
			  else if (gpa ==("A-")){
			    GPA = 3.67;}
			  else if (gpa ==("B+")){
			    GPA = 3.33;}
			  else if (gpa ==("B")){
			   GPA = 3.00;}
			  else if (gpa == ("B-")){
			    GPA = 2.67;}
			  else if (gpa ==("C+")){
			    GPA = 2.33;}
			  else if (gpa ==("C")){
			   GPA = 2.00;}
			  else if (gpa == ("D+")){
			 GPA = 1.33;}
			  else if (gpa ==("D")){
			    GPA = 1.00;}
			  else if (gpa == ("F")){
			    GPA = 0;}
			response = "Your GPA is ";
			return response + GPA + ".";
		}


}
