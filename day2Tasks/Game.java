package day2Tasks;

class Game {
	public void displayInfo() {
		System.out.println("This is a general game");
	}
	class Cricket extends Game{
		@Override
		public void displayInfo() {
			System.out.println("Cricket: A Sport where two teams of 11 players each compete to score runs");
		}
	}
	
	class Football extends Game{
		@Override
		public void displayInfo() {
			System.out.println("Football :A game where two teams of 11 players try to score goals by kicking a ball.");
		}
	}
	class Tennis extends Game{
		@Override
		public void displayInfo() {
			System.out.println("Tennis: A sport played between two players, who use rackets to hit a ball over a net");
		}
	}
	public class TestGame{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game[] games=new Game[5];
		
		games[0] =new Cricket();
		games[1] =new Football();
		games[2] =new Tennis();
		games[3] =new Cricket();
		games[4] =new Football();
		
		for(Game game: games) {
			game.displayInfo();
		}
		

	}
}

}
