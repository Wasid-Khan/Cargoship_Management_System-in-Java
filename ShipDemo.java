import java.util.*;
public class ShipDemo 
{
	public static void main(String[] args)
	{

		Ship[] ships = new Ship[5];
		
		ships[0] = new CargoShip("Alexndra", "1990",40000);
		ships[1] = new CruiseShip("Love Bird", "1980",2000);
		ships[2] = new CruiseShip("Submarine", "2000",4500);
		ships[3] = new CargoShip("Love Bird2", "1980",55000);
		ships[4] = new CargoShip("Submarine2", "2000",63000);	
		
		for (int i = 0; i < ships.length; i++) 
			{
		  System.out.println(ships[i].toString());
			}

	}
}