package pl.akademiakodu.MethodsExerciseSpring.models.services;

/**
 * Imports section
 */
import org.springframework.stereotype.Service;

/**
 * Service responsible for calculations of potential zus commission.
 */
@Service
public class ZusTribute {

    /**
     * In this example this service will be singleton
     */
    private static ZusTribute ourInstance = null;

    public static ZusTribute getInstance() {
        if (ourInstance==null){
            return new ZusTribute();
        }
        return ourInstance;
    }

    private ZusTribute() {
    }

    /**
     * Method to calculate all 3 zus tributes
     * @param totalGrossAmount
     * @return total zus commission
     */
    public double calcZUSTribute(double totalGrossAmount){
        //todo
        return 0;
    }

    /**
     * Method to calculate potential Retirement Contribution
     * @param grossAmount
     * @return
     */
    public double calcRetirementContribution(double grossAmount){
        //todo
        return 0;
    }

    /**
     * Method to calculate potential Pension Contribution
     * @param grossAmount
     * @return
     */
    public double calcPensionContribution(double grossAmount) {
        //todo
        return 0;
    }

    /**
     * Method to calculate potential Sickness Contribution
     * @param grossAmount
     * @return
     */
    public double calcSicknessContribution(double grossAmount) {
        //todo
        return 0;
    }
}
