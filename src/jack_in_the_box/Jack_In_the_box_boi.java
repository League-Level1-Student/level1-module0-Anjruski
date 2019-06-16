package jack_in_the_box;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Jack_In_the_box_boi implements ActionListener {
	public void showButton() {
	JFrame JF = new JFrame();
	JF.setVisible(true);
	JButton Button = new JButton("Suprise!");
	JF.add(JP);
	JF.pack();
	JP.add(Button);
	JF.pack();
	Button.setVisible(true);
	Button.addActionListener(this);
	}
	private void showPicture(String fileName) { 
	     try {
	          JLabel imageLabel = createLabelImage(fileName);
	          JFrame frame = new JFrame();
	          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	          frame.add(imageLabel);
	          frame.setVisible(true);
	          frame.pack();
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
	private JLabel createLabelImage(String fileName) {
	     try {
	          URL imageURL = getClass().getResource(fileName);
	          if (imageURL == null) {
	               System.err.println("Could not find image " + fileName);
	               return new JLabel();
	          } else {
	               Icon icon = new ImageIcon(imageURL);
	               JLabel imageLabel = new JLabel(icon);
	               return imageLabel;
	          }
	     } catch (Exception e) {
	          System.err.println("Could not find image " + fileName);
	          return new JLabel();
	     }
	}
	JLabel JL = new JLabel();
	JPanel JP = new JPanel();
	int counter = 0;
	@Override
	public void actionPerformed(ActionEvent e) {
		counter++;
		System.out.println(counter);
		if(counter == 5) {
		showPicture("jackInTheBox.png");
		playSound("homer-woohoo.wav");
		}
		
		// TODO Auto-generated method stub
		
	}
	private void playSound(String soundFile) { 
	     try {
	          AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
	          sound.play();
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}


}
