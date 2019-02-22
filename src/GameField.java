
public class GameField {

	private GameTile[][] Level;
	public int width;
	public int height;
	
	
	public GameField(int width, int height, String level){
		this.width=width;
		this.height=height;
		Level = new GameTile[width][height];
		
		for(int i = 0; i<width;i++){
			for(int j=0;j<height;j++){
			
			switch (level.charAt(i)){
				case '#':
					WallTile walltile = new WallTile();
					Level[i][j] = walltile;break;
				case ' ':
					EmptyTile emptytile = new EmptyTile();
					Level[i][j] = emptytile;break;
				case '@':
					DoorTile doortile = new DoorTile();
					Level[i][j] = doortile;break;
				
				default: System.out.println("Kein bekanntes Zeichen");
			}
			}
		}
	}
	public String toString(){
		String output = null;
		for(int i = 0; i<width; i++){
			for(int j = 0; j<height; j++){
				output=output+Level[i][j].toString();
			}
		//	output=output+'\n';
		}
			
		return output;
	}
}
