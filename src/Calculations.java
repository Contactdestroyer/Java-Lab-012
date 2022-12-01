public class Calculations {


    public static double VFromDnM(double distance){
        double V = ((6.673*(Math.pow(10,-11)))*(1.989*(Math.pow(10,30))))/distance;
        return V;
    }

    public static double DFS(double x, double y){
        double d = Math.sqrt((x*x)*(y*y));
        return d;
    }
}
