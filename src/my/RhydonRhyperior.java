package my;

import ru.ifmo.se.pokemon.Type;

public class RhydonRhyperior extends my.Rhydon{
	public RhydonRhyperior(){
		this("noname", 1);
	}
	public RhydonRhyperior(String name, int level){
		super(name, level);
		setType(Type.GROUND, Type.ROCK);
		setStats(115, 140, 130, 55, 55, 40);
		addMove(new Facade());
	}
}
