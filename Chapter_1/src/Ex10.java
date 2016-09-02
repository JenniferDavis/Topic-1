public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double km = 14.0;
		double miles = km / 1.6;
		double minutes = 45.0;
		double seconds = 30.0;
		double convertMinutesToHours = minutes / 60;
		double convertSecondsToHours = seconds / 360;
		double hour = convertMinutesToHours + convertSecondsToHours;
		
		System.out.println(" The runner's average speed is " + miles / hour + " mph.");
		
	}

}
