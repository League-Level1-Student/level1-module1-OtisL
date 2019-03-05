

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField input = new JTextField(20);
	JButton confirm = new JButton();
	JLabel output = new JLabel();
	public static void main(String[] args) {
		new BinaryConverter().Stuff();
	}
	void Stuff() {
		frame.add(panel);
		panel.add(input);
		panel.add(confirm);
		panel.add(output);
		confirm.setText("Convert");
		output.setText("-");
		confirm.addActionListener(this);
		frame.setVisible(true);
		frame.pack();
	}
	String convert(String input) {
        if(input.length() != 8){
            // JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
             return "Enter 8 bits, silly!!!";
        }
        String binary = "[0-1]+";    //must contain numbers in the given range
        if (!input.matches(binary)) {
             //JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
             return "Binary can only contain 1s or 0s, silly!!!";
        }
        try {
             int asciiValue = Integer.parseInt(input, 2);
             char theLetter = (char) asciiValue;
             return "" + theLetter;
        } catch (Exception e) {
             //JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
        	
             return "Enter a binary, silly!!!";
        }
   }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String wut = convert(input.getText());
		output.setText(wut);
		frame.pack();
	}
}
