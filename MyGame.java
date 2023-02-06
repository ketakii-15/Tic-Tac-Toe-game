package game.ketaki;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.awt.BorderLayout;
public class MyGame extends JFrame {
	MyGame()
	{
		System.out.println("Creating Instance of a game !!!");
		setTittle("My tic tack toe game");
		setSize(800,800);
		ImageIcon=new ImageIcon("src/tittle.jpg");
		setIconImage(icon.getImage());
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createGUI();
		setVisible (true);
	}
	private void createGUI() {
		this.setLayout(new BorderLayout());
	}

}
