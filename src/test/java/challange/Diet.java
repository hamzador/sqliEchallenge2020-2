package challange;
public class Diet {
	Proteins proteins = new Proteins();
	Carbohydrates carbohydrates =new Carbohydrates();
	Fats fats = new Fats();
	//intialis� la valeur de Healthy_meal � 500
	private int Healthy_meal =500;
	
	//constructeur par defaut
	public Diet() {
		super();
		
	}
	

	//Constructeur avec une seul argument de type int 
	public Diet(int healthy_meal) {
		super();
		Healthy_meal = healthy_meal;
	}


	
	
//calculer la somme des Calories  dans pour chaque elements--------------------------------------------------------------------------------
	public long calculCalories(String str) {
		//splite la chaine de caract�re selon le vergule 
		String[] table = str.split(",");
		//initialis� la valeur de somme � 0
		long sumCalories = 0;
		for(String element: table) {
			switch (element) {
			case "egg" : sumCalories += proteins.getEgg();break;
			case "seafood" : sumCalories += proteins.getSeafood();break;
			case "fruit" : sumCalories += carbohydrates.getFruit();break;
			case "vegetable" : sumCalories += carbohydrates.getVegetable();break;
			case "cheese" : sumCalories += fats.getCheese();break;
			case "peanut" : sumCalories += fats.getPeanuts();break;
		}
				
		}
		
		return sumCalories;
	}
	
	
//la methode evaluateCalories pour tester si le nombre de calori� 
	//est egale � le nombre demander ou supperieur ou inf�rieur---------------------------------------------------------------------

	public String evaluateCalories(String string) {
		
		long sumCalories= calculCalories(string);
	
		
		String result = null;
		//somme de calorie �gale a 500 ;somme demander 
		if( sumCalories == Healthy_meal ) {
			result = "good, number of calories as expected";
		}
		//somme de calorie inferieur ou �gale � 500 ;somme demander 
		else if(sumCalories < Healthy_meal){
			long differance = Healthy_meal - sumCalories;
			
			result = "still "+differance+" calories to be added";
		}
		//somme de calorie Suppirier ou �gale a 500 ;somme demander 
		else if(sumCalories > Healthy_meal) {
			long differance =  sumCalories - Healthy_meal;
			result = "still "+differance+" calories to be removed";
		}
		
		
		return result;
	}
	
	

//evaluateNutrients ------------------------------------------------------------
	public String evaluateNutrients(String string) {
		String result =null;
		//spilte selon le vergule 
		String[] table = string.split(",");
		int protein = 0;
		int fat = 0;
		int carbs=0;
		for(String element: table) {
			switch (element) {
			//si l'element de la table �gale � egg alors incr�menter Proteins
			case "egg" : protein=1;break;
			//si l'element de la table �gale � seafood alors incr�menter Proteins
			case "seafood" : protein=1;break;
			//si l'element de la table �gale � fruit alors incr�menter carbs
			case "fruit" : carbs = 1;break;
			//si l'element de la table �gale � vegetable alors incr�menter carbs
			case "vegetable" : carbs = 1;break;
			//si l'element de la table �gale � cheese alors incr�menter fat
			case "cheese" : fat = 1 ;break;
			//si l'element de la table �gale � peanut alors incr�menter fat
			case "peanut" : fat = 1;break;
			}
		}
		//si la somme des 3 (valeurs protein+fat+carbs) �gale � 3 alors les 3 classes existes
		int sumNutrients = protein+fat+carbs;
		if (sumNutrients == 3) {
			result ="good, your meal contains all required nutrients!";
		}
		//sinon il y a l'un qui n'existe pas
		else if (protein == 0){
			result ="your meal doesn't contain proteins!";	
		}else if(fat == 0) {
			result ="your meal doesn't contain fats!";
		}else if(carbs == 0) {
			result ="your meal doesn't contain carbohydrates!";
		}
		
		return result;
	}
}
//end
