package my;

import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class Confide extends ru.ifmo.se.pokemon.StatusMove{
	public Confide(){
		super(Type.NORMAL, 0, 0);
	}

	@Override
	protected String describe(){
		return "использует доверчивость противника";
	}
	@Override
	protected void applyOppEffects(ru.ifmo.se.pokemon.Pokemon p){
		p.setMod(Stat.SPECIAL_ATTACK, -1);
	}
}
