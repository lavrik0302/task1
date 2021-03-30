package epam.jwd.task5.unit;

public class PerfectNumbersLogics {


    public static boolean isPerfect(long num) {
        boolean isPerfect;
        if (num <= 0) {
            isPerfect = false;
        } else {
            long divisorsSum = calculateDivisorsSum(num);
            isPerfect = num == divisorsSum;
        }
        return isPerfect;
    }


    public static long calculateDivisorsSum(long num) {


        long numberAbs = Math.abs(num);

        long divisorsSum;
        if (numberAbs == 0) {


            divisorsSum = Long.MAX_VALUE;
        } else if (numberAbs == 1) {


            divisorsSum = 0;
        } else {


            divisorsSum = 1;
            for (long i = 2; i <= Math.sqrt(numberAbs); i++) {
                if (numberAbs % i == 0) {
                    divisorsSum += i;
                    if (i * i != numberAbs) {
                        divisorsSum += numberAbs / i;
                    }
                }
            }
        }
        return divisorsSum;
    }
}
