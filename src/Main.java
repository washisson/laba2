import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;
import my.*;

public class Main {
	public static void main(String[] args){
		Battle b = new Battle();
		Pokemon p1 = new Bouffalant("Опухший", 1);
		Pokemon p2 = new Skrelp("Ссылка", 1);
		Pokemon p3 = new Dragalge("Драгалге", 1);
		Pokemon p4 = new Rhyhorn("Rhyhorn", 1);
		Pokemon p5 = new Rhydon("Заново", 1);
		Pokemon p6 = new RhydonRhyperior("Рояль", 1);
		b.addAlly(p1);
		b.addAlly(p2);
		b.addAlly(p3);
		b.addFoe(p4);
		b.addFoe(p5);
		b.addFoe(p6);
		b.go();
	}
}
