import javax.swing.JOptionPane;

public class DuckRunner {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("What do you want to name your duck?");
		Duck duck = new Duck(".", 0, name);
		duck.favoriteFood="eruhhghr";
		duck.favoriteFood=JOptionPane.showInputDialog("What is your ducks favorite food?");
		String woo = JOptionPane.showInputDialog("How many friends does your duck have?");
		duck.numberOfFriends=Integer.parseInt(woo);
		duck.quack();
		duck.waddle();
		System.out.println(duck.favoriteFood);
		System.out.println(duck.numberOfFriends);
	}
	
}
