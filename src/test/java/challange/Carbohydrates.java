package challange;
public class Carbohydrates {
	
	private double fruit = 150;
	private double vegetable = 100;
	
	
	
	
	public double getVegetable() {
		return vegetable;
	}
	//constructeur avec une seul valeur
	public void setVegetable(double vegetable) {
		this.vegetable = vegetable;
	}
	
	public Carbohydrates(double fruit, double vegetable) {
		super();
		this.fruit = fruit;
		this.vegetable = vegetable;
	}
	
	//constructeur par defaut
	public Carbohydrates() {
		super();
		
	}
	
	//getters and sztters
	public double getFruit() {
		return fruit;
	}
	
	public void setFruit(double fruit) {
		this.fruit = fruit;
	}

}

