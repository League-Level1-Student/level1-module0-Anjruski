package jack_in_the_box;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Jack_In_the_box_boi implements ActionListener {
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
	Button.addActionListener(this);
	}
	
	int counter = 0;
	@Override
	public void actionPerformed(ActionEvent e) {
		counter++;
		System.out.println(counter);
		if(counter == 5) {
			JP.add(jackinthebox.png)
		}
		// TODO Auto-generated method stub
		
	}
		

}
