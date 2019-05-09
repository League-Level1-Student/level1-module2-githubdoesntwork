package extra;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class TempInputManager extends KeyAdapter{
boolean L=false;
boolean R=false;
boolean D=false;
boolean U=false;
	public void setL(boolean l) {
		L = l;
	}
	public void setR(boolean r) {
		R = r;
	}
	public void setD(boolean d) {
		D = d;
	}
	public void setU(boolean u) {
		U = u;
	}
	public TempInputManager() {
		
	}
	public void keyTyped(KeyEvent arg0) {}
		    public void keyPressed(KeyEvent key) {
		    	switch(key.getKeyCode()) {
		    	case KeyEvent.VK_UP:
		    		TempInstance.player.setU(true);
		    		setU(true);
		    		break;
		    	case KeyEvent.VK_DOWN:
		    		TempInstance.player.setD(true);
		    		setD(true);
		    		break;
		    	case KeyEvent.VK_LEFT:
		    		TempInstance.player.setL(true);
		    		setL(true);
		    		break;
		    	case KeyEvent.VK_RIGHT:
		    		TempInstance.player.setR(true);
		    		setR(true);
		    		break;
		    	}
		    }
		    public void keyReleased(KeyEvent key) {
		        switch (key.getKeyCode()) {
		           case KeyEvent.VK_UP:
		        	   TempInstance.player.setU(false);
		        	   U=false;
		                break;
		           case KeyEvent.VK_DOWN:
		              TempInstance.player.setD(false);
		              D=false;
		               break;
		           case KeyEvent.VK_LEFT:
		              TempInstance.player.setL(false);
		              L=false;
		               break;
		           case KeyEvent.VK_RIGHT:
		              TempInstance.player.setR(false);
		              R=false;
		               break;
		        }
		    }
		    public boolean getL() {
		    	return L;
		    }
		    public boolean getR() {
		    	return R;
		    }
		    public boolean getU() {
		    	return U;
		    }
		    public boolean getD() {
		    	return D;
		    }
		    
}
