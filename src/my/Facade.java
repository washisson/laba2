package my;

import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Type;

public class Facade extends ru.ifmo.se.pokemon.PhysicalMove{
	public Facade(){
		super(Type.NORMAL, 70, 100);
	}

	@Override
	protected String describe(){
		return "подавляет противника своим фасадом";
	}
	@Override
	protected double calcBaseDamage(ru.ifmo.se.pokemon.Pokemon att, ru.ifmo.se.pokemon.Pokemon def){
		double damage = super.calcBaseDamage(att, def);
		if(att.getCondition() == Status.BURN || att.getCondition() == Status.POISON || att.getCondition() == Status.PARALYZE)
			damage *= 2;
		return damage;
	}
}
