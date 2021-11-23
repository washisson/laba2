package my;

import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class ScaryFace extends ru.ifmo.se.pokemon.StatusMove{
	public ScaryFace(){
		super(Type.NORMAL, 0, 100);
	}

	@Override
	protected String describe(){
		return "показывает своё страшное лицо";
	}
	@Override
	protected void applyOppEffects(ru.ifmo.se.pokemon.Pokemon p){
		p.setMod(Stat.SPEED, -2);
	}
}
