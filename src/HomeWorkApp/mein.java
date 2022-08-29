package HomeWorkApp;

public class mein {
    public class checkSumSign {
        public static void main(String[] args) {
            int a = 10;
            float b;
            b = 5;
            int c = (int) (a + b);
            System.out.println("c = " + c);
            if (c >= 0) {
                System.out.println("сумма положительная");
            }
        }
    }
    public class compareNumbers {
        public static void main(String[] args) {
            int a=0;
            int b=10;
            if (a>=b) {
                System.out.println("a>= b");
            }
            if (a<=b) {
                System.out.println("a<b");
            }
        }
    }
    public class  printColor {
        public static void main(String[] args) {
            int value = 50;
            if (value >= 0) {
                System.out.println("Красный");
            }
            if (value <= 100) {
                System.out.println("Желтый");
            }
            if (value>100) {
                System.out.println("Зелёный");
            }
        }
    }
        public class ThreeWords {
        public static void main(String[] args) {
            System.out.println("Banana!");
            System.out.println ("Apple");
            System.out.println("Orange");
        }
    }
}
