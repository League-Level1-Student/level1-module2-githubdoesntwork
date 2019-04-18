package extra;

import java.awt.image.BufferedImage;

public class Tree extends Tile{

	public Tree(int id) {
		super(Assets.tree, id);
	}
	@Override
public boolean isSolid() {
	return true;
}
}
