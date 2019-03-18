public class GameMain {

	public static void main(String[] args) {
		
		
		Auto auto1 = new Auto("Mercedes_380d", 0.50);
		Rikscha rikscha1 = new Rikscha("Diamont_32b", 0.50);
		auto1.beep();
		rikscha1.beep();
		
		System.out.println(auto1);
		
		World world = new World("###@#####      ##      ####    ##   @   #########  ## @ ###  @######",8,8);
		
	    world.draw();	
	

	}

}
