package pl.akademiakodu.MethodsExerciseSpring.models;

public class AdvanceOfIncomeTax {

    private static AdvanceOfIncomeTax ourInstance = new AdvanceOfIncomeTax();

    public static AdvanceOfIncomeTax getInstance() {
        return ourInstance;
    }

    private AdvanceOfIncomeTax() {
    }

    public int calcAdvanceOfIncomeTax(double grossAfterZus, int distanceFromWorkPlace){
        //todo
        return 0;
    }

    public double calcIncomeCost(int distanceFromWorkPlace){
        //todo
        return 0;
    }

    public boolean isLocal(int distanceFromWorkPlace){
        //todo
        return true;
    }

    public double calcTempHealthTribute(double grossAfterZUS){
        //todo
        return 0;
    }
}
