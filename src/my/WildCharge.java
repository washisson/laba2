package my;

import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class WildCharge extends ru.ifmo.se.pokemon.PhysicalMove{
	public WildCharge(){
		super(Type.ELECTRIC, 90, 100);
	}

	@Override
	protected String describe(){
		return "дико рванулся";
	}
	@Override
	protected void applySelfDamage(ru.ifmo.se.pokemon.Pokemon att, double damage){
		att.setMod(Stat.HP, (int) Math.round(damage / 4));
	}
}
