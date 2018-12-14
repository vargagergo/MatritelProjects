package recipe.food.cake.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import recipe.food.cake.cakelayer.Dough;
import recipe.food.cake.ingredient.*;

@Configuration
public class IngredientConfig {



  @Bean(name = "bakingsoda")
    public BakingSoda bakingSoda(){
      return new BakingSoda(1);
  }

  @Bean(name = "butter")
    public Butter butter(){
      return new Butter(100);
  }

    @Bean(name = "chocolateChip")
    public ChocolateChip chocolateChip(){
      return new ChocolateChip(150);
    }

    @Bean(name = "egg")
    public Egg egg (){
      return new Egg(2);
    }

    @Bean(name = "flour")
    public Flour flour(){
      return new Flour(200);
    }

    @Bean(name = "milk")
    public Milk milk(){
      return new Milk(500);
    }

    @Bean(name = "fewSugar")
    public Sugar fewsugar(){
      return new Sugar(10.3);
    }

    @Bean(name = "sugar")
    public Sugar sugar(){
        return new Sugar(200.3);
    }

    @Bean(name = "lotOfSugar")
    public Sugar lotOfSugar(){
        return new Sugar(400.4);
    }


    @Bean(name = "vaniliapuddingpowder")
    public VanillaPuddingPowder vanillaPuddingPowder(){
      return new VanillaPuddingPowder(2);

    }

    @Bean(name = "whippedcream")
    public WhippedCream whippedCream(){
      return new WhippedCream(20);
    }

}
