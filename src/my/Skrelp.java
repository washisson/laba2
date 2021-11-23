package my;

import ru.ifmo.se.pokemon.Type;

public class Skrelp extends ru.ifmo.se.pokemon.Pokemon{
	public Skrelp(){
		this("noname", 1);
	}

	public Skrelp(String name, int level){
		super(name, level);
		setType(Type.POISON, Type.WATER);
		setStats(50, 60, 60, 60, 60, 30);
		setMove(new Swagger(), new Rest(), new ShadowBall());
	}
}
