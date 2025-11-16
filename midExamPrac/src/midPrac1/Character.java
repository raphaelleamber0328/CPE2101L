package midPrac1;

public class Character {
	
	String name, dialog;
	int hp, mp, lvl;
	
	Character(String name, String dialog, int hp, int mp, int lvl) {
		
		this.name = name;
		this.dialog = dialog;
		this.hp = hp;
		this.mp = mp;
		this.lvl = lvl;
		
	}
	
	void introduce() {
		
		System.out.println("I am " + name);
		
	}

}
