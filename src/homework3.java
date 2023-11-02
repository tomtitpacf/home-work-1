public class homework3 {
    public static void main(String[] args) {

        // task 1

        int a = 100;
        byte b = 102;
        short c = 103;
        long d = 104L;
        float e = 10.5f;
        double f = 10.6;

        System.out.println("Значение переменной " + "a" + " с типом " + "int" + " равно " + a);
        System.out.println("Значение переменной " + "b" + " с типом " + "byte" + " равно " + b);
        System.out.println("Значение переменной " + "c" + " с типом " + "short" + " равно " + c);
        System.out.println("Значение переменной " + "d" + " с типом " + "long" + " равно " + d);
        System.out.println("Значение переменной " + "e" + " с типом " + "float" + " равно " + e);
        System.out.println("Значение переменной " + "f" + " с типом " + "double" + " равно " + f);

        // task 2

        float e1 = 27.12f;
        long d1 = 987678965549L;
        double f1 = 2.786;
        short c2 = 569;
        short c1 = -159;
        int a1 = 27897;
        byte b1 = 67;

        // task 3

        byte ludmilaPavlovna = 23 ;
        byte annaSergeevna = 27;
        byte ekaterinaAndrevna = 30;
        short totalSheets = 480 ;

        int studentSheets = totalSheets / (ludmilaPavlovna + annaSergeevna + ekaterinaAndrevna );
        System.out.println("На каждого ученика рассчитано " + studentSheets + " листов бумаги");

        // task 4


        byte bottles = 16 ;
        byte time = 2;
        int executionMin = bottles / time ;

        int executionTwenty = 20 * executionMin ;
        int executionDay = 60 * 24 * executionMin;
        int executionMonth = 30 * executionDay ;
        int executionThreeDay = 3 * executionDay ;

        System.out.println("За " + "20 минут" + " машина произвела " + executionTwenty + " штук бутылок");
        System.out.println("За " + "сутки" + " машина произвела " + executionDay + " штук бутылок");
        System.out.println("За " + "3 дня" + " машина произвела " + executionThreeDay + " штук бутылок");
        System.out.println("За " + "1 месяц" + " машина произвела " + executionMonth + " штук бутылок");

        // task 5

        byte jar = 120 ;
        byte whiteJar = 2;
        byte brownJar = 4;
        int  clas = jar/ ( whiteJar + brownJar) ;
        int newwhiteJar = whiteJar * clas ;
        int newbrownJar = brownJar * clas ;

        System.out.println("В школе, где " + clas + " классов, нужно " + newwhiteJar + " банок белой краски и " + newbrownJar + " банок коричневой краски " );

        // task 6

        int weightOfBanana = 80;
        int weightOfMilk = 105;
        int weightOfIceCream = 100;
        int weightOfEgg = 70;

        int numberOfBananas = 5;
        int numberOfMilk = 200;
        int numberOfIceCream = 2;
        int numberOfEggs = 4;
        int totalWeight = ( numberOfBananas * weightOfBanana ) + ( numberOfMilk * weightOfMilk ) + ( numberOfIceCream * weightOfIceCream ) + ( numberOfEggs * weightOfEgg );
        System.out.println("Общий вес завтрака: " + totalWeight + " грамм");
        System.out.println("Общий вес завтрака: " + (totalWeight / 1000.0) + " килограмм");

        // task 7

        int targetWeightLoss = 7;

        int minDailyLoss = 250;
        int maxDailyLoss = 500;

        int minDays = targetWeightLoss * 1000 / minDailyLoss;
        int maxDays = targetWeightLoss * 1000 / maxDailyLoss;

        int averageDays = (minDays + maxDays) / 2;

        System.out.println("Для потери 7 кг с потерей 250 грамм в день, потребуется " + minDays + " дней.");
        System.out.println("Для потери 7 кг с потерей 500 грамм в день, потребуется " + maxDays + " дней.");
        System.out.println("В среднем, для потери 7 кг потребуется около " + averageDays + " дней.");

        // task 8

        // employee salaries
        double salaryMasha = 67760;
        double salaryDenis = 83690;
        double salaryKristina = 76230;
        // percent
        double annualRaisePercentage = 10;
        // new salaries
        double newSalaryMasha = salaryMasha * (1 + annualRaisePercentage / 100);
        double newSalaryDenis = salaryDenis * (1 + annualRaisePercentage / 100);
        double newSalaryKristina = salaryKristina * (1 + annualRaisePercentage / 100);
        // aanual income
        double annualIncomeMashaBefore = salaryMasha * 12;
        double annualIncomeDenisBefore = salaryDenis * 12;
        double annualIncomeKristinaBefore = salaryKristina * 12;
        // after increase
        double annualIncomeMashaAfter = newSalaryMasha * 12;
        double annualIncomeDenisAfter = newSalaryDenis * 12;
        double annualIncomeKristinaAfter = newSalaryKristina * 12;

        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + (annualIncomeMashaAfter - annualIncomeMashaBefore) + " рублей.");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + (annualIncomeDenisAfter - annualIncomeDenisBefore) + " рублей.");
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на " + (annualIncomeKristinaAfter - annualIncomeKristinaBefore) + " рублей.");
    }
}