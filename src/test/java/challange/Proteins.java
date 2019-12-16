package challange;
public class Proteins {

	private double seafood = 200;
	private double egg = 50;
	
	//getters ans setters
	public double getSeafood() {
		return seafood;
	}
	
	public void setSeafood(double seafood) {
		this.seafood = seafood;
	}
	
	public double getEgg() {
		return egg;
	}
	
	public void setEgg(double egg) {
		this.egg = egg;
	}
	
	//constructeur avec deux argumenets
	public Proteins(double seafood, double egg) {
		super();
		this.seafood = seafood;
		this.egg = egg;
	}

	//constructeur par defaut
	public Proteins() {
		super();
	}
	
	
}
