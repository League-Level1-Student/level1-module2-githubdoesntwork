package extra;

import java.awt.image.BufferedImage;

public class Assets {
	private static final int width = 100, height=100;
	public static BufferedImage player, stone, tree, bush;
public static void init() {
	SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/spreadsheet.png"));
player=sheet.crop(0, 0, width, height);
bush=sheet.crop(90, 0, width, height);
stone=sheet.crop(0, 90, width, height);
tree=sheet.crop(90, 90, width, height);
}
}
