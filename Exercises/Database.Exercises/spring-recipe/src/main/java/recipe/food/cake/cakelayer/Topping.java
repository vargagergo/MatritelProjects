package recipe.food.cake.cakelayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import recipe.food.cake.ingredient.*;

@Component
public class Topping extends CakeLayer {


    private ChocolateChip chocolateChip;
    private WhippedCream whippedCream;

    @Autowired
    public Topping(@Qualifier(value = "lotOfSugar")Sugar sugar,
                   @Qualifier(value = "chocolatechip")ChocolateChip chocolateChip,
                   @Qualifier(value = "whippedcream")WhippedCream whippedCream) {
        super(sugar);
        this.chocolateChip = chocolateChip;
        this.whippedCream = whippedCream;
    }

    public ChocolateChip getChocolateChip() {
        return chocolateChip;
    }

    public void setChocolateChip(ChocolateChip chocolateChip) {
        this.chocolateChip = chocolateChip;
    }

    public WhippedCream getWhippedCream() {
        return whippedCream;
    }

    public void setWhippedCream(WhippedCream whippedCream) {
        this.whippedCream = whippedCream;
    }



    @Override
    public void showLayerRecipe() {
        System.out.println( "Topping{" +
                "sugar = " + this.getSugar() +
                "chocolateChip=" + chocolateChip +
                ", whippedCream=" + whippedCream +
                '}');
    }
}
