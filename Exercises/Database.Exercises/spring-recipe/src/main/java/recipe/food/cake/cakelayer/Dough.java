package recipe.food.cake.cakelayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import recipe.food.cake.ingredient.*;

@Component
public class Dough extends CakeLayer {

    private Egg egg;
    private Flour flour;
    private Butter butter;
    private BakingSoda bakingSoda;

    @Autowired
    public Dough(@Qualifier(value = "fewsugar") Sugar sugar,
                 @Qualifier(value = "egg") Egg egg,
                 @Qualifier(value = "flour") Flour flour,
                 @Qualifier(value = "butter") Butter butter,
                 @Qualifier(value = "bakingsoda")BakingSoda bakingSoda) {
        super(sugar);
        this.egg = egg;
        this.flour = flour;
        this.butter = butter;
        this.bakingSoda = bakingSoda;

    }

    public Egg getEgg() {
        return egg;
    }

    public void setEgg(Egg egg) {
        this.egg = egg;
    }

    public Flour getFlour() {
        return flour;
    }

    public void setFlour(Flour flour) {
        this.flour = flour;
    }

    public Butter getButter() {
        return butter;
    }

    public void setButter(Butter butter) {
        this.butter = butter;
    }

    public BakingSoda getBakingSoda() {
        return bakingSoda;
    }

    public void setBakingSoda(BakingSoda bakingSoda) {
        this.bakingSoda = bakingSoda;
    }



    @Override
    public void showLayerRecipe() {
        System.out.println( "Dough{" +
                "sugar = " + this.getSugar() +
                "egg = " + egg +
                ", flour = " + flour +
                ", butter = " + butter +
                ", bakingSoda = " + bakingSoda +
                '}');
    }
}
