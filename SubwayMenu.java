import java.util.Iterator;

public class SubwayMenu implements Menu {
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	MenuItem[] menuItems;
  
	public SubwayMenu() {
		menuItems = new MenuItem[MAX_ITEMS];
 
		addItem("BBQ Rib",
			"Tender pork topped with sweet BBQ sauce, crisp lettuce, onions, and tangy pickles.", false, 8.99);
		addItem("Tuna",
			"Classic tuna sandwich with creamy mayo, topped with your choice of crisp veggies.", false, 7.49);
		addItem("Steak & Cheese",
			"Steak topped with melty cheese, veggies, and your choice of sauce.", false, 12.49);
		addItem("Spicy Italian",
			"Pepperoni and Genoa salami, piled with cheese, veggies, and your favorite sauce.",
			false, 9.99);
		addItem("Black Forest Ham",
			"Black forest ham, topped with veggies and tasty vinaigrette.", false, 7.99);
		addItem("Meatball Marinara",
			"Irresistible marinara topped meatballs, with parmesan cheese, and whatever else you want.",
			false, 10.99);
	}
  
	public void addItem(String name, String description, 
	                     boolean vegetarian, double price) 
	{
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		if (numberOfItems >= MAX_ITEMS) {
			System.err.println("Sorry, menu is full!  Can't add item to menu");
		} else {
			menuItems[numberOfItems] = menuItem;
			numberOfItems = numberOfItems + 1;
		}
	}
 
	public MenuItem[] getMenuItems() {
		return menuItems;
    }
    
	public Iterator<MenuItem> createIterator() {
		return new SubwayMenuIterator(menuItems);
	}
 
}