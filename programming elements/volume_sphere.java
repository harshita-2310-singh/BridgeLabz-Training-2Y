package program;


public class volume_sphere {

	public static void main(String[] args) {
		double radius=6378;
		double volumesphere=(4.0/3.0)* Math.PI *radius*radius*radius;
		double cubicmiles=volumesphere*Math.pow(0.621371, 3);
		System.out.print("THe volume of earth in cubic kilometers is " + volumesphere+" and cubicmiles is "+ cubicmiles);
		

	}

}
