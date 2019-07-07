package cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class OneCuteBoi implements ActionListener {
	JFrame JF;
	JPanel JP;
	JButton JB1;
	JButton JB2;
	JButton JB3;
	public void run() {
	JF = new JFrame();
	JF.setVisible(true);
	JF.pack();
	JP = new JPanel();
	JF.add(JP);
	JF.pack();
	JB1 = new JButton("Cute Owl");
	JB1.addActionListener(this);
	JB2 = new JButton("Cute Frog");
	JB2.addActionListener(this);
	JB3 = new JButton("Cute Unicorn");
	JB3.addActionListener(this);
	JP.add(JB1);
	JF.pack();
	JP.add(JB2);
	JF.pack();
	JP.add(JB3);
	JF.pack();
}
void showOwl() {
    playVideo("https://www.youtube.com/watch?v=kRnk3vEEMqs");
}

void showFrog() {
    playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
}

void showFluffyUnicorns() {
    playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
}

void playVideo(String videoID) {
    try {
         URI uri = new URI(videoID);
         java.awt.Desktop.getDesktop().browse(uri);
    } catch (Exception e) {
         e.printStackTrace();
    }
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if (e.getSource().equals(JB1)) {
		showOwl();
	}
	if (e.getSource().equals(JB2)) {
		showFrog();
	}
	if (e.getSource().equals(JB3)) {
		showFluffyUnicorns();
	}
}}