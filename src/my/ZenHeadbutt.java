package my;

import ru.ifmo.se.pokemon.Type;

public class ZenHeadbutt extends ru.ifmo.se.pokemon.PhysicalMove{
	public ZenHeadbutt(){
		super(Type.PSYCHIC, 80, 90);
	}

	@Override
	protected String describe(){
		return "вломил головой";
	}

	@Override
	protected void applyOppEffects(ru.ifmo.se.pokemon.Pokemon defender){
		if(Math.random() < 0.2)
			ru.ifmo.se.pokemon.Effect.flinch(defender);
	}
}
