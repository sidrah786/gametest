import java.util.ArrayList;
import java.util.Scanner;

public class TresureChest {
	
	Scanner sc = new Scanner(System.in);

public double north = 40;
		public double east = 30;
        public double  south = 50;
        public double west = 80;

	private ArrayList<Person> personList = new ArrayList<>(); // creates an Arraylist to store all vehicles in the garage

	public ArrayList<Person> getPersonList() { //returning the arraylist for all vehicles
		
		
		 
		
        return personList;
	
	}
	
	
	public void addWatchDevice(Person person) //adding directions to watchdevice
	{
		personList.add(person);
	}

	public void printing() // print
	{
		for(Person person: personList) {  // // vehnicle is a reference for vehiclelist ... for each loop --- calling our vehicle.java into a vehicle variable and connecting it to the  vehicle list
			
			System.out.println("Welcome, Lets play!");
			System.out.println("What are your current cardinal position for south?");
			
			int userSouth = sc.nextInt();
			System.out.println("Good Try! you are " + (south - userSouth) + " miles away");
		
			if (userSouth == 50) {
				System.out.println("Hooray, you have reached your south coordinate location");
				int userWest = sc.nextInt();
				
				System.out.println("Good Try! you are " + (west - userWest) + " miles away");
				
				if (userWest == 80) {
					System.out.println("Hooray, you have reached your west coordinate location");
					int userNorth = sc.nextInt();
					
					System.out.println("Good Try! you are " + (north - userNorth) + " miles away");
					
					if (userNorth == 40) {
						System.out.println("Hooray, you have reached your north coordinate location");
						int userEast = sc.nextInt();
						
						
						
						if (userEast == 30) {
							System.out.println("You made it!");
							
				}
			} 
		}
		 // for means just do this 
		//if means check conditions 
		
		{}
	
	{

		}


}}}}
