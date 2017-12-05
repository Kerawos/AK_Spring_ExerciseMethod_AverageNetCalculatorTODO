package pl.akademiakodu.MethodsExerciseSpring.models.services;

/**
 * Imports section
 */
import org.springframework.stereotype.Service;

/**
 * Service responsible for calculations of potential advance of income tax.
 */
@Service
public class AdvanceOfIncomeTax {

    /**
     * In this example this service will be singleton
     */
    private static AdvanceOfIncomeTax ourInstance = null;

    public static AdvanceOfIncomeTax getInstance() {

        if (ourInstance==null){
            return new AdvanceOfIncomeTax();
        }
        return ourInstance;
    }

    private AdvanceOfIncomeTax() {
    }

    /**
     * Method calculate advance of income tax
     * @param grossAfterZus already calculated gross salary after zus tribute
     * @param distanceFromWorkPlace
     * @return advance of income tax
     */
    public int calcAdvanceOfIncomeTax(double grossAfterZus, int distanceFromWorkPlace){
        //todo
        return 0;
    }

    /**
     * Method calculate cost of income
     * @param distanceFromWorkPlace
     * @return
     */
    public double calcIncomeCost(int distanceFromWorkPlace){
        //todo
        return 0;
    }

    /**
     * Method checks if user is life nearby work area
     * @param distanceFromWorkPlace
     * @return
     */
    public boolean isLocal(int distanceFromWorkPlace){
        //todo
        return true;
    }

    /**
     * Method calculate health insurance commission
     * @param grossAfterZUS
     * @return
     */
    public double calcTempHealthTribute(double grossAfterZUS){
        //todo
        return 0;
    }
}
