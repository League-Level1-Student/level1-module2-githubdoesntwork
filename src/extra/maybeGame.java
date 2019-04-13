package extra;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Color;

import javax.swing.JFrame;

public class maybeGame extends JFrame implements KeyListener  {
int x=200;
	public maybeGame() {
		JFrame frame = new JFrame();
		frame.addKeyListener(this);
		setSize(400,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
public void paint(Graphics g) {
	Graphics g1 = getGraphics();
	g1.setColor(Color.BLACK);
	g1.drawOval(x, 200, 50, 50);
	repaint();
}
public static void main(String[] args) {
	maybeGame game = new maybeGame();
	game.paint(null);
}
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	char ch = e.getKeyChar();
	if (ch == KeyEvent.VK_W) {
        System.out.println("yeet");
    }
	
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
}


	
