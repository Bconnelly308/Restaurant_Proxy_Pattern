import javax.swing.JOptionPane;

public class Order {
	public void sendRequest() {
		String food = JOptionPane.showInputDialog("Enter your item for order: Supreme Tacos, Nachos, Burrito, or Original Tacos");
		String response = this.getEmployees().getResource(food);
		this.loadResponse(response);
	}
	
	private void loadResponse(String response ) {
		System.out.println(response);
	}
	
	private Restaurant getEmployees() {
		return new Ingredients().getFood();
	}

}