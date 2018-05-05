package test.ThinkinJava.cha7;

class Game{
	Game(int i) {
		// TODO Auto-generated constructor stub
		System.out.println("Game constructor " + i);
	}
}

class BoardGame extends Game{
	BoardGame(int i) {
		// TODO Auto-generated constructor stub
		super(i);
		System.out.println("BoardGame constructor " + i);
	}
}

class Chess extends BoardGame{
	Chess(int i) {
		// TODO Auto-generated constructor stub
		super(i);
		System.out.println("Chess constructor " + i);
	}
}

public class E06_ChessWithoutDefCtor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chess x = new Chess(9);
		System.out.println(x);
	}

}
