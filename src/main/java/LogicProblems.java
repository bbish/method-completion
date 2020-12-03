public class LogicProblems {
    /*
     * squirrelPlay()
     * The squirrels in Palo Alto spend most of the day playing. In particular, they play if the temperature is between
     * 60 and 90 (inclusive). Unless it is summer, then the upper limit is 100 instead of 90. Given an int temperature
     * and a boolean isSummer, return true if the squirrels play and false otherwise.
     *
     * Examples:
     * - squirrelPlay(70, false) → true
     * - squirrelPlay(95, false) → false
     * - squirrelPlay(95, true) → true
     */
    public boolean squirrelPlay(int temp, boolean isSummer) {
        boolean play = false;

        if(isSummer) {
            if(temp>=60 && temp <= 100) {
                play=true;
            }
        } else {
            if(temp>=60 && temp <= 90) {
                play=true;
            }
        }
        return play;
    }

    /*
     * nearTen()
     * Given a non-negative number "num", return true if num is within 2 of a multiple of 10. Note: (a % b) is the
     * remainder of dividing a by b, so (7 % 5) is 2.
     *
     * Examples:
     * - nearTen(12) → true
     * - nearTen(17) → false
     * - nearTen(19) → true
     */
    public boolean nearTen(int num) {
        boolean within2 = false;

        //check if remainder is less than 2 or greater than 8
        if((num % 10 <=2) || (num % 10 >=8))
            within2 = true;

        return within2;
    }

}
