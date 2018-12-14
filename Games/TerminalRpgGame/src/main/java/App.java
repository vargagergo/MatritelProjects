public class App {



    public static void main(String[] args) {


        Map terra = new Map();
        Player geri = new Player("Geri", 200, 250);
        Monster gorgon = new Monster("Gorgon",terra.random(),terra.random());
        geri.setWeapon("Mjolnir");
        terra.loadObject(geri);
        terra.loadObject(gorgon);
        terra.fight(geri,gorgon);



        }
    }
