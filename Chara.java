
public class Chara {
	private int hp;
	private int mp;
	private String name;
	
	public Chara(int hp, int mp, String name) {
		this.hp = hp;
		this.mp = mp;
		this.name = name;
	}
	
	public void speak() {
		System.out.println("私は" + name + "で、HPは" + hp + "MPは" + mp + "です");
		
	}

}
