package ch2;

public class Exs {
    public static String getCircleArea(double radius) {
        final double PI = 3.14159; 
        if (radius < 0) {
            return "반지름은 음수가 될 수 없습니다.";
        }
        double area = PI * radius * radius;
        String result = String.format("반지름 %.2f의 원의 면적은 %.2f입니다.", radius, area);
        return result;
    }
}
