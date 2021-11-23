package my;

import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class Swagger extends ru.ifmo.se.pokemon.StatusMove{
	public Swagger(){
		super(Type.NORMAL, 0, 85);
	}

	@Override
	protected String describe(){
		return "строит из себя важную птицу";
	}
	@Override
	protected void applyOppEffects(ru.ifmo.se.pokemon.Pokemon defender){
		ru.ifmo.se.pokemon.Effect.confuse(defender);
		defender.setMod(Stat.ATTACK, 2);
	}
}
