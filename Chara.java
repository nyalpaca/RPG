
public class Chara {
	private int hp;
	private int mp;
	private int ap;
	private String name;


	public Chara(int hp, int mp, int ap, String name) {
		this.hp = hp;
		this.mp = mp;
		this.ap = ap;
		this.name = name;
	}

	public void introduce() {
		System.out.println("私は" + name + "で、HPは" + hp + "MPは" + mp + "です");

	}

	public void damage(int damage) {
		hp = hp - damage;
		System.out.print(name + "は" + damage + "のダメージを受けた。HPが" + this.hp + "になった");
		System.out.println("");
	}

	public void attack(Chara Monster) {

		System.out.println(name + "の攻撃！");
		Monster.damage(10);
	}

}
