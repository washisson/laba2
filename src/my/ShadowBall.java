package my;

import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class ShadowBall extends ru.ifmo.se.pokemon.SpecialMove{
	public ShadowBall(){
		super(Type.GHOST, 80, 100);
	}

	@Override
	protected String describe(){
		return "пустил теневой шар";
	}
	@Override
	protected void applyOppEffects(ru.ifmo.se.pokemon.Pokemon p){
		p.setMod(Stat.SPECIAL_DEFENSE, -1);
	}
}
