import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FortuneiBoi implements ActionListener {
	public void showButton() {
		System.out.println("Button clicked");
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JButton button = new JButton();
		frame.add(button);
		frame.pack();
		button.addActionListener(this);
		button.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int rand = new Random().nextInt(5);
		if (rand == 1) {
			System.out.println("Pick another fortune cookie");
		} else if (rand == 2) {
			System.out.println("This is filled with things you can't pronounce!");
		} else if (rand == 3) {
			System.out.println("life is like a race, every second gets you closer to the finish line.");
		} else if (rand == 4) {
			System.out.println("This is only paper, not a crystal ball.");
		} else {
			System.out.println("I am not a cookie. ( ͡° ͜ʖ ͡°)");
		}
		System.out.println();
		// TODO Auto-generated method stub

	}
}