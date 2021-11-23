package my;

import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class DoubleTeam extends ru.ifmo.se.pokemon.StatusMove{
	public DoubleTeam(){
		super(Type.NORMAL, 0, 0);
	}

	@Override
	protected String describe(){
		return "использует атаку Double Team";
	}
	@Override
	protected void applySelfEffects(ru.ifmo.se.pokemon.Pokemon p){
		p.setMod(Stat.EVASION, 1);
	}
}
