
public class Main {
	public static void main(String[] args) {
		Ingredient menthe = new Ingredient("Menthe");
		Ingredient glace = new Ingredient("Glace pilee");
		Ingredient limonade = new Ingredient("Limonade");
		Ingredient citron = new Ingredient("Citron vert");
		Ingredient orange = new Ingredient("Orange");
		Ingredient grenadine = new Ingredient("Grenadine");
		Barman a = new Barman("mojito", "a", new Ingredient[] { menthe, glace, limonade, citron });
		Barman b = new Barman("Bloody Mary", "b", new Ingredient[] {orange, grenadine, glace, menthe});
		
		a.start();
		b.start();
		
		try {
			a.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			b.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
