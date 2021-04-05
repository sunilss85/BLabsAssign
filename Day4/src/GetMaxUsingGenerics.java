
public class GetMaxUsingGenerics<T extends Comparable<T>> {

    public static void main(String[] args) {
        Integer a = 1118, b = 10, c = 110;
        Float x = 1.1f, y = 10.1f, z = 2.2f;
        String m="Ant", n="Who", o="How";
        System.out.println(printMax (a,b,c));
        System.out.println(printMax (x,y,z));
        System.out.println(printMax (m,n,o));
    }


    private static <T extends Comparable<T>> T printMax(T x, T y, T z) {
        T retVal = x;
        if (retVal.compareTo(y) < 0) {
            retVal = y;
        }
        if (retVal.compareTo(z) < 0) {
            retVal = z;
        }
        return retVal;
    }

   /* private static Integer printMax (Integer x, Integer y, Integer z) {
        Integer retVal = x;
        if (retVal.compareTo(y) < 0) {
            retVal = y;
        }
        if (retVal.compareTo(z) < 0) {
            retVal = z;
        }
        return retVal;
    }

    private static Float printMax (Float x, Float y, Float z) {
        Float retVal = x;
        if (retVal.compareTo(y) < 0) {
            retVal = y;
        }
        if (retVal.compareTo(z) < 0) {
            retVal = z;
        }
        return retVal;
    }

    private static String printMax (String x, String y, String z) {
        String retVal = x;
        if (retVal.compareTo(y) < 0) {
            retVal = y;
        }
        if (retVal.compareTo(z) < 0) {
            retVal = z;
        }
        return retVal;
    }
*/
}
