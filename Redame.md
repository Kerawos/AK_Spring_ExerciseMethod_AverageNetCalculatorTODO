#Java Basic by AkademiaKodu.pl 2017
Methods exercise - average
'Payroll Calculator'


Your task is to implement method called 'salaryNetCalculator' to calculate net salary from gross. To acomplished this
you have to implement '//todo' methods.

As you see methods like 'roundFinancial', 'calcMedicalInsurance' are already implemented, also final variables are declared.

Focus to implements every function in proper order founded below.

    !Important - make "NetCalculator.png" your good friend - there is schema how to methods should work graphically

You have to implements main function called "salaryNetCalculator" from SalaryCalculator, to do that you have to
do steps below:

1. Calculate 'grossBase', also check if 'grossBase' is greater than 0, also if distance are 'positive'

2. Calculate ZUS tributes in method 'calcZUSTribute'
- implement all minor methods as: 'calcRetirementContribution', 'calcPensionContribution', 'calcSicknessContribution'
!remember to rounded every result (* use already implemented function 'roundFinancial')

3. calcMedicalInsurance - Calculate Health tribute
- implement this method and also remember to round result!

4. calcAdvanceOfIncomeTax - last thing to implement:
- implement minor two methods like: 'calcIncomeCost'(return one of this amount amount: incomeAmountLocal or incomeAmountOutside )
to do this you have implements 'isLocal' to check status (check distance from work place include maximum distance)
this help you calculate 'baseForTaxThreshold'.

- calculate advanceForIncomeTax: first try to receive proper % based on 'baseForTaxThreshold' amount and later subtract
'amountFreeOfTax'.

- from result above you have to subtract 'tempHealthTribute' ( to gain 'tempHealthTribute' amount you have to implement
method called: 'calcTempHealthTribute'

- after this you have to round result (double to int)

-last thing will be calculate netSalary (grossBase - ZUSTribute - healthTribute - advanceForIncomeTax)

    !Remember to check "NetCalculator.png" in case of trouble.

Good Luck!