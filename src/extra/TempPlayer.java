package extra;

public class TempPlayer {
private int x, y;
private boolean left, right, up, down;
public void update() {
	move();
}
public void setL(boolean a) {
	left=a;
}
public void setR(boolean a) {
	right=a;
}
public void setU(boolean a) {
	up=a;
}
public void setD(boolean a) {
	down=a;
}
public int getX() {
	return x;
}
public int getY() {
	return y;
}


public void move() {
	if(left) {
		x=x-2;
	}if(right) {
		x=x+2;
	}if(up) {
		y=y-2;
	}if(down) {
		y=y+2;
	}
}

}
