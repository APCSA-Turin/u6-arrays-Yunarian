package U6T3;

public class ArrayAlgorithms {
    private ArrayAlgorithms() {}

    /** Returns the longest String(s) in an array of Strings.
     *  If multiple strings are tied for longest length, return the last
     *  element in the list with that length.
     *
     *  This method does NOT modify the original array.
     *  PRECONDITION: stringList.length > 0
     */
    public static String longestString(String[] stringList) {
        String longestString = stringList[0];
        for (String string: stringList) {
            if (string.length() >= longestString.length()) {
                longestString = string;
            }
        }
        // IMPLEMENT ME using an enhanced for loop
        return longestString;
    }

    /** Returns true if ANY of the ints in numList are positive, otherwise, 
     *  returns false; use an early return to improve efficiency
     *  note: 0 is not considered positive
     *
     *  This method does NOT modify the original array.
     *  PRECONDITION: numList.length > 0
     */
    public static boolean containsPositive(int[] numList) {
        for (int num: numList) {
            if (num > 0) {
                return true;
            }
        }
        // IMPLEMENT ME using an enhanced for loop and early return
        return false;
    }

    /** Returns a NEW array of Strings that contains all words from the original
     *  array of strings in lowercase (use the toLowerCase() string method)
     *
     *  This method does NOT modify the original array
     *  PRECONDITION: wordList.length > 0
     */
    public static String[] makeLowercase(String[] wordList) {
        String[] wordListCopy = new String[wordList.length];
        for (int i = 0; i < wordList.length; i++) {
            wordListCopy[i] = wordList[i].toLowerCase();
        }
        return wordListCopy;
    }

    /** Returns the number of Strings in stringList that have an exclamation point
     *  ("!") at the end.
     *
     *  This method does NOT modify the original array.
     *  PRECONDITION: stringList.length > 0
     */
    public static int endsInExclamations(String[] stringList) {
        int exclaimationEnds = 0;
        for (String string: stringList) {
            if (string.substring(string.length() - 1, string.length()).equals("!")) {
                exclaimationEnds++;
            }
        }
        return exclaimationEnds;
    }

    /** Updates each String in the array to be all uppercase; this method does
     *  not return a value
     *
     *  This method MODIFIED the original array
     *  PRECONDITION: wordList.length > 0
     */
    public static void makeUppercase(String[] wordList) {
        for (int i = 0; i < wordList.length; i++) {
            wordList[i] = wordList[i].toUpperCase();
        }
    }

    /** Returns a NEW array of ints that contains the higher value of each pair
     *  of elements at the same index in two other equally-sized arrays of ints
     *  For example, if intArr1 = {2, 5, 6, 1, 0} and intArr2 = {1, 7, 6, -2, 8}, 
     *  this method returns the array {2, 7, 6, 1, 8}, where each value is the 
     *  higher of the two at that respective index in the two original arrays
     *
     *  This method does NOT modify either of the original arrays
     *  PRECONDITION: intArr1.length == intArr2.length
     */
    public static int[] arrayMaximums(int[] intArr1, int[] intArr2) {
        int[] higherInt = new int[intArr1.length];
        for (int i = 0; i < intArr1.length; i++) {
            if (intArr1[i] > intArr2[i]) {
                higherInt[i] = intArr1[i];
            } else {
                higherInt[i] = intArr2[i];
            }
        }
        return higherInt;
    }

    /** Returns the number of elements in the numList array that have the same 
     *  value as the element immediately adjacent to the right in the array.
     *  
     *  For example, given the array {4, 7, 7, 3, 2, 2, 4, 4, 4, 6, 4, 6, 6}
     *  this method would return 5, since there are five numbers in the array that
     *  are equal to the number immediately to the right (shown below in blue):
     *                    {4, 7, 7, 3, 2, 2, 4, 4, 4, 6, 4, 6, 6}
     *
     *  This method does NOT modify the original array.
     *  PRECONDITION: numList.length > 0
     */
    public static int countConsecutiveDoubles(int[] numList) {
        int numConseqs = 0;
        for (int i  = 0; i < numList.length - 1; i++) {
            if (numList[i] == numList[i + 1]) {
                numConseqs++;
            }
        }
        return numConseqs;
    }

    /** Returns the "longest streak" of the array; a streak is the number of times
     *  a particular number is repeated consecutively, one after the other
     *
     *  This method does NOT modify the original array.
     *  PRECONDITION: numList.length > 0
     */
    public static int longestStreak(int[] nums) {
        int longestStreak = 0;
        int currentStreak = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {   
                currentStreak++;
            } else {

                currentStreak = 1;
            }
            if (currentStreak > longestStreak) {
                longestStreak = currentStreak;
            }
        }
        return longestStreak;
    }

}
