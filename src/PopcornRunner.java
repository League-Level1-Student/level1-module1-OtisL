import javax.swing.JOptionPane;

public class PopcornRunner {
	public static void main(String[] args) {
		String flavor = JOptionPane.showInputDialog("Enter a flavor");
		Popcorn chef = new Popcorn(flavor);
		Microwave microwave = new Microwave();
		microwave.putInMicrowave(chef);
		String time = JOptionPane.showInputDialog("Enter a time to cook the popcorn for");
		int time2 = Integer.parseInt(time);
		microwave.setTime(time2);
		microwave.startMicrowave();
	}
}
