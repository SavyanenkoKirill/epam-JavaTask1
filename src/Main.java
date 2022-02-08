import task1.DigitsManager;
import task10.MatrixGenerator;
import task2.ExpressionCalculator;
import task3.RightTriangleAttributesCalculator;
import task4.PointLocationIdentifier;
import task5.RealNumbersManipulator;
import task6.MaxMinSumCalculator;
import task7.FunctionRangeCalculator;
import task8.MultiplesSumCalculator;
import task9.ArraysManipulator;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        DigitsManager.manage(2350);

        System.out.println("Task 2");
        System.out.println(ExpressionCalculator.calculate(3,4,5));

        System.out.println("Task 3");
        System.out.println(RightTriangleAttributesCalculator.calculateSquare(12,3));
        System.out.println(RightTriangleAttributesCalculator.calculatePerimeter(22,39));

        System.out.println("Task 4");
        PointLocationIdentifier.identify(1,2.5);

        System.out.println("Task 5");
        RealNumbersManipulator.manipulate(5.3, -12.2, 11.7);

        System.out.println("Task 6");
        System.out.println(MaxMinSumCalculator.calculate(12, 243.3, -3.1));

        System.out.println("Task 7");
        FunctionRangeCalculator.calculate(1, 14, 2);

        System.out.println("Task 8");
        System.out.println(MultiplesSumCalculator.calculate(new int[] {16, 4, 3, 32, 5}, 64));

        System.out.println("Task 9");
        System.out.println(Arrays.toString(ArraysManipulator.manipulate(new int[]{3, 2, 11, -3}, new int[]{2345, 330, 0}, 2)));

        System.out.println("Task 10");
        System.out.println(Arrays.deepToString(MatrixGenerator.generate(10)));
    }
}
