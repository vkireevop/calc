import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws enterException {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        System.out.println(calc(input));
    }
    public static boolean isNumeric(String string) {
        return string != null && !string.equals("");
        }

    public static String calc(String input) throws enterException {
        int [] array= new int[4];
        array[0] = input.indexOf("+");
        array[1] = input.indexOf("-");
        array[2] = input.indexOf("*");
        array[3] = input.indexOf("/");
        int trueIndex = 0;
        for (int i=0; i<=4; i++)
        {
            try {


                if (array[i] != -1) {
                    trueIndex += i;
                    break;
                }
            }
            catch (Exception e)
            {
                System.out.println("Вы ввели не правильный операнд выражение");
            }
        }
        String result ="";
        String strings [];
        switch (trueIndex) {
            case (0) -> {
                strings = input.split("\\+");
                if (strings.length>=3)
                {
                    throw new enterException("Вы ввели больше двух операндов");
                }
                if (isNumeric(strings[0]) && isNumeric(strings[1]))
                {
                    int a=0;
                    int b=0;
                    try {
                        a = Integer.parseInt(strings[0]);
                        b = Integer.parseInt(strings[1]);
                    }
                    catch (NumberFormatException e)
                    {
                        System.out.println("Числа не в правильном формате");
                        return "error";
                    }
                    if ((a >= 1) & (a <= 10))
                    {

                    }
                    else {
                        throw new enterException("Вы ввели число не в диапозоне от 1 до 10");
                    }
                    if ((b >= 1) & (b <= 10))
                    {

                    }
                    else {
                        throw new enterException("Вы ввели число не в диапозоне от 1 до 10");
                    }
                    int c = plus(a, b);
                    result = Integer.toString(c);
                }
                else if ((strings[0].contains("I") | strings[0].contains("V") | strings[0].contains("X")) &&
                        (strings[1].contains("I") | strings[1].contains("V") | strings[1].contains("X")) )
                {
                  int a = perevodA(strings[0]);
                  int b = perevodB(strings[1]);
                  int c = plus(a,b);
                    try {
                        result = reversePerevodresult(c);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            case (1) -> {
                strings = input.split("-");
                if (strings.length>=3)
                {
                    throw new enterException("Вы ввели больше двух операндов");
                }
                if (isNumeric(strings[0]) && isNumeric(strings[1]))
                {
                    int a=0;
                    int b=0;
                    try {
                        a = Integer.parseInt(strings[0]);
                        b = Integer.parseInt(strings[1]);
                    }
                    catch (NumberFormatException e)
                    {
                        System.out.println("Числа не в правильном формате");
                        return "error";
                    }
                    if ((a >= 1) & (a <= 10))
                    {

                    }
                    else {
                        throw new enterException("Вы ввели число не в диапозоне от 1 до 10");
                    }
                    if ((b >= 1) & (b <= 10))
                    {

                    }
                    else {
                        throw new enterException("Вы ввели число не в диапозоне от 1 до 10");
                    }
                    int c = minus(a, b);
                    result = Integer.toString(c);

                }
                else if ((strings[0].contains("I") | strings[0].contains("V") | strings[0].contains("X")) &&
                        (strings[1].contains("I") | strings[1].contains("V") | strings[1].contains("X")) )
                {
                    int a = perevodA(strings[0]);
                    int b = perevodB(strings[1]);
                    int c = minus(a,b);
                    try {
                        result = reversePerevodresult(c);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }

                }
                else
                {
                    throw new enterException("Вы ввели число не в диапозоне от 1 до 10");
                }
            }
            case (2) -> {
                strings = input.split("\\*");
                if (strings.length>=3)
                {
                    throw new enterException("Вы ввели больше двух операндов");
                }
                if (isNumeric(strings[0]) && isNumeric(strings[1]))
                {
                    int a=0;
                    int b=0;
                    try {
                        a = Integer.parseInt(strings[0]);
                        b = Integer.parseInt(strings[1]);
                    }
                    catch (NumberFormatException e)
                    {
                        System.out.println("Числа не в правильном формате");
                        return "error";
                    }
                    if ((a >= 1) & (a <= 10))
                    {

                    }
                    else {
                        throw new enterException("Вы ввели число не в диапозоне от 1 до 10");
                    }
                    if ((b >= 1) & (b <= 10))
                    {

                    }
                    else {
                        throw new enterException("Вы ввели число не в диапозоне от 1 до 10");
                    }
                    int c = multiplication(a, b);
                    result = Integer.toString(c);
                }
                else if ((strings[0].contains("I") | strings[0].contains("V") | strings[0].contains("X")) &&
                        (strings[1].contains("I") | strings[1].contains("V") | strings[1].contains("X")) )
                {
                    int a = perevodA(strings[0]);
                    int b = perevodB(strings[1]);
                    int c = multiplication(a,b);
                    try {
                        result = reversePerevodresult(c);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
            case (3) -> {
                strings = input.split("/");
                if (strings.length>=3)
                {
                    throw new enterException("Вы ввели больше двух операндов");
                }
                if (isNumeric(strings[0]) && isNumeric(strings[1]))
                {
                    int a=0;
                    int b=0;
                    try {
                        a = Integer.parseInt(strings[0]);
                        b = Integer.parseInt(strings[1]);
                    }
                    catch (NumberFormatException e)
                    {
                        System.out.println("Числа не в правильном формате");
                        return "error";
                    }
                    if ((a >= 1) & (a <= 10))
                    {

                    }
                    else {
                        throw new enterException("Вы ввели число не в диапозоне от 1 до 10");
                    }
                    if ((b >= 1) & (b <= 10))
                    {

                    }
                    else {
                        throw new enterException("Вы ввели число не в диапозоне от 1 до 10");
                    }
                    int c = division(a, b);
                    result = Integer.toString(c);
                }
                else if ((strings[0].contains("I") | strings[0].contains("V") | strings[0].contains("X")) &&
                            (strings[1].contains("I") | strings[1].contains("V") | strings[1].contains("X")) )
                    {
                    int a = perevodA(strings[0]);
                    int b = perevodB(strings[1]);
                    int c = division(a,b);
                    try {
                        result = reversePerevodresult(c);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
        }
        return result;
    }
        static int plus(int a,int b)
        {
            return a+b;
        }
        static int minus(int a,int b)
        {
            return a-b;
        }
        static int multiplication(int a,int b)
        {
            return a*b;
        }
        static int division(int a,int b)
        {
            return a/b;
        }
    public static int perevodA(String a){
        romanNumeral a1 = romanNumeral.valueOf(a);

        return a1.getValue();
    }
    public static int perevodB(String b){
        romanNumeral a2 = romanNumeral.valueOf(b);
        return a2.getValue();
    }
    public static String reversePerevodresult (int a) throws IOException {
        if (a<0)
        {
           IOException e ;
        }
        romanNumeral [] a1 = romanNumeral.values();
        romanNumeral a2 = a1 [a];
        return a2.toString();
    }
}
enum romanNumeral {
    O(0), I(1), II(2), III(3), IV(4), V(5), VI(6), VII(7),
    VIII(8), IX(9), X(10), XI(11), XII(12), XIII(13), XIV(14),
    XV(15), XVI(16), XVII(17), XVIII(18), XIX(19), XX(20), XXI(21),
    XXII(22), XXIII(23), XXIV(24), XXV(25), XXVI(26), XXVII(27), XXVIII(28),
    XXIX(29), XXX(30), XXXI(31), XXXII(32), XXXIII(33), XXXIV(34), XXXV(35),
    XXXVI(36), XXXVII(37), XXXVIII(38), XXXIX(39), XL(40), XLI(41), XLII(42),
    XLIII(43), XLIV(44), XLV(45), XLVI(46), XLVII(47), XLVIII(48), XLIX(49),
    L(50), LI(51), LII(52), LIII(53), LIV(54), LV(55), LVI(56), LVII(57),
    LVIII(58), LIX(59), LX(60), LXI(61), LXII(62), LXIII(63), LXIV(64), LXV(65),
    LXVI(66), LXVII(67), LXVIII(68), LXIX(69), LXX(70), LXXI(71), LXXII(72), LXXIII(73),
    LXXIV(74), LXXV(75), LXXVI(76), LXXVII(77), LXXVIII(78), LXXIX(79), LXXX(80),
    LXXXI(81), LXXXII(82), LXXXIII(83), LXXXIV(84), LXXXV(85), LXXXVI(86), LXXXVII(87),
    LXXXVIII(88), LXXXIX(89), XC(90), XCI(91), XCII(92), XCIII(93), XCIV(94), XCV(95),
    XCVI(96), XCVII(97), XCVIII(98), XCIX(99), C(100);
    private int value;

    romanNumeral(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
    class enterException extends Exception {
        public enterException(String message) {
            super(message);
        }

        public enterException() {

        }


    }

