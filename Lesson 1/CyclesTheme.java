public class CyclesTheme {
    public static void main(String[] agrs) {
        System.out.println("\nЗадача №1. Подсчет суммы четных и нечетных чисел.");
        int i = -10;
        int evenNum = 0;
        int oddNum = 0;
        do {
            if (i % 2 == 0) {
                evenNum += i;
            } else if (i % 2 != 0) {
                oddNum += i;
            }
            i++;
        }while(i <= 21);
        System.out.println("\nВ промежутке [-10, 21]: \nCумма четных чисел: " + evenNum + "\nСумма нечетных чисел: " + oddNum);

        System.out.println("\nЗадача №2. Вывод чисел в интервале (min и max) в порядке убывания.");
        int x = 10;
        int y = 5;
        int z = -1;
        int maxNum = 0;
        int minNum = 0;
        if (x > y && x > z) {
            maxNum = x;
            System.out.println("Max: " + maxNum);
        } else if (y > x && y > z) {
            maxNum = y;
            System.out.println("Max: " + maxNum);
        } else if (z > x && z > y) {
            maxNum = z;
            System.out.println("Max: " + maxNum);
        } if (x < y && x < z) {
            minNum = x;
            System.out.println("Min: " + minNum);
        } else if (y < x && y < z) {
            minNum = y;
            System.out.println("Min: " + minNum);
        } else if (z < x && z < y) {
            minNum = z;
            System.out.println("Min: " + minNum);
        }
        String result = "";
        for (int j = maxNum ; j >= minNum; result += " " + j-- ) {
            } 
            System.out.println("Интервал в порядке убывания: " + result); 
       
       System.out.println("\nЗадача №3. Вывод реверсивного числа и суммы его цифр.");
       int num = 1234;
       int k=0;
       int digitOne = 0;
       int digitTwo = 0;
       int digitThree = 0;
       int digitFour = 0;
       int sum = 0;
       while (k < num) {
           if (k == num / 1000) {
               digitOne = k;
            } else if (k == num / 100 % 10) {
               digitTwo = k;
            } else if (k == num /10 % 10) {
               digitThree = k;
            } else if (k == num % 10) {
               digitFour = k;
               sum = digitOne + digitTwo + digitThree + digitFour;
           } 
           k++;
         }
       System.out.println("Исходное число в обратном порядке: " + "" + digitFour + digitThree + digitTwo + digitOne + "\n" + 
        "Сумма цифр числа: " + sum);

       System.out.println("\nЗадача №4. Вывод чисел на консоль в несколько строк.");
       String result1 = "";
       int l = 0;
       for (int p = 0; p < 24; p += 2) {
           result1 += 1 + p + " ";
           l++;
              if ( l > 1 && l % 5 == 0) {
                   result1 += '\n';
      } 
         } System.out.printf("%15s%n", result1);
         
       

       }
}

//"%05d%n"
// выведите с помощью for на консоль числа в полуинтервале [1, 24) - не равно 24
// шаг итерации 2 
// отделяйте их друг от друга необходимым количеством пробелов
// не указывайте впереди числа нули
// выравнивайте числа в каждом столбце по правому краю, используя форматированный (1, 2) вывод с помощью printf
// недостающее в последней строке до 5 количество чисел заполните нулями
// число нулей определяйте программно. Не считайте их в уме и не пишите сами

// Тут нужен один цикл, который позволил бы выводить все символы, а внутри него if, который в нужный момент переводил бы вывод на новую строку
// 21:28
// тут нужно определиться, какое значение нужно проверять в if, чтобы понять, что нужно переносить вывод на новую строку
// 21:29
// это может быть либо отдельный счетчик, который будет считать символы, либо делать %