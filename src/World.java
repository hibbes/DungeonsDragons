
public class World {

	public String canvas;
	public int height;
	public int width;
	public GameField Level1;
	
	public World(String canvas, int height, int width){
		this.canvas = canvas;
		this.height= height;
		this.width= width;
		
		Level1 = new GameField(width, height, canvas);
	}
	
	public void draw(){
			String output=Level1.toString();
			for(int i = 0; i<output.length();i++){
				if(i%Level1.width == 0){System.out.println();}
				
				System.out.print(output.charAt(i));
			}
		
	}
	
}
