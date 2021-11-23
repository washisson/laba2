package my;

import ru.ifmo.se.pokemon.Type;

public class Rhyhorn extends ru.ifmo.se.pokemon.Pokemon{
	public Rhyhorn(){
		this("noname", 1);
	}
	public Rhyhorn(String name, int level){
		super(name, level);
		setType(Type.GROUND, Type.ROCK);
		setStats(80, 85, 95, 30, 30, 25);
		setMove(new DoubleTeam(), new Confide());
	}
}
