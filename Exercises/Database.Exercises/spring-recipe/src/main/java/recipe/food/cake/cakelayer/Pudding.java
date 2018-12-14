package recipe.food.cake.cakelayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import recipe.food.cake.ingredient.*;

@Component
public class Pudding extends CakeLayer {


    private VanillaPuddingPowder vanillaPuddingPowder;
    private Milk milk;


    public Pudding(Sugar sugar,VanillaPuddingPowder vanillaPuddingPowder, Milk milk) {
        super(sugar);
        this.vanillaPuddingPowder = vanillaPuddingPowder;
        this.milk = milk;
    }

    public VanillaPuddingPowder getVanillaPuddingPowder() {
        return vanillaPuddingPowder;
    }

    @Autowired
    public void setVanillaPuddingPowder(@Qualifier(value = "vaniliapuddingpowder")VanillaPuddingPowder vanillaPuddingPowder) {
        this.vanillaPuddingPowder = vanillaPuddingPowder;
    }

    public Milk getMilk() {
        return milk;
    }

    public void setMilk(Milk milk) {
        this.milk = milk;
    }



    @Override
    public void showLayerRecipe() {
        System.out.println( "Pudding{" +
                "sugar = " + this.getSugar() +
                "vanillaPuddingPowder=" + vanillaPuddingPowder +
                ", milk=" + milk +
                '}');
    }
}
