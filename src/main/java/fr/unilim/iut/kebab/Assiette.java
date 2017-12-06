package fr.unilim.iut.kebab;

import java.util.LinkedList;
import java.util.List;

import fr.unilim.iut.kebab.ingredients.Ingredient;
import fr.unilim.iut.visitor.VisiteurDeRegimeVegetarien;

public class Assiette implements Kebab {

	public List<Ingredient> getIngredients() {
		return new LinkedList<Ingredient>();
	}

	public boolean isVegetarien() {
		return true;
	}

	public boolean isPescetarien() {
		return true;
	}
	
	public void accept(VisiteurDeRegimeVegetarien vrv){
		vrv.visit(this);
	}

}
