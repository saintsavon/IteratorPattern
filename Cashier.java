import java.util.Iterator;
import java.util.*;
  
     
public class Cashier {
	ArrayList<Menu> menus;
     
  
	public Cashier(ArrayList<Menu> menus) {
		this.menus = menus;
	}
   
	public void printMenu() {
		Iterator<?> menuIterator = menus.iterator();
		while(menuIterator.hasNext()) {
			Menu menu = (Menu)menuIterator.next();
			printMenu(menu.createIterator());
		}
	}
   
	void printMenu(Iterator<?> iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = (MenuItem)iterator.next();
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
		}
	}
}  