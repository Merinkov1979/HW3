public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        byte b = 5;
        System.out.println(b);
        int i = 25;
        System.out.println(i);
        short s = 1;
        System.out.println(s);
        long l = 1000l;
        System.out.println(l);
        float f = 125.6f;
        System.out.println(f);
        double d = 25.785;
        System.out.println(d);
        var v = 25;
        System.out.println(v);


        double boxerWeight1 = 78.2;
        double boxerWeight2 = 82.7;
        double weightDifference = boxerWeight2-boxerWeight1;
        System.out.println(weightDifference);
        double totalWeight = boxerWeight1+boxerWeight2;
        System.out.println(totalWeight);


        int banana = 80;
        int numberOfBananas = 5;
        int totalWeightOfBananas = banana * numberOfBananas;
        System.out.println(totalWeightOfBananas);
        int oneHundredGramsOfMilk = 105;
        int Milk = 200;
        int totalWeightMilk = Milk / 100*oneHundredGramsOfMilk;
        System.out.println(totalWeightMilk);
        int iceCreamOneBriquette = 100;
        int numberOfIceCreamBlocks = 2;
        int totalWeightOfIceCream = iceCreamOneBriquette*numberOfIceCreamBlocks;
        System.out.println(totalWeightOfIceCream);
        int eggs = 4;
        int weightOfOneEgg = 70;
        int totalWeightOfEggs = eggs * weightOfOneEgg;
        System.out.println(totalWeightOfEggs);
        int breakfastWeight = totalWeightOfBananas+totalWeightMilk+totalWeightOfIceCream+totalWeightOfEggs;
        System.out.println(breakfastWeight);
        double breakfastWeightInKilograms = breakfastWeight / 1000;
        System.out.println(breakfastWeightInKilograms);


        int weightToBeShed = 7;
        int weightToBeLostInGrams = weightToBeShed * 1000;
        System.out.println(weightToBeLostInGrams);
        int firstOption = 250;
        int firstOptionInDays = weightToBeLostInGrams / firstOption;
        System.out.println(firstOptionInDays);
        int secondOption = 500;
        int secondOptionInDays = weightToBeLostInGrams / secondOption;
        System.out.println(secondOptionInDays);
        int averageWeightLossDays = (secondOptionInDays + firstOptionInDays) / 2;
        System.out.println(averageWeightLossDays);


        int mariaIsSalaryBeforePromotion = 67760;
        float mariaIsSalaryIncrease = (mariaIsSalaryBeforePromotion / 100) * 10;
        System.out.println(mariaIsSalaryIncrease);
        float mariaIsSalaryAfterPromotion = mariaIsSalaryBeforePromotion + mariaIsSalaryIncrease;
        System.out.println(" Маша теперь получает " + mariaIsSalaryAfterPromotion + " Годовой доход вырос на " + mariaIsSalaryIncrease );
        int denisIsSalaryBeforePromotion = 83690;
        float denisIsSalaryIncrease = (denisIsSalaryBeforePromotion / 100) * 10;
        System.out.println(denisIsSalaryIncrease);
        float denisIsSalaryAfterPromotion = denisIsSalaryBeforePromotion + denisIsSalaryIncrease;
        System.out.println(" Денис теперь получает " + denisIsSalaryAfterPromotion + " Годовой доход вырос на " + denisIsSalaryIncrease );
        int CristinaIsSalaryBeforePromotion = 76230;
        float CristinaIsSalaryIncrease = (CristinaIsSalaryBeforePromotion / 100) * 10;
        System.out.println(CristinaIsSalaryIncrease);
        float CristinaIsSalaryAfterPromotion = CristinaIsSalaryBeforePromotion + CristinaIsSalaryIncrease;
        System.out.println(" Кристина теперь получает " + CristinaIsSalaryAfterPromotion + " Годовой доход вырос на " + CristinaIsSalaryIncrease );






    }


}