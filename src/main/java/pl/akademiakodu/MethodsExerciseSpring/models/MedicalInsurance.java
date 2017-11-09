package pl.akademiakodu.MethodsExerciseSpring.models;

public class MedicalInsurance {

    private static MedicalInsurance ourInstance = new MedicalInsurance();

    public static MedicalInsurance getInstance() {
        return ourInstance;
    }

    private MedicalInsurance() {
    }

    //method to calculate medical insurance in 2017 y
    public double calcMedicalInsurance(double grossAfterZUS){
        return FinancialData2017.roundFinancial(grossAfterZUS * FinancialData2017.getRateMedicalInsurance());
    }
}
