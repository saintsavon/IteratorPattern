import java.util.ArrayList;
import java.util.Iterator;

public class OliveGardenMenu implements Menu {
	ArrayList<MenuItem> menuItems;
 
	public OliveGardenMenu() {
		menuItems = new ArrayList<MenuItem>();
    
		addItem("Chicken Alfredo", 
			"Fettucine pasta topped with our signature alfredo sauce, then topped with tender grilled chicken.", 
			false,
			16.29);
 
		addItem("Shrimp Scampi", 
			"Shrimp sauteed in garlic sauce, topped with asparagus, tomatoes, and angel hair pasta.", 
			false,
			6.99);
 
		addItem("Eggplant Parmigiana",
			"Fried eggplant, topped with homemade marinara and melted mozzarella.",
			true,
			14.29);
 
		addItem("Herb Grilled Salmon",
			"Filet grilled salmon with garlic herb butter, served with parmesan garlic broccoli.",
			false,
			18.49);
	}

	public void addItem(String name, String description,
	                    boolean vegetarian, double price)
	{
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}
 
	public ArrayList<MenuItem> getMenuItems() {
		return menuItems;
	}
  
	public Iterator<MenuItem> createIterator() {
		return menuItems.iterator();
    }
    
}
