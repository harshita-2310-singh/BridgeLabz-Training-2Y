package program;
import java.util.*;
public class number_of_handshake {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int numberOfStudents=sc.nextInt();
		int handshake=(numberOfStudents*(numberOfStudents-1))/2;
		System.out.print("Possible handshake "+handshake);

	}

}
