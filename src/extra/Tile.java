package extra;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Tile {
	public static final int TILEWIDTH=100, TILEHEIGHT=100;
	protected BufferedImage texture;
	protected final int id;
public Tile(BufferedImage texture, int id) {
	this.texture=texture;
	this.id=id;
}
public void tick() {
	
}
public void render(Graphics g, int x,int y) {
	g.drawImage(texture, x, y, TILEWIDTH, TILEHEIGHT, null);
}
public boolean isSolid() {
	return false;
}
public int getId() {
	return id;
}
}
