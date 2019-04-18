package extra;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageLoader {

	
	public static BufferedImage loadImage(String a) {
		try {
		return ImageIO.read(ImageLoader.class.getResource(a));
		}catch(IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
		return null;
	}
}
