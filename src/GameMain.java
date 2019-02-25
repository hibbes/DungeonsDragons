public class GameMain {

	public static void main(String[] args) {
		Position spieler1 = new Position(4,5);
		Position spieler2 = new Position(4,5);
		DoorTile testwand = new DoorTile();
		
		World world = new World("###@#####      ##      ####    ##   @   #########  ## @ ###  @######",8,8);
		
	    world.draw();	
	

	}

}
