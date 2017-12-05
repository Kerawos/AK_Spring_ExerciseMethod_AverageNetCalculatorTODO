package pl.akademiakodu.MethodsExerciseSpring.models.services;

/**
 * Imports section
 */
import org.springframework.stereotype.Service;
import pl.akademiakodu.MethodsExerciseSpring.models.FinancialData2017;

/**
 * Service responsible for calculations of potential medical insurance cost.
 */
@Service
public class MedicalInsurance {

    /**
     * In this example this service will be singleton
     */
    private static MedicalInsurance ourInstance = null;

    public static MedicalInsurance getInstance() {
        if (ourInstance==null){
            return new MedicalInsurance();
        }
        return ourInstance;
    }

    private MedicalInsurance() {
    }

    /**
     * Method calculate medical insurance cost
     * @param grossAfterZUS
     * @return medical insurance
     */
    public double calcMedicalInsurance(double grossAfterZUS){
        return FinancialData2017.roundFinancial(grossAfterZUS * FinancialData2017.getRateMedicalInsurance());
    }
}
