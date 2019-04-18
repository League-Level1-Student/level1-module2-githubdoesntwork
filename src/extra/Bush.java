package extra;

import java.awt.image.BufferedImage;

public class Bush extends Tile {

	public Bush(int id) {
		super(Assets.bush, id);
	}
	@Override
	public boolean isSolid() {
		return true;
	}

}
