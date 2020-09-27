import java.util.ArrayList;

public class MainMenu {
	public static void main(final String args[]) {
        final OliveGardenMenu oliveGardenMenu = new OliveGardenMenu();
        final SubwayMenu subwayMenu = new SubwayMenu();
        final ArrayList<Menu> menus = new ArrayList<Menu>();
        menus.add(oliveGardenMenu);
        menus.add(subwayMenu);
        final Cashier cashier = new Cashier(menus);
		cashier.printMenu();

	}
}