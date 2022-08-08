public class IfElseStatementTheme {
    public static void main(String[] args) {

        //Задача №1
        System.out.println("\nЗадача №1. Перевод псевдокода на язык Java.");
        byte age = 19;
        System.out.println ("Ваш возраст: " + age);
        if (age > 20) {
            System.out.println ("Вы старше 20-ти");
             } else {
                System.out.println("Вы младше 20-ти");
        } 

        // Вообще не понял идею.. 
        Boolean manGender = false;
        if (!manGender) {
            System.out.println("Поздравляем - у Вас девочка!");
        }

        double height = 1.90;
        if (height < 1.80) {
            System.out.println("Ваш рост - " + height + " и он меньше 1.80");
                } else {
                    System.out.println("Ваш рост - " + height + " и он больше или равен 1.80");
        }
        String name = "Dimon";
        char firstNameChar = name.charAt(0);
        if (firstNameChar == 'M') {
            System.out.println("Первая буква в имени " + name + " M");
                } else if (firstNameChar == 'I') {
                    System.out.println("Первая буква в имени " + name + " I");
                    } else {
                         System.out.println("В имени " + name + " первая буква " + firstNameChar);
                    }
        //Задача №2
        System.out.println("\nЗадача №2. Поиск max и min числа.");
        byte num1 = 31;
        byte num2 = 14;
        if (num1 > num2) {
            System.out.println("Число " + num1 + " является Максимальным, а число " + num2 + " минимальным");
        } else if(num2 > num1) {
            System.out.println("Число " + num2 + " является Максимальным, а число " + num1 + " минимальным");
        }
        //Задача №3
        System.out.println("\nЗадача №3. Работа с числом.");
        byte digit = 0;
        System.out.println("Заданное число равно " + digit);
        if (digit == 0) {
            System.out.println("Число равно Нулю!");
        } else if (digit > 0 && digit % 2 == 0) {
            System.out.println("Число четное положительное");
        } else if (digit < 0 && digit % 2 == 0) {
            System.out.println("Число четное отрицательное");
        } else if (digit > 0 && digit % 2 != 0) {
            System.out.println("Число нечетное положительное");
        } else if (digit < 0 && digit % 2 != 0) {
            System.out.println("Число нечетное отрицательное");
        }
        //Задача №4
        System.out.println("\nЗадача №4. Поиск одинаковых цифр в числах.");
        int numberOne = 238;
        int numberTwo = 138;
        System.out.println("Исходные числа :\n" + numberOne + "\n" + numberTwo);
        int hundredOne = numberOne / 100;
        int tensOne = numberOne % 100 / 10; 
        int onesOne = numberOne % 10;
        System.out.println("Полученные цифры первого числа : " + hundredOne + ", " + tensOne +  ", " + onesOne);
        int hundredTwo = numberTwo / 100;
        int tensTwo = numberTwo % 100 / 10; 
        int onesTwo = numberTwo % 10;
        System.out.println("Полученные цифры второго числа : " + hundredTwo + ", " + tensTwo + ", " + onesTwo);
        if (hundredOne == hundredTwo && tensOne == tensTwo && onesOne == onesTwo) {
            System.out.println("Одинаковые цифры в сотом разряде равны : " + hundredOne + "\n" 
                + "Одинаковые цифры в десятичном разряде равны : " + tensOne + "\n" 
                + "Одинаковые цифры в единичном разряде равны : " + onesOne + "\n");
        } else if (hundredOne == hundredTwo && tensOne != tensTwo && onesOne == onesTwo) {
            System.out.println("Одинаковые цифры в сотом разряде равны : " + hundredOne + "\n" 
                        + "Одинаковые цифры в единичном разряде равны : " + onesOne + "\n");
        } else if (hundredOne == hundredTwo && tensOne == tensTwo && onesOne != onesTwo) {
            System.out.println("Одинаковые цифры в сотом разряде равны : " + hundredOne + "\n" 
                + "Одинаковые цифры в десятичном разряде равны : " + tensOne + "\n");
        }else if (hundredOne != hundredTwo && tensOne == tensTwo && onesOne == onesTwo) {
            System.out.println("Одинаковые цифры в десятичном разряде равны : " + tensOne + "\n" 
                + "Одинаковые цифры в единичном разряде равны : " + onesOne + "\n");
        } else if (hundredOne != hundredTwo && tensOne != tensTwo && onesOne == onesTwo) {
            System.out.println("Одинаковые цифры в единичном разряде равны : " + onesOne + "\n");
        } else if (hundredOne != hundredTwo && tensOne == tensTwo && onesOne != onesTwo) {
            System.out.println("Одинаковые цифры в десятичном разряде равны : " + tensOne + "\n"); 
        } else if (hundredOne == hundredTwo && tensOne != tensTwo && onesOne != onesTwo) {
            System.out.println("Одинаковые цифры в сотом разряде равны : " + hundredOne + "\n");
        }
        //Задача №5
        // все перепробовал, кроме как таким вариантом решить не получалось...
        // для проверок были использованны так же значения:
        //24 - знак доллара $
        //34 - цифра 4
        //63 - c (маленькая буква)
        System.out.println("\nЗадача №5. Определение буквы, числа или символа по их коду.");
        char escape = '\u0057';
        System.out.println("Значение по данному в условии задачи коду : " + escape);
        if (Character.isLowerCase(escape)) {
            System.out.println("Это маленькая буква");
        } else if (Character.isUpperCase(escape)) {
            System.out.println("Это большая буква");
       } else if (Character.isDigit(escape)) {
        System.out.println("Это цифра");
       } else {
        System.out.println("Это не буква и не цифра");
       }
       //Задача №6
       System.out.println("\nЗадача №6. Определение суммы вклада и начисленных банком %.");
       int deposit = 350000;
       int fiveProcent = deposit / 100 * 5;
       int sevenProcent = deposit / 100 * 7;
       int tenProcent = deposit / 100 * 10;
       int lowDeposit = deposit + fiveProcent;
       int middleDeposit = deposit + sevenProcent;
       int hightDeposit = deposit + tenProcent;
       if (deposit < 100000) {
        System.out.println("Сумма вклада: " + deposit + " Рублей" + "\n" + "Начисленный %: " + fiveProcent + " Рублей" + "\n" + 
            "Итоговая сумма с процентами: " + lowDeposit + " Рублей");
       } else if (deposit > 100000 && deposit < 300000) {
        System.out.println("Сумма вклада: " + deposit + " Рублей" + "\n" + "Начисленный %: " + sevenProcent + " Рублей" + "\n" + 
            "Итоговая сумма с процентами: " + middleDeposit + " Рублей");
       } else if (deposit > 300000) {
        System.out.println("Сумма вклада: " + deposit + " Рублей" + "\n" + "Начисленный %: " + tenProcent + " Рублей" + "\n" + 
            "Итоговая сумма с процентами: " + hightDeposit + " Рублей");
       }
       //Задача №7
       System.out.println("\nЗадача №7. Определение оценки по предметам.");
       int history = 59;
       int prog = 91;
       int historyBall = 0;
       int progBall = 0; 
       if (history <=60) {
        historyBall = 2;
        System.out.println("Предмет: История, оценка: " + historyBall);
       } else if (history > 60 && history <= 73) {
        historyBall = 3;
        System.out.println("Предмет: История, оценка: " + historyBall);
       } else if (history > 73 && history <=91) {
        historyBall = 4;
        System.out.println("Предмет: История, оценка: " + historyBall);
       } else if (history > 91 && history <=100) {
        historyBall = 5;
        System.out.println("Предмет: История, оценка: " + historyBall);
       }
       if (prog <=60) {
        progBall = 2;
        System.out.println("Предмет: Программирование, оценка: " + progBall);
       } else if (prog > 60 && prog <= 73) {
        progBall = 3;
        System.out.println("Предмет: Программирование, оценка: " + progBall);
       } else if (prog > 73 && prog <=91) {
        progBall = 4;
        System.out.println("Предмет: Программирование, оценка: " + progBall);
       } else if (prog > 91 && prog <=100) {
        progBall = 5;
        System.out.println("Предмет: Программирование, оценка: " + progBall);
       }
       System.out.println("Средний балл по предметам: " + (historyBall + progBall) /2 );
       System.out.println("Средний процент по предметам: " + (history + prog) / 2 + "%");

        //Задача №8
       System.out.println("\nЗадача №8. Расчет прибыли.");
       int rent = 5000;
       int sale = 13000;
       int costPrice = 9000;
       int profit = (sale * 12) - (costPrice * 12) - (rent * 12);
       if (profit > 0) {
        System.out.println("Прибыль за год составляет: " + "+" + profit + " руб.");
       } else if (profit < 0) {
        System.out.println("Прибыль за год составляет: " + profit + " руб.");
       }
        //Задача №9
       System.out.println("\nЗадача №9. Подсчет количества банкнот.\n");
       int hundredBlancNom = 100;
       int tenBlancNom = 10;
       int oneBlancNom = 1;
       System.out.println("Номиналы банкнот: " + "\n" + hundredBlancNom + "$ банкнота" + "\n" + tenBlancNom + "$ банкнота - 5 шт осталось" 
        + "\n" + oneBlancNom + "$ банкнота\n");
       int finalSum = 567; // 567
       System.out.println("Исходная сумма $: " + finalSum);
       int hundredBlanc = finalSum / hundredBlancNom; //(5)
       System.out.println("Сотен нужно: " + hundredBlanc);
       int tenBlanc = (finalSum - (hundredBlanc * 100)) / tenBlancNom; //(6)банкнот 
       System.out.println("Десяток нужно: " + tenBlanc);
       int oneBlanc = finalSum - (hundredBlanc * 100) - (tenBlanc * 10);
       System.out.println("Единичек нужно: " + oneBlanc + "\n");
       if (tenBlanc > 5) {
        int oneBlancCount = (tenBlanc - 5) * tenBlancNom / oneBlancNom;
        System.out.println("При учете остатка 10$ банкнот: \nСотен нужно: "+ hundredBlanc + "\nДесяток нужно: 5" + "\nЕдиничек нужно: " 
            + (oneBlancCount + oneBlanc) +"\n" + "Исходная сумма составляет: " + ((hundredBlanc * hundredBlancNom) + (tenBlancNom * 5) + 
                ((oneBlanc + oneBlancCount) * oneBlancNom)));
       }


}
}

