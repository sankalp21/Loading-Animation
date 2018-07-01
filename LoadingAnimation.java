/**
 * 
 * Language used Java
 * Animation Loading Programme
 * Author Sankalp Sinha
 * Try to resize window for viewing animation
 * 
 */



import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LoadingAnimation extends JFrame {
	JPanel panel;
	ImageIcon img;
	JLabel label;
	
	public LoadingAnimation() {
		setVisible(true);
		setSize(700,500);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		img=new ImageIcon(this.getClass().getResource("giphy.gif"));
		
		
		label = new JLabel(img);
		
		label.setBounds(668, 43, 46, 14);
		KeyHandler hand = new KeyHandler();
		this.addKeyListener(hand);
		getContentPane().add(label);
		getContentPane().setBackground(Color.WHITE);
		
		
		
		
	}
public static void main(String args[]) {
	new LoadingAnimation();
}


  public class KeyHandler implements KeyListener {

        public void keyTyped(KeyEvent kt)

        {

           

        }

        public void keyPressed(KeyEvent kp)

        {
        	 
        	System.exit(0);;
           
        }

        public void keyReleased(KeyEvent kr)

        {
       

        }

    }

}


