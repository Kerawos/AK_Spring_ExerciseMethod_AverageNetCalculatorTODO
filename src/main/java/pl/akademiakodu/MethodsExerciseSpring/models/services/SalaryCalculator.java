package pl.akademiakodu.MethodsExerciseSpring.models.services;

import org.springframework.stereotype.Service;

/**
 * Service responsible for general calculations of potential net salary.
 */
@Service
public class SalaryCalculator {

    /**
     * Method to calculate net salary from gross
     * @param grossAmount
     * @param bonus
     * @param distanceFromWorkPlace
     * @return net salary
     */
    public double salaryNetCalculator(double grossAmount, double bonus, int distanceFromWorkPlace){
        //todo
        //1 calc total base
        //2 calc zus tribute
        //3 calc healthTribute
        //4 calc advanceForIncomeTax
        return 0;
    }
}
