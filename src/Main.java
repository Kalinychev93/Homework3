public class Main {
    public static void main(String[] args) {
        System.out.println("Homework 3");
        System.out.println(" ");

        System.out.println("Task 1");
        byte mySchool = 59;
        System.out.println("Значение переменной mySchool с типом byte равно " + mySchool);
        short myCourse = 15;
        System.out.println("Значение переменной myCourse с типом short равно " + myCourse);
        int myAge = 29;
        System.out.println("Значение переменной myAge с типом int равно " + myAge);
        long myDesiredSalary = 390000;
        System.out.println("Значение переменной myDesiredSalary с типом long равно " + myDesiredSalary);
        float myExperienceAsEconomist = 7.1f;
        System.out.println("Значение переменной myExperienceAsEconomist с типом float равно " + myExperienceAsEconomist);
        double Pi = 3.141592;
        System.out.println("Значение переменной Pi с типом double равно " + Pi);
        System.out.println(" ");

        System.out.println("Task 2");
        float numberOne = 27.12f;
        System.out.println(numberOne);
        long numberTwo = 987_678_965_549L;
        System.out.println(numberTwo);
        double numberThree = 2.786;
        System.out.println(numberThree);
        boolean numberFour = numberThree > numberTwo;
        System.out.println(numberFour);
        short numberFive = 569;
        System.out.println(numberFive);
        char numberSix1 = '-';
        char numberSix2 = 49;
        char numberSix3 = 53;
        char numberSix4 = 57;
        System.out.println(numberSix1 + "" + numberSix2 + "" + numberSix3 + "" + numberSix4);
        int numberSeven = 27897;
        System.out.println(numberSeven);
        byte numberEight = 67;
        System.out.println(numberEight);
        System.out.println(" ");

        System.out.println("Task 3");
        int lpStudents = 23;
        short asStudents = 30;
        byte eaStudents = 27;
        int totalStudents = lpStudents + asStudents + eaStudents;
        long totalSheets = 480L;
        System.out.println("На каждого ученика рассчитано " + (totalSheets / totalStudents) + " листов бумаги\"");
        System.out.println(" ");

        System.out.println("Task 4");
        int outputPerMinute = 16/2;
        int outputPer20Minutes = outputPerMinute * 20;
        System.out.println("За 20 минут работы машина произвела " + outputPer20Minutes + " бутылок");
        int outputPer1Day = outputPerMinute * 60 * 24;
        System.out.println("За 1 сутки работы машина произвела " + outputPer1Day + " бутылок");
        int outputPer3Days = outputPer1Day * 3;
        System.out.println("За 3 дня работы машина произвела " + outputPer3Days + " бутылок");
        int outputPer1Month = outputPer1Day * 30;
        System.out.println("За месяц работы машина произвела " + outputPer1Month + " бутылок");
        System.out.println(" ");

        System.out.println("Task 5");
        int totalAmountOfCans = 120;
        int whiteCansFor1Class = 2;
        int brownCansFor1Class = 4;
        int totalAmountOfClasses = totalAmountOfCans / (whiteCansFor1Class + brownCansFor1Class);
        int totalWhiteCans = whiteCansFor1Class * totalAmountOfClasses;
        int totalBrownCans = brownCansFor1Class * totalAmountOfClasses;
        System.out.println("В школе, где " + totalAmountOfClasses + " классов, нужно " + totalWhiteCans + " банок белой краски и " + totalBrownCans + " банок коричневой краски");
        System.out.println(" ");

        System.out.println("Task 6");
        double numberOfBananas = 5;
        double weightOfOneBanana = 80;
        double totalWeightOfBananas = numberOfBananas * weightOfOneBanana;
        double milkInMl = 200;
        double GrIn1Ml = 1.05;
        double totalMilk = milkInMl * GrIn1Ml;
        double numberOfIceCream = 2;
        double weightOfOneIceCream = 100;
        double totalWeightOfIceCream = numberOfIceCream * weightOfOneIceCream;
        double numberOfEggs = 4;
        double weightOfOneEgg = 70;
        double totalWeightOfEggs = numberOfEggs * weightOfOneEgg;
        double totalWeightIGrams = totalWeightOfBananas + totalMilk + totalWeightOfIceCream + totalWeightOfEggs;
        double numberOfGramsIn1Kilo = 1000;
        double totalWeightInKilo = totalWeightIGrams / numberOfGramsIn1Kilo;
        System.out.println("Вес спорт-завтрака составляет " + totalWeightInKilo + " кг.");
        System.out.println(" ");

        System.out.println("Task 7");
        double needToLoseWeight = 7000;
        double min = 250;
        double max = 500;
        double resultMin = needToLoseWeight / min;
        double reminder1 = needToLoseWeight % min;
        if (reminder1 == 0){
            System.out.println("Если спортсмен будет терять в весе " + min + " грамм (среднее значение) в день, то похудеет за " + resultMin +  " дней.");
        } else if (reminder1 >= (0.5 * min)){
            double difMin = min - reminder1;
            double resultMin2 = (needToLoseWeight + difMin) / min;
            System.out.println("Если спортсмен будет терять в весе " + min + " грамм (среднее значение) в день, то похудеет за " + resultMin2 +  " дней.");
        }else {
            double resultMin3 = (needToLoseWeight - reminder1) / min;
            System.out.println("Если спортсмен будет терять в весе " + min + " грамм (среднее значение) в день, то похудеет за " + resultMin3+  " дней.");
        }
        double resultMax = needToLoseWeight / max;
        double reminder2 = needToLoseWeight % max;
        if (reminder2 == 0){
            System.out.println("Если спортсмен будет терять в весе " + max + " грамм (среднее значение) в день, то похудеет за " + resultMax +  " дней.");
        } else if (reminder1 >= (0.5 * max)){
            double difMax = max - reminder2;
            double resultMax2 = (needToLoseWeight + difMax) / min;
            System.out.println("Если спортсмен будет терять в весе " + max + " грамм (среднее значение) в день, то похудеет за " + resultMax2 +  " дней.");
        }else {
            double resultMax3 = (needToLoseWeight - reminder2) / max;
            System.out.println("Если спортсмен будет терять в весе " + max + " грамм (среднее значение) в день, то похудеет за " + resultMax3+  " дней.");
        }
        double medium = (min + max) /2; //375
        double resultMedium = needToLoseWeight / medium;//18.666
        double reminderMedium = needToLoseWeight % medium;
        if (reminderMedium == 0){
            System.out.println("Если спортсмен будет терять в весе " + medium + " грамм (среднее значение) в день, то похудеет за " + resultMedium +  " дней.");
        } else if (reminderMedium >= (0.5 * medium)){
            double difMed = medium - reminderMedium;
            double resultMedium2 = (needToLoseWeight + difMed) / medium;
            System.out.println("Если спортсмен будет терять в весе " + medium + " грамм (среднее значение) в день, то похудеет за " + resultMedium2 +  " дней.");
        }else {
            double resultMedium3 = (needToLoseWeight - reminderMedium) / medium;
            System.out.println("Если спортсмен будет терять в весе " + medium + " грамм (среднее значение) в день, то похудеет за " + resultMedium3 +  " дней.");
        }
        System.out.println(" ");

        System.out.println("Task 8");
        double mashaSalaryPerMonth = 67760;
        double denisSalaryPerMonth = 83690;
        double kristinaSalaryPerMonth = 76230;
        double percentOfRise = 0.1 ;
        double riseForMashaSalary = mashaSalaryPerMonth * percentOfRise;
        double newMashaSalary = mashaSalaryPerMonth + riseForMashaSalary;
        double oldMashaRevenueInYear = mashaSalaryPerMonth * 12;
        double newMashaRevenueInYear = newMashaSalary * 12;
        double differentOfMashaRevenue = newMashaRevenueInYear - oldMashaRevenueInYear;
        System.out.println("После повышения Маша будет получать зарплату = " + newMashaSalary + " рублей в месяц. Годовой доход вырос на " + differentOfMashaRevenue + " рублей.");
        double riseForDenisSalary = denisSalaryPerMonth * percentOfRise;
        double newDenisSalary = denisSalaryPerMonth + riseForDenisSalary;
        double oldDenisRevenueInYear = denisSalaryPerMonth *12;
        double newDenisRevenueInYear = newDenisSalary * 12;
        double differentOfDenisRevenue = newDenisRevenueInYear - oldDenisRevenueInYear;
        System.out.println("После повышения Денис будет получать зарплату = " + newDenisSalary + " рублей в месяц. Годовой доход вырос на " + differentOfDenisRevenue + " рублей.");
        double riseForKristinaSalary = kristinaSalaryPerMonth * percentOfRise;
        double newKristinaSalary = kristinaSalaryPerMonth + riseForKristinaSalary;
        double oldKristinaRevenueInYear = kristinaSalaryPerMonth * 12;
        double newKristinaRevenueInYear = newKristinaSalary *12;
        double differentOfKristinaRevenue = newKristinaRevenueInYear - oldKristinaRevenueInYear;
        System.out.println("После повышения Кристина будет получать зарплату = " + newKristinaSalary + " рублей в месяц. Годовой доход вырос на " + differentOfKristinaRevenue + " рублей.");
        System.out.println(" ");

        System.out.println("Task 6*");
        double a = 12;
        double b = 27;
        double c = 44;
        double d = 15;
        double e = 9;
        double result = a * (b + (c - d * e));
        result = - result;
        System.out.println(result);


        System.out.println(" ");

        System.out.println("Task 7*");
        double a1 = 5;
        double b1 = 7;
        a1 = a1 + b1;
        b1 = a1 - b1;
        a1 = a1 - b1;
        System.out.println("a = " + a1 + " b = " + b1);
        System.out.println(" ");

        System.out.println("Task 8*");
        int a2 = 846;
        int b2 = (a2 / 10) % 10;
        System.out.println(b2);
















    }
}