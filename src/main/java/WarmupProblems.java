public class WarmupProblems {
    /*
     * stringTimes()
     *
     * Given a string, str, and a non-negative and non-zero integer, n, return a larger string that is n copies of the original
     * string.
     *
     * Examples:
     * - stringTimes("Hi", 2) → "HiHi"
     * - stringTimes("Hi", 3) → "HiHiHi"
     * - stringTimes("Hi", 1) → "Hi"
     */
    //stringTimes("Hi", 2);
    public String stringTimes(String str, int n) {
        String newStr = "";
        for(int i = 0; i < n; i++) {
            newStr += str;
        }
        return newStr;
    }

    /*
     * icyHot()
     *
     * Given two temperatures, temp1 and temp2, return true if one is less than 0 and the other is greater than 100.
     *
     * Examples:
     * - icyHot(120, -1) → true
     * - icyHot(-1, 120) → true
     * - icyHot(2, 120) → false
     */
    public boolean icyHot(int temp1, int temp2) {
        if((temp1 < 0 && temp2 >100) ||(temp1 > 100 && temp2 < 0)){
            return true;
        } else
            return false;
    }
}
