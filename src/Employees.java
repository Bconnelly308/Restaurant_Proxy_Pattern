import java.util.Calendar;

public class Employees implements Restaurant {

	@Override
	public String getResource(String food) {
		this.ordRequest(food);
		if(this.isSoldOut(food)) {
			return "This food item is not available";
		}
		Ingredients ingredients = new Ingredients();	
		return ingredients.getRestaurant().getResource(food);
	}
	
	private void ordRequest(String food) {
		System.out.println(Calendar.getInstance().getTime()+" Request for - " + food);	
	}
	private boolean isSoldOut(String food) {
		switch (food) {
		case "Supreme Tacos":
			return false;
		case "Original Tacos":
			return false;
		case "Nachos":
			return true;
		case "Burrito":
			return false;
		default:
			return true;
		}
	}
}