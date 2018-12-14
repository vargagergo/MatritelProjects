import java.util.List;
import java.util.Random;

public class Map implements Save {

    private static Random random = new Random();


    public void saveObject(Save objectToSave) {
        for(int i=0; i<objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }

    public  void loadObject(Save objectToLoad) {
        System.out.println(objectToLoad.toString());

    }


    public void  fight(Player player, Monster monster) {
        int playerRollDice = rollTheDice(6);
        int monsterRollDice = rollTheDice(6);
        String playerWin = "Congrats!!"+ ((Player) player).getName() +" defeated the monster with the "+player.getWeapon()+"!";
        String monsterWin = "Sorry, you died.The "+ monster.getName()+" was stronger...";



        if (((Player) player).getHitPoints()  < ((Monster) monster).getStrength() && !(((Player) player).getStrength() > ((Monster) monster).getHitPoints())){
            System.out.println(monsterWin);
        }else if (((Monster) monster).getHitPoints() < ((Player) player).getStrength() && !(((Monster) monster).getStrength() > ((Player) player).getHitPoints())){
            System.out.println(playerWin);
        }else if (playerRollDice > monsterRollDice){
            System.out.println(playerWin);
        }else {
            System.out.println(monsterWin);
        }

    }


    public  int rollTheDice(int Sides){
        int roll = (int) (Math.random() * Sides) + 1;
        return roll;


    }
    public  int random(){
        int randomInt = random.nextInt(50) + 200;
        return randomInt;
    }


    @Override
    public List<String> write() {
        return null;
    }

    @Override
    public void read(List<String> savedValues) {

    }
}
