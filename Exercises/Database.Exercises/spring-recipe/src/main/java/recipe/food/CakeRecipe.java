package recipe.food;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import recipe.food.cake.cakelayer.*;

@Component
public class CakeRecipe {
    private Pudding pudding;
    private Dough dough;
    private Topping topping;


    @Autowired
    public CakeRecipe(Pudding pudding, Dough dough, Topping topping) {
        this.pudding = pudding;
        this.dough = dough;
        this.topping = topping;
    }

    public void showCakeRecipe(){

        pudding.showLayerRecipe();
        dough.showLayerRecipe();
        topping.showLayerRecipe();
        //this will call the showLayerRecipe methods of the three fields
    }

}
