package my;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class AerialAce extends ru.ifmo.se.pokemon.PhysicalMove{
	public AerialAce(){
		super(Type.FLYING, 60, 999999);
	}

	@Override
	protected String describe(){
		return "использует атаку Aerial Ace";
	}
}
