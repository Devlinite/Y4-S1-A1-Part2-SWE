package assignment1Part2;

import assignment1.CourseProgramme;
import assignment1.Module;
import assignment1.Student;

public class Test {

	public static void main(String[] args) {
		
		Student s1 = new Student("Harry", 20, 12345678);
		Student s2 = new Student("Jill", 20, 87654321);
		Student s3 = new Student("Gray", 19, 99954321);
		Student s4 = new Student("Jack", 21, 66654321);
		
		Student[] sArr = {s1, s2, s3, s4};
		
		Module math = new Module("Math", 101, sArr);
		Module english = new Module("English", 102, sArr);
		Module irish = new Module("Irish", 103, sArr);
		Module engineering = new Module("Engineering", 104, sArr);
		Module software = new Module("Software", 105, sArr);
		
		Module[] mArr = {math, english, irish, engineering, software};
		
		CourseProgramme mechanicalEngineering = new CourseProgramme("Engineering", mArr);
		
		System.out.println("List of modules in " + mechanicalEngineering.getName() + ":");
		for (Module i : mechanicalEngineering.getModuleList()){
			System.out.println( i.getName());
		}
		
		System.out.println("\nList of student usernames registered to these modules:");
		for (Student i : sArr){
			System.out.println( i.getUsername());
		}
	}
}
