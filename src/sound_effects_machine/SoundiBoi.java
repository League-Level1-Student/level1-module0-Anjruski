package sound_effects_machine;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundiBoi implements ActionListener { JFrame JF = new JFrame();
JPanel JP = new JPanel();
JButton JB1 = new JButton();
JButton JB2 = new JButton();
JButton JB3 = new JButton();
JButton JB4 = new JButton();
JButton JB5 = new JButton();
JButton JB6 = new JButton();

public static void main(String[] args) {
	
SoundiBoi bloop = new SoundiBoi();
	bloop.ButtonLayout();
}
public void ButtonLayout() {
	JF.setVisible(true);
	JF.pack();
	JF.add(JP);
	JP.add(JB1);
	JB1.addActionListener(this);
	JP.add(JB2);
	JB2.addActionListener(this);
	JP.add(JB3);
	JB3.addActionListener(this);
	JP.add(JB4);
	JB4.addActionListener(this);
	JP.add(JB5);
	JB5.addActionListener(this);
	JP.add(JB6);
	JB6.addActionListener(this);
	JF.pack();
}
private void playSound(String fileName) {
    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
    sound.play();
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if (e.getSource().equals(JB1)) {
		playSound("sawing-wood-daniel_simon.wav");
	}
	if (e.getSource().equals(JB2)) {
		playSound("sawing-wood-daniel_simon.wav");
	}
	if (e.getSource().equals(JB3)) {
		playSound("sawing-wood-daniel_simon.wav");
	}
	if (e.getSource().equals(JB4)) {
		playSound("sawing-wood-daniel_simon.wav");
	}
	if (e.getSource().equals(JB5)) {
		playSound("sawing-wood-daniel_simon.wav");
	}
	if (e.getSource().equals(JB6)) {
		playSound("sawing-wood-daniel_simon.wav");
	}
}
}
