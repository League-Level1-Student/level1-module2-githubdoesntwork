package extra;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class S implements KeyListener{
int HP=20, maxHP=20, gold=0;
String a="#########";
String b="#.......#";
String c="#.......#";
String d="#....####";
String e="######";
boolean goldCollected=false;
int x=2, y=2;
JFrame frame= new JFrame();
JLabel rules = new JLabel("Click here and navigate with arrow keys");
public S() {
	
}
public void config() {
	frame.add(rules);
	frame.setVisible(true);
	frame.pack();
	frame.addKeyListener(this);
	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	frame.setResizable(false);
}
public void run() {
	while(true) {
		if(goldCollected==false) {
		a="#########";
		b="#.......#";
		c="#...G...#";
		d="#....####";
		e="######";
		}else {
			a="#########";
			b="#.......#";
			c="#.......#";
			d="#....####";
			e="######";
		}
		if(y==2) {
			if(x==2) {
				b="#@......#";
			}else if(x==3) {
				b="#.@.....#";
			}else if(x==4) {
				b="#..@....#";
			}else if(x==5) {
				b="#...@...#";
			}else if(x==6) {
				b="#....@..#";
			}else if(x==7) {
				b="#.....@.#";
			}else if(x==8) {
				b="#......@#";
			}
		}else if(y==3) {  
			if(goldCollected==false) {
			if(x==2) {
				c="#@..G...#";
			}else if(x==3) {
				c="#.@.G...#";
			}else if(x==4) {
				c="#..@G...#";
			}else if(x==5) {
				c="#...@...#";
				goldCollected=true;
				gold++;
			}else if(x==6) {
				c="#...G@..#";
			}else if(x==7) {
				c="#...G.@.#";
			}else if(x==8) {
				c="#...G..@#";
			}
			}else {
				if(x==2) {
					c="#@......#";
				}else if(x==3) {
					c="#.@.....#";
				}else if(x==4) {
					c="#..@....#";
				}else if(x==5) {
					c="#...@...#";
				}else if(x==6) {
					c="#....@..#";
				}else if(x==7) {
					c="#.....@.#";
				}else if(x==8) {
					c="#......@#";
			}
			}
			}else if(y==4) {
				if(x==2) {
					d="#@...####";
				}else if(x==3) {
					d="#.@..####";
				}else if(x==4) {
					d="#..@.####";
				}else if(x==5) {
					d="#...@####";
				}
				}
		try {
			Thread.sleep(100);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Health: "+HP+"/"+maxHP);
		System.out.println("Gold: "+gold);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}
}
@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		switch(key) {
		case KeyEvent.VK_UP:
			y--;
			if(y<2) {
				y=2;
			}
			break;
		case KeyEvent.VK_DOWN:
		y++;
		if(y==5&&x<6) {
			if(y>4) {
				y=4;
			}
		}else{
			if(x>5&&y>3) {
				y=3;
			}
		}
		break;
		case KeyEvent.VK_LEFT:
			x--;
			if(x<2) {
				x=2;
			}
			break;
		case KeyEvent.VK_RIGHT:
			x++;
			if(y==4) {
				if(x>5) {
					x=5;
				}
			}else {
				if(x>8) {
					x=8;
				}
			}
			break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
