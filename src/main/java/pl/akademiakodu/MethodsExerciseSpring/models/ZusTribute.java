package pl.akademiakodu.MethodsExerciseSpring.models;

public class ZusTribute {
    private static ZusTribute ourInstance = new ZusTribute();

    public static ZusTribute getInstance() {
        return ourInstance;
    }

    private ZusTribute() {
    }

    public double calcZUSTribute(double totalGrossAmount){
        //todo
        return 0;
    }

    public double calcRetirementContribution(double grossAmount){
        //todo
        return 0;
    }

    public double calcPensionContribution(double grossAmount) {
        //todo
        return 0;
    }

    public double calcSicknessContribution(double grossAmount) {
        //todo
        return 0;
    }
}
