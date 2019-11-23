class Student {
	String name;
	static String school = "Banku augstskola";

	public static void printText() {
		System.out.print("I'm not a student");
	}

	public static void printString(String teksts) {
		System.out.print(teksts);
	}
}

public class StaticExcample {

	public static void main(String[] args) {
		
		for(String arg: args){
			System.out.println(arg);
		}
		
		Student student = new Student();

		// nevar tikt klāt instances mainīgajam jo esam static metodē
		// System.out.println(Student.name);
		System.out.println(Student.school);

	}

}
