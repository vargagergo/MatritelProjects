package garden;

public  class App {
    public static void main(String[] args) {


        Garden lol = new Garden();
        Trees tree = new Trees("Red Tree");
        Flower flower = new Flower("Orange Flower");
        Plants plantTree = new Trees("Green Tree");
        Plants plantFlower = new Flower("Yellow Flower");

        lol.addPlant(tree);
        lol.addPlant(flower);
        lol.addPlant(plantFlower);
        lol.addPlant(plantTree);
        lol.printOutGarden();
        lol.addWater(40);
        lol.printOutGarden();
        lol.addWater(70);
        lol.printOutGarden();

    }
}
