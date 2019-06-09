package jack_in_the_box;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Jack_In_the_box_boi {
	public void showButton() {
	JFrame JF = new JFrame();
	JF.setVisible(true);
	JButton Button = new JButton("Suprise!");
	JPanel JP = new JPanel();
	JF.add(JP);
	JF.pack();
	JP.add(Button);
	JF.pack();
	Button.setVisible(true);
	}
		

}
