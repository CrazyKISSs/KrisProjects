package module6.t01;

/**
 * Метод, возвращающий true, если среди четырех его аргументов ровно два истинны (любые).
 * Во всех остальных случаях метод должен возвращать false.
 */
public class ProgectQu {

    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        boolean result;

        if ((a & b) & (a ^ c) & (a ^ d))
            result = true;
        else if ((c & d) & (c ^ a) & (c ^ b))
            result = true;
        else if ((a & c) & (a ^ b) & (a ^ d))
            result = true;
        else if ((b & d) & (b ^ a) & (b ^ c))
            result = true;
        else if ((a & d) & (a ^ b) & (a ^ c))
            result = true;
        else if ((b & c) & (b ^ a) & (b ^ d))
            result = true;
        else
            result = false;
        return result;
    }

    public static void main(String[] args) {
        boolean result = booleanExpression(true, false, true, false);
        System.out.println(result);
    }
}

