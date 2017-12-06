package fr.unilim.iut.visitor;

import fr.unilim.iut.kebab.Assiette;
import fr.unilim.iut.kebab.ingredients.Agneau;
import fr.unilim.iut.kebab.ingredients.Boeuf;
import fr.unilim.iut.kebab.ingredients.Crevette;
import fr.unilim.iut.kebab.ingredients.Fromage;
import fr.unilim.iut.kebab.ingredients.Oignon;
import fr.unilim.iut.kebab.ingredients.Pain;
import fr.unilim.iut.kebab.ingredients.Salade;
import fr.unilim.iut.kebab.ingredients.Sauce;
import fr.unilim.iut.kebab.ingredients.Thon;
import fr.unilim.iut.kebab.ingredients.Tomate;

public class VisiteurDeRegimeVegetarien {

	public boolean visit(Agneau ingredientAgneau){
		return false;

	}
	public boolean visit(Boeuf ingredientBoeuf){
		return false;

	}
	public boolean visit(Crevette ingredientCrevette){
		return false;

	}
	public boolean visit(Fromage ingredientFromage){
		return true;

	}
	public boolean visit(Oignon ingredientOignon){
		return true;

	}
	public boolean visit(Pain ingredientPain){
		return true;

	}
	public boolean visit(Sauce ingredientSauce){
		return true;

	}
	public boolean visit(Thon ingredientThon){
		return false;

	}
	public boolean visit(Tomate ingredientTomate){
		return true;

	}
	public boolean visit(Salade ingredientSalade){
		return true;

	}
	
	public boolean visit(Assiette assiette){
		return true;

	}
	
}
