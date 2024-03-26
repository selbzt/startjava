public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");

        boolean isMale = true;
        if (!isMale) {
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

        char firstLetterName = "Irina".charAt(0);
        if (firstLetterName == 'M') {
            System.out.println("Твоё имя не Максим :)");
        } else if (firstLetterName == 'I') {
            System.out.println("Твоё имя начинается на " + firstLetterName);
        } else {
            System.out.println("Я не знаю на какую буквы начинается имя");
        }

        System.out.println("\n2. Поиск большего числа");

        int number1 = 123;
        int number2 = 223;

        if (number1 < number2) {
            System.out.println("\nЧисло " + number2 + " больше числа " + number1);
        } else if (number1 > number2) {
            System.out.println("\nЧисло " + number1 + " больше числа " + number2);
        } else {
            System.out.println("\nЧисла равны");
        }

        System.out.println("\n3. Проверка числа");

        int originNumber = -9;
        boolean isEvenNumber = originNumber % 2 == 0;

        if (originNumber == 0) {
            System.out.println("\nЧисло равняется нулю");
        } else if (originNumber > 0 & isEvenNumber) {
            System.out.println("\n" + originNumber + " является положительным и четным числом");
        } else if (originNumber > 0 & !isEvenNumber) {
            System.out.println("\n" + originNumber + " является положительным и нечетным числом");
        } else if (originNumber < 0 & isEvenNumber) {
            System.out.println("\n" + originNumber + " является отрицательным и четным числом");
        } else {
            System.out.println("\n" + originNumber + " является отрицательным и нечетным числом");
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");

        int firstNumber = 123;
        int secondNumber = 223;

        if (firstNumber / 100 != secondNumber / 100 & firstNumber / 10 % 10 != secondNumber / 10 % 10 &
                 firstNumber % 10 != secondNumber % 10) {
            System.out.println("\nВ числах " + firstNumber + " и " + secondNumber + " нет одинаковых цифр.");
        } else {
            System.out.println("\nИсходные числа: " + firstNumber + " " + secondNumber);
            String resultDigit = "Одинаковые в них цифры: ";
            String resultPlaceNumber = "Одинаковые номера разрядов: ";
            if (firstNumber / 100 == secondNumber / 100) {
                resultDigit += firstNumber / 100 + " ";
                resultPlaceNumber += "1 ";
            }
            if (firstNumber / 10 % 10 == secondNumber / 10 % 10) {
                resultDigit += firstNumber / 10 % 10 + " ";
                resultPlaceNumber += "2 ";
            }
            if (firstNumber % 10 == secondNumber % 10) {
                resultDigit += firstNumber % 10 + " ";
                resultPlaceNumber += "3";
            }
            System.out.println(resultDigit + "\n" + resultPlaceNumber);
        }

        System.out.println("\n5.Определение символа по его коду");

        char someChar = '\u0031';

        if ((someChar  >= 'a' && someChar  <= 'z') || (someChar  >= 'A' && someChar  <= 'Z')) {
            if (someChar  >= 'a' && someChar  <= 'z') {
                System.out.println("\nСимвол " + someChar  + " является маленькой буквой");
            } else {
                System.out.println("\nСимвол " + someChar  + " является большой буквой");
            }
        } else if (someChar  >= '0' && someChar  <= '9') {
            System.out.println("\nСимвол " + someChar  + " является цифрой");
        } else {
            System.out.println("\nСимвол " + someChar  + " не является ни буквой, ни цифрой");
        }

        System.out.println("\n6.Подсчет суммы вклада и начисленных банком %");

        double depositAmount = 301000;
        double interestRate = 0.10;
        double interestAmount;

        if (depositAmount < 100000) {
            interestRate = 0.05;
        } else if (depositAmount <= 300000) {
            interestRate = 0.07;
        }

        interestAmount = depositAmount * interestRate;
        double totalAmount = depositAmount + interestAmount;

        System.out.println("\nСумма вклада: " + depositAmount + " руб." + 
                "\nСумма начисленных процентов: " + interestAmount + " руб." + 
                "\nИтоговая сумма с процентами: " + totalAmount + " руб.");

        System.out.println("\n7.Определение оценки по предметам");

        double historyPercentage = 59;
        int historyGrade;

        if (historyPercentage <= 60) {
            historyGrade = 2;
        } else if (historyPercentage <= 73) {
            historyGrade = 3;
        } else if (historyPercentage <= 91) {
            historyGrade = 4;
        } else {
            historyGrade = 5;
        }

        double programmingPercentage = 92;
        int programmingGrade;

        if (programmingPercentage <= 60) {
            programmingGrade = 2;
        } else if (programmingPercentage <= 73) {
            programmingGrade = 3;
        } else if (programmingPercentage <= 91) {
            programmingGrade = 4;
        } else {
            programmingGrade = 5;
        }

        double gpa = (historyGrade + programmingGrade) / 2.0;
        double averagePercentage = (historyPercentage + programmingPercentage) / 2.0;

        System.out.println("\nИстория:" + historyGrade + "\nПрограммирование:" + programmingGrade +
                "\nСредний балл оценок по предметам: " + gpa +
                "\nСредний % по предметам: " + averagePercentage);

        System.out.println("\n8.Расчет годовой прибыли");

        int monthlyRevenue = 23000;
        int rent = 5000;
        int productionCost = 9000;
        int monthsInYear = 12;

        int yearlyProfit = (monthlyRevenue - rent - productionCost) * monthsInYear;

        System.out.print("\nПрибыль за год: ");
        if (yearlyProfit > 0) {
            System.out.println("+" + yearlyProfit + " руб.");
        } else {
            System.out.println(yearlyProfit + " руб.");
        }
    }
}
