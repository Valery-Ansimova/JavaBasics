package hw_loop;

public class LoopMetods {

    public static void main(String[] args) {
        int area = calculateArea(2);
        System.out.println("Square Area = " + area);

        int distance = calculaleDistance(2, 3, 5, 4);
        System.out.println("Result Distance = " + distance);

        double[] equationRoot = quadraticEquationRoot(1, 5, 3);
        System.out.println("Equation Root: x1 = " + equationRoot[0] + " x2 = " + equationRoot[1]);

        int number = calculateNumber(0);
        System.out.println("Calculated Number = " + number);

        int sum = findSum(2, 5, 3);
        System.out.println("Sum = " + sum);

        String resultOfEvaluating = evaluateNumber(17);
        System.out.println("Evaluate result = " + resultOfEvaluating);

        boolean resultOfChecking = checkExpression(2, 4);
        System.out.println("Result of checking = " + resultOfChecking);

        boolean checkResult = checkInequality(6, 3, 15);
        System.out.println("Result of checking inequality = " + checkResult);

        Integer numberOfSerial = determineSerialNumber(7, 5, 7, 7);
        System.out.println("Serial Number = " + numberOfSerial);

        String description = defineDescription(5);
        System.out.println("Descprition = " + description);

        String yearSeason = determineYearSeason(9);
        System.out.println("Year Season = " + yearSeason);

        double actionResult = executeAction(2,3,1);
        System.out.println("Action Result = " + actionResult);

    }

    private static int calculateArea(int squareSide) {
        int squareArea = squareSide * squareSide;
        return squareArea;
    }

    private static int calculaleDistance(int speed1, int speed2, int startDistance, int time) {
        int resultDistance = Math.abs(startDistance - (time * (speed1 + speed2)));
        return resultDistance;
    }

    private static double[] quadraticEquationRoot(int a, int b, int c) {
        int d = b * b - 4 * a * c;
        double x1 = (-b + Math.sqrt(d)) / (2 * a);
        double x2 = (-b - Math.sqrt(d)) / (2 * a);
        double[] answer = {x1, x2};
        return answer;
    }

    private static int calculateNumber(int number) {
        if (number > 0) {
            number = number + 1;
        }
        if (number < 0) {
            number = number - 2;
        }
        if (number == 0) {
            number = 10;
        }
        return number;
    }

    private static int findSum(int a1, int a2, int a3) {
        int sum;
        if (a1 > a2) {
            if (a2 > a3) {
                sum = a1 + a2;
            } else {
                sum = a1 + a3;
            }
        } else {
            if (a1 > a3) {
                sum = a1 + a2;
            } else {
                sum = a2 + a3;
            }
        }
        return sum;
    }

    private static String evaluateNumber(int number) {
        String evaluateResult;
        if (number == 0) {
            evaluateResult = "Zero number";
        } else {
            if (number > 0) {
                if (number % 2 == 0) {
                    evaluateResult = "Positive even number";
                } else {
                    evaluateResult = "Positive odd number";
                }
            } else {
                if (number % 2 == 0) {
                    evaluateResult = "Negative even number";
                } else {
                    evaluateResult = "Negative odd number";
                }
            }
        }
        return evaluateResult;
    }

    private static boolean checkExpression(int a, int b) {
        boolean checkResult;
        if (a > 2 && b <= 3) {
            checkResult = true;
        } else {
            checkResult = false;
        }
        return checkResult;
    }

    private static boolean checkInequality(int a, int b, int c) {
        boolean checkResult;
        if (a < b && b < c) {
            checkResult = true;
        } else {
            checkResult = false;
        }
        return checkResult;
    }

    private static Integer determineSerialNumber(int a, int b, int c, int d) {
        Integer serialNumber = null;
        if (a != b && b == c && c == d) {
            serialNumber = 1;
        } else if (a != b && a == c && c == d) {
            serialNumber = 2;
        } else if (a == b && b != c && b == d) {
            serialNumber = 3;
        } else if (a == b && b == c && c != d) {
            serialNumber = 4;
        }
        return serialNumber;
    }

    private static String defineDescription(int k) {
        String description;
        switch (k) {
            case 1:
                description = "Badly";
                break;
            case 2:
                description = "Unsatisfactory";
                break;
            case 3:
                description = "Satisfactorily";
                break;
            case 4:
                description = "good";
                break;
            case 5:
                description = "Excellent";
                break;
            default:
                description = "Error";
                break;
        }
        return description;
    }

    private static String determineYearSeason(int monthNumber) {
        String yearSeason;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                yearSeason = "winter";
                break;
            case 3:
            case 4:
            case 5:
                yearSeason = "spring";
                break;
            case 6:
            case 7:
            case 8:
                yearSeason = "summer";
                break;
            case 9:
            case 10:
            case 11:
                yearSeason = "autumn";
                break;
            default:
                yearSeason = "error: the number is not in allowed range";
                break;
        }
        return yearSeason;
    }

    private static double executeAction(int n, int a, int b) {
        double actionResult = 0;
        switch (n) {
            case 1:
                actionResult = a + b;
                break;
            case 2:
                actionResult = a - b;
                break;
            case 3:
                actionResult = a * b;
                break;
            case 4:
                actionResult = a / b;
                break;
        }
        return actionResult;
    }
}