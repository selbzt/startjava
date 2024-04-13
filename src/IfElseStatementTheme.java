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

        int a = 123;
        int b = 223;

        if (a < b) {
            System.out.println("\nЧисло " + b + " больше числа " + a);
        } else if (a > b) {
            System.out.println("\nЧисло " + a + " больше числа " + b);
        } else {
            System.out.println("\nЧисла равны");
        }

        System.out.println("\n3. Проверка числа");

        int originNumber = 123;

        if (originNumber == 0) {
            System.out.println("\nЧисло равняется нулю");
        } else {
            if (originNumber > 0) {
                System.out.print("\n" + originNumber + " является положительным и ");
            } else {
                System.out.print("\n" + originNumber + " является отрицательным и ");
            }
            if (originNumber % 2 == 0) {
                System.out.println("четным");
            } else {
                System.out.println("нечетным");
            }
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");

        int number1 = 123;
        int number2 = 223;

        int hundreds1 = number1 / 100;
        int tens1 = number1 / 10 % 10;
        int ones1 = number1 % 10;

        int hundreds2 = number2 / 100;
        int tens2 = number2 / 10 % 10;
        int ones2 = number2 % 10;

        if (hundreds1 != hundreds2 & tens1 != tens2 & ones1 != ones2) {
            System.out.println("\nВ числах " + number1 + " и " + number2 + " нет одинаковых цифр.");
        } else {
            System.out.println("\nИсходные числа: " + number1 + " " + number2);

            String resultDigit = "Одинаковые в них цифры: ";
            String resultPlaceNumber = "Одинаковые номера разрядов: ";

            if (hundreds1 == hundreds2) {
                resultDigit += hundreds1 + " ";
                resultPlaceNumber += "1 ";
            }
            if (tens1 == tens2) {
                resultDigit += tens1 + " ";
                resultPlaceNumber += "2 ";
            }
            if (ones1 == ones2) {
                resultDigit += ones1 + " ";
                resultPlaceNumber += "3";
            }
            System.out.println(resultDigit + "\n" + resultPlaceNumber);
        }

        System.out.println("\n5.Определение символа по его коду");

        char someChar = '\u005E';

        if (someChar >= 'a' && someChar <= 'z') {
            System.out.println("\nСимвол " + someChar + " является маленькой буквой");
        } else if (someChar >= 'A' && someChar <= 'Z') {
            System.out.println("\nСимвол " + someChar + " является большой буквой");
        } else if (someChar >= '0' && someChar <= '9') {
            System.out.println("\nСимвол " + someChar + " является цифрой");
        } else {
            System.out.println("\nСимвол " + someChar + " не является ни буквой, ни цифрой");
        }

        System.out.println("\n6.Подсчет суммы вклада и начисленных банком %");

        double depositAmount = 301000;
        double interestRate = 0.10;

        if (depositAmount < 100000) {
            interestRate = 0.05;
        } else if (depositAmount <= 300000) {
            interestRate = 0.07;
        }

        double interestAmount = depositAmount * interestRate;
        double totalAmount = depositAmount + interestAmount;

        System.out.println("\nСумма вклада: " + depositAmount + " руб." + 
                "\nСумма начисленных процентов: " + interestAmount + " руб." + 
                "\nИтоговая сумма с процентами: " + totalAmount + " руб.");

        System.out.println("\n7.Определение оценки по предметам");

        double historyPercentage = 50;
        int historyGrade = 5;

        if (historyPercentage <= 60) {
            historyGrade = 2;
        } else if (historyPercentage <= 73) {
            historyGrade = 3;
        } else if (historyPercentage <= 91) {
            historyGrade = 4;
        }

        double programmingPercentage = 92;
        int programmingGrade = 5;

        if (programmingPercentage <= 60) {
            programmingGrade = 2;
        } else if (programmingPercentage <= 73) {
            programmingGrade = 3;
        } else if (programmingPercentage <= 91) {
            programmingGrade = 4;
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
