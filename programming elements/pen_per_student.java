package program;

public class pen_per_student {

	public static void main(String[] args) {
		int total=14;
		int students=3;
		int pen_per_student=total/students;
		int remaining =total%students;
		System.out.print("The Pen Per Student is " + pen_per_student+" and the remaining pen not distributed is "+ remaining );

	}

}
