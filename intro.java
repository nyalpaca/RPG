
public class intro {

	public static void main(String[] args) {
		Chara a = new Chara(10, 0, 5, "モンスター");
		a.introduce();

		Chara b = new Chara(40, 100, 15, "魔術師");
		b.introduce();

		Chara c = new Chara(100, 20, 10, "勇者");
		c.introduce();
		c.damage(5);
		c.attack(a);



	}

}
