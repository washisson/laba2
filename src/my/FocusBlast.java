package my;

import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class FocusBlast extends ru.ifmo.se.pokemon.SpecialMove{
	public FocusBlast(){
		super(Type.FLYING, 120, 70);
	}

	@Override
	protected String describe(){
		return "поднимает на воздух противника";
	}
	@Override
	protected void applyOppEffects(ru.ifmo.se.pokemon.Pokemon p){
		if(Math.random() < 0.1)
			p.setMod(Stat.SPECIAL_DEFENSE, -1);
	}
}
