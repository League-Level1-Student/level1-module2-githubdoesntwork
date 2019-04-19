package extra;

public class Stone extends Tile{
	public Stone(int id) {
		super(Assets.stone, id);
	}
	@Override
	public boolean isSolid() {
		return true;
	}
}
