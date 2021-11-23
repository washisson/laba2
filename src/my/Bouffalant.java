package my;

import ru.ifmo.se.pokemon.Type;

public class Bouffalant extends ru.ifmo.se.pokemon.Pokemon{
	public Bouffalant(){
		this("noname", 1);
	}

	public Bouffalant(String name, int level){
		super(name, level);
		setType(Type.NORMAL);
		setStats(95, 110, 95, 40, 95, 55);
		setMove(new FocusBlast(), new ZenHeadbutt(), new AerialAce(), new Swagger());
	}
}
