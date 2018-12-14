package garden;

import java.util.ArrayList;
import java.util.List;

public  class Garden {


    private List<Plants> gardenPlants = new ArrayList<Plants>();



    void addPlant(Plants plant){
        gardenPlants.add(plant);
    }

    void printOutGarden (){
        for(int i = 0; i < gardenPlants.size(); i++) {
            System.out.println(gardenPlants.get(i).name + gardenPlants.get(i).printWaterState()+" WaterLevel : "+gardenPlants.get(i).waterLevel );
        }

    }

    void addWater (int water){
            double count = 0;
            double sortWater;
            for (int i = 0; i < gardenPlants.size(); i++){
                if (gardenPlants.get(i).needWater() == true){
                    count++;
                }
            }
            sortWater = water / count;
            for (int i = 0; i < gardenPlants.size(); i++){
                if (gardenPlants.get(i).needWater() == true){
                    gardenPlants.get(i).waterLevel = gardenPlants.get(i).waterLevel + gardenPlants.get(i).water(sortWater);
                }
            }
            System.out.println("\n" + "Watering with: " + water +"\n");
            printOutGarden();
        }
}




