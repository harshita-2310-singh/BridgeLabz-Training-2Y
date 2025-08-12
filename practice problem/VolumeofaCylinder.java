import java.util.*;
public class VolumeofaCylinder {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int h=sc.nextInt();
		int r=sc.nextInt();
		double volume=Math.PI*r*r*h;
		System.out.print(volume);

	}

}
