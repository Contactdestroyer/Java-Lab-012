import java.util.Scanner;
public class SolarSystem {
    Scanner scoon = new Scanner(System.in);
    String name = "No Name";
     Planet[] SolSys;

    public SolarSystem (){
        System.out.println("What would you like to call this Solar System?");
        this.name = scoon.nextLine();
        System.out.println("What is the most amount of planets "+name+" will have?");
        int PlaNum = 1+(scoon.nextInt());
        this.SolSys = new Planet[PlaNum];
        for (int i = 1; i<SolSys.length; i++){
            addPlanet();
        }
        MakeSun();

    }
    int NPN = 1;//New Planet Number
    public void addPlanet(){
        if (NPN < SolSys.length) {
            SolSys[NPN] = new Planet();
            NPN++;
        }else {
            System.out.println("Max number of planets reached. If you want more you'll have to make a new Solar system.");
        }
    }

    private void MakeSun(){
//        System.out.println("What would you like the sun to be named?");
//        String SunName = scoon.next();
//        Planet SolSys[0] = new Planet();
                                            //Originally the Sun was supposed to be the 0th planet to calculate minimum velocity
                                            //for varying Sun masses. However further inspection of the instructions showed that
                                            //the sun was not meant to be customized, only the planets.
    }
}
