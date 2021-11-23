package my;

import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class Rest extends ru.ifmo.se.pokemon.StatusMove{
	public Rest(){
		super(Type.PSYCHIC, 0, 0);
	}

	@Override
	protected String describe(){
		return "засыпает и восстанавливает здоровье";
	}
	@Override
	protected void applySelfEffects(ru.ifmo.se.pokemon.Pokemon p){
		ru.ifmo.se.pokemon.Effect.sleep(p);
		p.setMod(Stat.HP, (int) (p.getHP() - p.getStat(Stat.HP)));
	}
}
