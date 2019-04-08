package extra;

public class PixelRunner {
public static void main(String[] args) {
	PixelParty party = new PixelParty();
	party.setColor(0, 0, 0);
	party.setRainbow(true);
	party.drawRectangle(100, 50, 50, 600);
	party.drawTriangle(31, 322, 32, 412, 234, 56);
	party.saveImage();
	party.displayImage();
}
}
