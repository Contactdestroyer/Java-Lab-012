import java.util.Scanner;

public class Main {
    static Scanner scoon = new Scanner(System.in);
    private static boolean exit = false;

    public static void PlanetMenu(Planet PlaChoi){
        while (true) {
        System.out.println("What would you like to do with your planet?");
        System.out.println("1:  View details about planet");
        System.out.println("2:  Change the location of the planet");
        System.out.println("3:  Change the velocity of the planet");
        System.out.println("4:  Return to Solar System menu");

            int PChoice = scoon.nextInt();
            if (PChoice == 1) {
                DisplayPlanet(PlaChoi);
            }
            else if (PChoice == 2) {
                PlaChoi.setLocation();
            }
            else if (PChoice == 3) {
                PlaChoi.setVelocity();
            }
            else if (PChoice == 4) {
                break;
            } else {
                System.out.println("\nWrong input. Please try again...");
            }
        }
    }

    public static void SSMenu(Planet[] SS){
        while (!exit) {
            System.out.println("Which planet would you like to choose?");
            for (int x = 1; x < SS.length; x++) {
                System.out.println("Planet " + x + ":" + SS[x].getName());
            }
            System.out.println("To quit, input " + SS.length);

            while (true) {
                int PlaChoi = scoon.nextInt();
                for (int i = 1; i < SS.length; i++) {
                    if (PlaChoi == i) {
                        PlanetMenu(SS[PlaChoi]);
                        break;
                    } else if (PlaChoi == SS.length) {
                        exit = true;
                        break;
                    } else if (i == SS.length - 1) {
                        System.out.println("Incorrect input. Please try again...");
                    }
                }
                if (PlaChoi == SS.length) {
                    break;
                }
            }
        }
    }
    public static void DisplayPlanet(Planet i){
        double r = i.getRadius();
        double v = ((4.0/3.0)*(3.1415)*(r*r*r));
        double m = i.getMass();
        double den = m/v;
        System.out.println(i.getName()+":");
        i.displayVelocity();
        i.displayLocation();
        System.out.println("The planet has a radius of "+r+" and a volume of "+v);
        System.out.println("The planet has a mass of "+m+" and a density of "+den+"\n\n");
    }

    public static void main(String[] args) {
        SolarSystem milk = new SolarSystem();

            SSMenu(milk.SolSys);

        }
}
