package my;

import ru.ifmo.se.pokemon.Type;

public class Rhydon extends my.Rhyhorn{
	public Rhydon(){
		this("noname", 1);
	}
	public Rhydon(String name, int level){
		super(name, level);
		setType(Type.GROUND, Type.ROCK);
		setStats(105, 130, 120, 45, 45, 40);
		addMove(new WildCharge());
	}
}
