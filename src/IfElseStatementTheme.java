public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");

        boolean isMale = true;
        if (isMale != true) {
            System.out.println("\nЭто женский пол");
        } else {
            System.out.println("\nЭто мужской пол");
        }

        int age = 18;
        if (age > 18) {
            System.out.println("Регистрация доступна");
        } else {
            System.out.println("Регистрация доступна с 18-ти лет");
        }

        float height = 1.7f;
        if (height < 1.8) {
            System.out.println("Вам доступен проход на аттракцион");
        } else {
            System.out.println("На этом аттракционе ограничение по росту 1.8 метра");
        }

        String name = "Irina";
        char firstLetterName = name.charAt(0);
        
        if (firstLetterName == 'M') {
            System.out.println("Твоё имя не Максим :)");
        } else if (firstLetterName == 'I') {
            System.out.println("Твоё имя начинается на " + firstLetterName);
        } else {
            System.out.println("Я не знаю на какую буквы начинается имя");
        }

        System.out.println("\n2. Поиск большего числа");

        int firstNumber = 123;
        int secondNumber = 223;

        if (firstNumber < secondNumber) {
            System.out.println("\nЧисло " + secondNumber + " больше числа " + firstNumber);
        } else if (firstNumber > secondNumber) {
            System.out.println("\nЧисло " + firstNumber + " больше числа " + secondNumber);
        } else {
            System.out.println("\nЧисла равны");
        }

        System.out.println("\n3. Проверка числа");

        int number = 0;
        boolean isEvenNumber = number % 2 == 0;

        if (number == 0) {
            System.out.println("\nЧисло равняется нулю");
        } else if (number > 0) {
            if (isEvenNumber == true) {
                System.out.println("\n" + number + " является положительным и четным числом");
            } else {
                System.out.println("\n" + number + " является положительным и нечетным числом");
            }
        } else {
            if (isEvenNumber == true) {
                System.out.println("\n" + number + " является отрицательным и четным числом");
            } else {
                System.out.println("\n" + number + " является отрицательным и нечетным числом");
            }
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");

        boolean isEqualDigits = false;
        boolean firstEqualDigits = false;
        boolean secondEqualDigits = false;
        boolean thirdEqualDigits = false;

        if (firstNumber / 100 == secondNumber / 100) {
            firstEqualDigits = true;
            isEqualDigits = true;
        }

        if (firstNumber / 10 % 10 == secondNumber / 10 % 10) {
            secondEqualDigits = true;
            isEqualDigits = true;
        }

        if (firstNumber % 10 == secondNumber % 10) {
            thirdEqualDigits = true;
            isEqualDigits = true;
        }

        if (isEqualDigits) {
            System.out.println("\nИсходные числа: " + firstNumber + " " + secondNumber);
            System.out.print("Одинаковые в них цифры:");
            if (firstEqualDigits) System.out.print(" " + firstNumber / 100);
            if (secondEqualDigits) System.out.print(" " + firstNumber / 10 % 10);
            if (thirdEqualDigits) System.out.print(" " + firstNumber % 10);

            System.out.print("\nНомера разрядов:");
            if (firstEqualDigits) System.out.print(" 1");
            if (secondEqualDigits) System.out.print(" 2");
            if (thirdEqualDigits) System.out.print(" 3");
            System.out.println();
        } else {
            System.out.println("\nВ числах " + firstNumber + " и " + secondNumber + " нет одинаковых цифр.");
        }

        System.out.println("\n5.Определение символа по его коду");

        char asciiCode = '\u0031';

        if ((asciiCode >= 'A' && asciiCode <= 'Z') || (asciiCode >= 'a' && asciiCode <= 'z')) {
            if (asciiCode >= 'A' && asciiCode <= 'Z') {
                System.out.println("\nСимвол " + asciiCode + " является большой буквой");
            } else {
                System.out.println("\nСимвол " + asciiCode + " является маленькой буквой");
            }
        } else if (asciiCode >= '0' && asciiCode <= '9') {
            System.out.println("\nСимвол " + asciiCode + " является цифрой");
        } else {
            System.out.println("\nСимвол " + asciiCode + " не является ни буквой, ни цифрой");
        }

        System.out.println("\n6.Подсчет суммы вклада и начисленных банком %");

        double depositAmount = 301000;

        double interestRate;
        double interestAmount;

        if (depositAmount < 100000) {
            interestRate = 0.05;
        } else if (depositAmount >= 100000 && depositAmount <= 300000) {
            interestRate = 0.07;
        } else {
            interestRate = 0.10;
        }

        interestAmount = depositAmount * interestRate;
        double totalAmount = depositAmount + interestAmount;

        System.out.println("\nСумма вклада: " + depositAmount + " руб." + 
                "\nСумма начисленных процентов: " + interestAmount + " руб." + 
                "\nИтоговая сумма с процентами: " + totalAmount + " руб.");

        System.out.println("\n7.Определение оценки по предметам");

        double historyPercentage = 59;
        double programmingPercentage = 92;

        int historyGrade;
        int programmingGrade;

        if (historyPercentage <= 60) {
            historyGrade = 2;
        } else if (historyPercentage <= 73) {
            historyGrade = 3;
        } else if (historyPercentage <= 91) {
            historyGrade = 4;
        } else {
            historyGrade = 5;
        }

        if (programmingPercentage <= 60) {
            programmingGrade = 2;
        } else if (programmingPercentage <= 73) {
            programmingGrade = 3;
        } else if (programmingPercentage <= 91) {
            programmingGrade = 4;
        } else {
            programmingGrade = 5;
        }

        double averageGrade = (historyGrade + programmingGrade) / 2.0;
        double averagePercentage = (historyPercentage + programmingPercentage) / 2.0;

        System.out.println("\nИстория:" + historyGrade + "\nПрограммирование:" + programmingGrade +
                "\nСредний балл оценок по предметам: " + averageGrade +
                "\nСредний % по предметам: " + averagePercentage);

        System.out.println("\n8.Расчет годовой прибыли");

        int monthlyRevenue = 13000;
        int rent = 5000;
        int productionCost = 9000;
        int monthsInYear = 12;

        int yearlyProfit = (monthlyRevenue - rent - productionCost) * monthsInYear;

        System.out.print("\nПрибыль за год: ");
        if (yearlyProfit > 0) {
            System.out.println("+" + yearlyProfit + " руб.");
        } else if (yearlyProfit < 0) {
            System.out.println(yearlyProfit + " руб.");
        } else {
            System.out.println("0 руб.");
        }
    }
}
