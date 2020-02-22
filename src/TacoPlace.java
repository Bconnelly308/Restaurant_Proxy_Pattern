
public class TacoPlace implements Restaurant{

	@Override
	public String getResource(String food) {
		switch (food) {
		case "Supreme Tacos":
			return "You have ordered supreme tacos";
		case "Original Tacos":
			return "You have ordered original tacos";
		case "Nachos":
			return "You have ordered nachos";
		case "Burrito":
			return "You have ordered a burrito";
		default:
			return "Sorry menu item not found";
		}	
		
	}

}