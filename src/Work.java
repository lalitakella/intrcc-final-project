import java.util.Scanner;
import java.util.ArrayList;

public class Work {
		
		static double grade;
		static double weight;
		static double weightedGrade;
		static double totalGrade;
		static double GPA;
		static char a;
		static String gpa;
		static String response;
		
		public static Scanner input = new Scanner(System.in);
		
		static ArrayList<Double> weightedGrades = new ArrayList<Double>();
		
		public static String GradeScale(){ // decides numerical grade value
			System.out.println("Enter numerical grade to be converted into letter grade:");
			grade = input.nextDouble();
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
		
		public static String WeightedGrade(){ //multiplies grade with weight and divides by 100 to add weighted grade to arraylist
			System.out.println("Enter weight of grade in decimal form (i.e. 10% = 0.1):");
			weight = input.nextDouble();
			totalGrade = 0;
			System.out.println("Enter unweighted grade:");
			grade = input.nextDouble();
			weightedGrade = (weight * grade) / 100;
			weightedGrades.add(weightedGrade);
			response = "Your weighted grade is ";
			return response + weightedGrade + ".";
		}
		public static String TotalGrade(){ //sums all weighted grades
			for(int i = 0; i < weightedGrades.size(); i++){
				totalGrade += weightedGrades.get(i);
			}
			weightedGrades.clear();
			response = "Your total grade is ";
			return response + totalGrade + ".";
			
		}
		public static String GPAScale(){ //decides numerical GPA value
			System.out.println("Enter alphabetical grade for  your class:");
			gpa = input.nextLine();
			gpa = gpa.toUpperCase();
			if (gpa.equals("A")){
			    GPA= 4.00;}
			  else if (gpa.equals("A-")){
			    GPA = 3.67;}
			  else if (gpa.equals("B+")){
			    GPA = 3.33;}
			  else if (gpa.equals("B")){
			   GPA = 3.00;}
			  else if (gpa.equals("B-")){
			    GPA = 2.67;}
			  else if (gpa.equals("C+")){
			    GPA = 2.33;}
			  else if (gpa.equals("C")){
			   GPA = 2.00;}
			  else if (gpa.equals("D+")){
			 GPA = 1.33;}
			  else if (gpa.equals("D")){
			    GPA = 1.00;}
			  else if (gpa.equals("F")){
			    GPA = 0;}
			response = "Your GPA is ";
			return response + GPA + ".";
		}
}
