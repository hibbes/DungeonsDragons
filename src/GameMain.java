public class GameMain {

	public static void main(String[] args) {
		Position spieler1 = new Position(4,5);
		Position spieler2 = new Position(4,5);
		DoorTile testwand = new DoorTile();
		GameField Level1 = new GameField(8,6,"###@#####      ##      ####    ##   @   #########");
		
		System.out.println(Level1);
	//	System.out.println(spieler1.equals(spieler2));

	}

}
