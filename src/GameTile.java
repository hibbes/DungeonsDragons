public class GameTile {

	private String s = "";
	
	private Position position;
	
	public GameTile(Position position){
		this.position = position;
	}
	public GameTile(){
		position= new Position(0,0);;
	}
	
	public String toString(){
		return s;
	}
	
}
