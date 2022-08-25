public class Ejercicio_5 {
    public static void main(String[] args) {
        double fracc1, fracc2, fracc3, fracc4, denominador1, denominador2, res1;
        fracc1 = (double) 6/5;
        fracc2 = (double) -(2/3);
        fracc3 = (double) 7/2;
        fracc4 = (double) 2/30;
        denominador1 = (double) fracc2 * fracc3;
        denominador2 = (double) fracc1 + fracc4;
        res1 = (double) denominador1 + denominador2;

        System.out.println(res1);

        double fracc5, fracc6, denominador3, res2;
        fracc5 = (double) 1/3;
        fracc6 = (double) 5;
        res2 = (double) fracc5 / fracc6;

        double resfinal;
        resfinal = (double) res1 + res2;

        System.out.println(resfinal);

    }
}
