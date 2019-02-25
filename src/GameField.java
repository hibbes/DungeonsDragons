
public class GameField {

	private GameTile[][] Level;
	public int width;
	public int height;
	
	
	public GameField(int width, int height, String level){
		this.width=width;
		this.height=height;
		Level = new GameTile[width][height];
		
		for(int y = 0; y<height;y++){
			for(int x=0;x<width;x++){
			
			switch (level.charAt(x+(y*width))){
				case '#':
					Level[x][y] = new WallTile(); break;
				case ' ':
					Level[x][y] = new EmptyTile(); break;
				case '@':
					Level[x][y] = new DoorTile(); break;
				
				default: System.out.println("Kein bekanntes Zeichen");
			}
			}
		}
	}
	public String toString(){
		String output="";
		for(int i = 0; i<width; i++){
			for(int j = 0; j<height; j++){
				output=output+Level[i][j].toString();
			}
		  }
			
		return output;
	}
}
