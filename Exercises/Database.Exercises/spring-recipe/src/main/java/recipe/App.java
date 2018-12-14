package recipe;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import recipe.food.CakeRecipe;

@ComponentScan
public class App {
    public static void main(String[] args) {

        //IoC Container AKA the Application Context
        ApplicationContext context = new AnnotationConfigApplicationContext(App.class);

        //Our service, that encapsulates the business logic, so that our main method be nice and clean, without any business logic in it
        //This way the main method can stay ONLY and entry point, and no more
        //ElectricalShop bestBuy = context.getBean(ElectricalShop.class);

        CakeRecipe cakeRecipe = context.getBean(CakeRecipe.class);
        //Method call of our Service class, which will call on to other methods
        //bestBuy.showAvailableDeviceDetails();

        cakeRecipe.showCakeRecipe();

    }
}