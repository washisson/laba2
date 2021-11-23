package my;

import ru.ifmo.se.pokemon.Type;

public class Dragalge extends my.Skrelp{
	public Dragalge(){
		this("noname", 1);
	}
	public Dragalge(String name, int level){
		super(name, level);
		setType(Type.POISON, Type.DRAGON);
		setStats(65, 75, 90, 97, 123, 44);
		addMove(new ScaryFace());
	}
}
