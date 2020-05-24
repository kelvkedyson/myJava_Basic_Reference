package com.kedyson;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dimensions dimensions = new Dimensions(20,20,50);
        Case theCase = new Case("220B","DELL","240", dimensions);
        Monitor monitor = new Monitor("27inch Beast","Acer",27, new Resolution(2540,1440));
        MotherBoard motherBoard = new MotherBoard("BJ-200", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, monitor, motherBoard);

//        thePC.getMonitor().drawPixelAt(500, 400, "red");
//        thePC.getMotherBoard().loadProgam("Ubuntu 18.04 LTS");
//        thePC.getTheCase().pressPowerBtn();
        thePC.powerUp();
        theCase.getDimensions().getDepth();

        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("North");
        Wall wall4 = new Wall("South");

        Ceiling ceiling = new Ceiling(5,55);

        Bed bed = new Bed("Modern", 6, 4, 2, 1);

        Lamp lamp = new Lamp("Classic", false, 75);

        Bedroom bedroom = new Bedroom("Kelvin's room", wall1, wall2, wall3, wall4, ceiling, bed, lamp);

        bed.make();
        bedroom.makeBed();
        bedroom.getLamp().turnOn();
        wall1.getDirection();

    }
}
