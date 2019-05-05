package photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JPanel quizPanel = new JPanel();
quizWindow.add(quizPanel);
		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address”)
String url = "https://upload.wikimedia.org/wikipedia/commons/4/4f/Trader_Joe%27s_Sublime_Ice_Cream_Sandwiches.jpg";

		// 2. create a variable of type "Component" that will hold your image
 Component image;
		// 3. use the "createImage()" method below to initialize your Component
image=createImage(url);
		// 4. add the image to the quiz window
quizPanel.add(image);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String answer = JOptionPane.showInputDialog("What is this?");
		// 7. print "CORRECT" if the user gave the right answer
if (answer.equalsIgnoreCase("Ice cream sandwitch")) {
	JOptionPane.showMessageDialog(null, "Correct!");
}
		// 8. print "INCORRECT" if the answer is wrong
else {JOptionPane.showMessageDialog(null, "Incorrect");}
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
quizPanel
.remove(image);
		// 10. find another image and create it (might take more than one line
		// of code)
String url2 = "https://vignette.wikia.nocookie.net/jackinthebox/images/9/92/MonsterTaco.png/revision/latest?cb=20140626151552";
Component image2;
image2=createImage(url2);
quizPanel.add(image2);
// 11. add the second image to the quiz window
String url3 = "https://images-na.ssl-images-amazon.com/images/I/312cIkdY6SL._SR600%2C315_PIWhiteStrip%2CBottomLeft%2C0%2C35_SCLZZZZZZZ_.jpg";
Component image3;
image3=createImage(url3);
quizPanel.add(image3);
// 12. pack the quiz window
quizWindow.pack();
		// 13. ask another question
String Answer2 = JOptionPane.showInputDialog("What does this mean?");
		// 14+ check answer, say if correct or incorrect, etc.
if (Answer2 .equalsIgnoreCase("Taco Bell")) {
	JOptionPane.showMessageDialog(null, "Correct!");
}
else {JOptionPane.showMessageDialog(null, "Incorrect");}
	return;
	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
