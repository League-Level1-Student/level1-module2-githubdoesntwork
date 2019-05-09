package extra;

public class TempEngine implements Runnable{
	TempDraw drawing = new TempDraw();
	public void run() {
		while(true) {
			TempInstance.player.update();
			drawing.render();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
