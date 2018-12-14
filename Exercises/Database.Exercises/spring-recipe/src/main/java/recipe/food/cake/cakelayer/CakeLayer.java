package recipe.food.cake.cakelayer;

import recipe.food.cake.ingredient.Sugar;

public abstract class CakeLayer {

    private Sugar sugar;

    public CakeLayer(Sugar sugar) {
        this.sugar = sugar;
    }

    abstract void showLayerRecipe();
    //when implemented, prints out every field of the class


    public Sugar getSugar() {
        return sugar;
    }
}
