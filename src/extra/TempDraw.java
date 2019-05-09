package extra;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class TempDraw{
   JFrame frame;
   Canvas canvas;
   int x;
   int y;
   TempInputManager input = new TempInputManager();

   BufferStrategy bufferStrategy;

   private int WIDTH = 300;
   private int HEIGHT = 300;

   TempDraw(){
      //Makes a new window, with the name " Basic game  ".
      frame = new JFrame("Basic Game");
      JPanel panel = (JPanel) frame.getContentPane();
      panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
      panel.setLayout(null);
      
      canvas = new Canvas();
      canvas.setBounds(0, 0, WIDTH, HEIGHT);
      canvas.setIgnoreRepaint(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.pack();
                             //this will make the frame not re-sizable
      frame.setResizable(false);
      frame.setVisible(true);
                             //this will add the canvas to our frame
      panel.add(canvas);
      canvas.createBufferStrategy(2);
      bufferStrategy = canvas.getBufferStrategy();
                            //This will make sure the canvas has focus, so that it can take input from mouse/keyboard
      canvas.requestFocus();
                             //this will set the background to black
      canvas.setBackground(Color.black);
      // This will add our buttonhandler to our program
      canvas.addKeyListener(new TempInputManager());
      }
   void render() {
      Graphics2D g = (Graphics2D) bufferStrategy.getDrawGraphics();
      g.clearRect(0, 0, WIDTH, HEIGHT);
      render(g);
      g.dispose();
      bufferStrategy.show();
   }
   protected void render(Graphics2D g){
	   Rectangle r2 = new Rectangle(100, 100, 15, 15);
	   Rectangle player = new Rectangle(TempInstance.player.getX(), TempInstance.player.getY(), 15, 15);
	   g.setColor(Color.black);
 	   g.fill(player);
	   g.setColor(Color.red);
	   g.fill(r2);
	   if(player.intersects(r2)) {
		   x=TempInstance.player.getX();
		   y=TempInstance.player.getY();
		   player.setLocation(x, y);
	   }
//	      g.fillRect(TempInstance.player.getX(), TempInstance.player.getY(), 15, 15);
	   }
}