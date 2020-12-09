/*Task 2_5: Визначити клас Інтервал з врахуванням включення / невключення. Створити методи по знаходженню перетину 
 * і об'єднанню інтервалів, причому інтервали, що не мають спільних точок, перетинатися /обєднуватися не можуть.
 *  Оголосити масив / список / множину з n інтервалів і визначить відстань між найбільш віддаленими кінцями.
 */

import java.util.Scanner;

public class Int {
    public static class Interval{
        private double min, max;
        private boolean inclMin, inclMax;

        Interval(){ }

        Interval(double a, double b) {
            if (a == b){
                System.out.println("Input is a point, try again!");
                System.exit(1);
            }

            this.min = (a < b) ? a : b;
            this.max = (a < b) ? b : a;
            this.inclMin = true;
            this.inclMax = true;
        }

        Interval(double a, double b, boolean inclLeft, boolean inclRight) {
            if (a == b){
                System.out.println("Input is a point, try again!");
                System.exit(1);
            }

            this.min = (a < b) ? a : b;
            this.max = (a < b) ? b : a;
            this.inclMin = inclLeft;
            this.inclMax = inclRight;
        }

        public Interval getIntersection(Interval other){
            if (this.max < other.min || this.min > other.max){
                return null;
            }

            double left, right;
            boolean leftIncluded, rightIncluded;

            if (this.min > other.min){
                left = this.min;
                leftIncluded = this.inclMin;
            } else {
                left = other.min;
                leftIncluded = other.inclMin;
            }

            if (this.max < other.max){
                right = this.max;
                rightIncluded = this.inclMax;
            } else {
                right = other.max;
                rightIncluded = other.inclMax;
            }

            return new Interval(left, right, leftIncluded, rightIncluded);
        }

        public Interval getUnion(Interval other){
            if (this.max < other.min || this.min > other.max){
                return null;
            }

            double left, right;
            boolean leftIncluded, rightIncluded;

            if (this.min < other.min){
                left = this.min;
                leftIncluded = this.inclMin;
            } else {
                left = other.min;
                leftIncluded = other.inclMin;
            }

            if (this.max > other.max){
                right = this.max;
                rightIncluded = this.inclMax;
            } else {
                right = other.max;
                rightIncluded = other.inclMax;
            }

            return new Interval(left, right, leftIncluded, rightIncluded);
        }

        @Override
        public String toString() {
            String result = "";
            if (inclMin) result += "[";
            result += min + ", " + max;
            if (inclMax) result += "]";

            return result;
        }
    }

    public static Interval findLargest(Interval[] intervals){
        double min = intervals[0].min;
        double max = intervals[0].max;

        for (int i = 1; i < intervals.length; i++){
            if (intervals[i].min < min){
                min = intervals[i].min;
            }
            if (intervals[i].max > max){
                max = intervals[i].max;
            }
        }

        return new Interval(min, max);
    }

    public static Interval findMax(){
        return new Interval();
    }

    public static void main(String[] args) {
        Interval interval_1 = new Interval(-5, 500);
        Interval interval_2 = new Interval(-10, 45);
        System.out.println(interval_1.getIntersection(interval_2));

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Interval[] intervals = new Interval[n];

        for (int i = 0; i < n; i++){
            String[] strInterval = scanner.nextLine().split(" ");
            double a, b;
            boolean ai = true, bi = true;

            a = Double.parseDouble(strInterval[0]);
            b = Double.parseDouble(strInterval[1]);

            if (strInterval.length == 4){
                ai = strInterval[2].equals("1");
                bi = strInterval[3].equals("1");
            }

            intervals[i] = new Interval(a, b, ai, bi);
        }

        Interval largestInterval = findLargest(intervals);
        System.out.println(largestInterval);
    }
}