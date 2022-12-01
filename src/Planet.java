import java.util.Scanner;
public class Planet {
    Scanner scoon = new Scanner(System.in);
    private String name;
    private double mass = 1;
    private double radius = 1;
    private double distance;
    private double velocity;
    private double minVelo;
    private double[] location = new double[2];



    public Planet (){
        System.out.println("What is your planets name?");
        this.name = scoon.next();
        System.out.println("What is your planets mass?");
        this.mass = scoon.nextDouble();
        System.out.println("What is your planets radius?");
        this.radius = scoon.nextDouble();
        System.out.println("Enter the Initial X location of your planet.");
        this.location[0] = scoon.nextDouble();
        System.out.println("Enter the Initial y location of your planet.");
        this.location[1] = scoon.nextDouble();
        System.out.println("Planet created!");
        UpdateCal();
        velocity = minVelo;//Initial velocity is set to the minimum required for orbit.
    }
    private void UpdateCal(){
        distance = Calculations.DFS(location[0],location[1]);
        minVelo = Calculations.VFromDnM(distance);
    }

/*    public Planet(String sun){
        this.mass = (1.989*(Math.pow(10,30)));     //See notes for method 'MakeSun()' in SolarSystem.java
        this.location[0] = 0;
        this.location[1] = 0;
        this.isSun = true;
        System.out.println("Sun created!");
    }*/
    private void displayMinV(){
        System.out.println("---Warning---"+"The planet must have a velocity of "+minVelo+" or else the planet will lose perfect orbit.");
    }
    public void displayVelocity(){
        System.out.println("The planets velocity is "+velocity+"MPH");//Units to be determined.
    }

    public void displayLocation(){
        System.out.println("The x coordinates is "+location[0]+"and Y coordinates is "+location[1]+".");
        System.out.println("This planet is "+distance+" away from the sun.");
    }

    public double getMass(){
        return mass;
    }

    public double getRadius(){
        return radius;
    }

    public String getName(){
        return name;
    }

    public void setLocation(){
        System.out.println("Enter the new X position of your planet.");
        location[0] = scoon.nextDouble();
        System.out.println("Enter the new Y position of your planet.");
        location[1] = scoon.nextDouble();
        UpdateCal();
    }

    public void setVelocity(){
        displayMinV();
        velocity = scoon.nextDouble();
        System.out.println("The velocity of the planet is now "+velocity);
    }





    }
