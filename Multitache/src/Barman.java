
public class Barman extends Thread{
	private String cocktail;
	private String barman;
	private Ingredient[] ingredients;
	
	public Barman(String cocktail, String barman, Ingredient[] ingredients) {
		// TODO Auto-generated constructor stub
		this.cocktail = cocktail;
		this.barman = barman;
		this.ingredients = ingredients;
	}

	public String getCocktail() {
		return cocktail;
	}
	
	public String getBarman() {
		return barman;
	}
	
	@Override
	public void run() {
		int i = 0;
		while (i != 4) {
			System.out.println("Barman " + barman + ": " + cocktail + " " + ingredients[i].getNom());
			i = i + 1;
		}
	}
}
