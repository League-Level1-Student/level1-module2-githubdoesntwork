package extra;

public class TempMain {
public static void main(String[] args) {
	TempEngine engine = new TempEngine();
	new Thread(engine).start();
}
}
