public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double currentPopulation = 312032486;
		double conversion = 60 * 60 * 24 * 365;
		double births = conversion / 7;
		double deaths = conversion / 13;
		double immigrants = conversion / 45;
		
		double year1 = currentPopulation + (births - deaths + immigrants);
		double year2 = year1 + (births - deaths + immigrants);
		double year3 = year2 + (births - deaths + immigrants);
		double year4 = year3 + (births - deaths + immigrants);
		double year5 = year4 + (births - deaths + immigrants);
		
		System.out.println("Population projection for the next five years: ");
		System.out.println("Year 1: " + year1);
		System.out.println("Year 2: " + year2);
		System.out.println("Year 3: " + year3);
		System.out.println("Year 4: " + year4);
		System.out.println("Year 5: " + year5);
			
		
		
	}

}
