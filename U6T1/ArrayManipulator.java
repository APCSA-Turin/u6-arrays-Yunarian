public class ArrayManipulator {
  
    // instance variables
    private int[] nums;
    private String[] words;
  
    /** Constructor that returns a new ArrayManipulator
     *  @param nums  The array of nums
     *  @param howManyStrings  How many elements to put in the words array
     */
    public ArrayManipulator(int[] nums, int howManyStrings) {
        this.nums = nums;
        words = new String[howManyStrings];
    }
  
  
    /** Returns the index of the middle element of nums; if the length of the list
     *  is even, should return the index of the earlier middle element
     *  Precondition: length of nums >= 3
     *
     *  @return  the index of the middle element of nums
     *
     *  Example: if ints[] is {4, 6, 10}, the indices are 0, 1, and 2, so this
                 method returns the middle index, 1
     *  Example: if ints[] is {4, 5, 6, 10}, the indices are 0, 1, 2, 3, and two
                 middle indices are 1 and 2, so return 1 (te earlier of the two)
     */
    public int getNumsMiddleIndex() {
        if (nums.length % 2.0 == 0) {
            return nums.length /  2 - 1;
        } else {
            return nums.length / 2;
        }
    }
  
  
    /** Returns the average, as a double, of the average of the first, last, and
     *  middle elements of nums; the middle element should be the element at the
     *  index determined by getNumsMiddleIndex
     *
     *  @return  the average of the first, last, and middle elements
     */
    public double getNumsAverage() {
        return (nums[0] + nums[getNumsMiddleIndex()] + nums[nums.length - 1]) / 3.0;
    }
  
  
    /** Returns true if both the nums and words arrays have the same number of
     *  elements, returns false otherwise.
     *
     *  @return  returns true if the  two arrays are equal in length; false if not
     */
    public boolean sameLengths() { 
        return nums.length == words.length;
    }
  
    /** Updates the element of the words array at index idx to the new value
     *  provided and returns true to indicate a successful update; if, however,
     *  idx exceeds the bounds of the words array, do NOT update the array and
     *  return false to indicate that the update was unsuccessful.
     *
     *  @return  true if the update was successful, false otherwise.
     */
    public boolean updateWordsListAt(int idx, String newValue) {
        if (idx >= words.length) {
            return false;
        } else {
            words[idx] = newValue;
            return true;
        }
    }
  
  
    /** Returns the number of characters that are contained in the last element of
     *  the words list; however, if the last element of the array is null return 0
     *
     *  @return  how many characters are in the last element of words; 0 if the 
     *           last element is null
     */
    public int howLongLastWord() {
        if (words[words.length - 1] == null) {
            return 0;
        } else {
            return words[words.length - 1].length();
        }
    }
  
  
    /** Returns the int in the nums array located at the specified index
     *  PRECONDITION:  assume idx < length of nums
     *
     *  @return  the int in the nums array located at index idx
     */
    public int getNumAt(int idx) {
        return nums[idx];
    }
    
  
    /** Returns the String in the words array located at the specified index
     *  PRECONDITION:  assume idx < length of words
     *
     *  @return  the int in the nums array located at index idx
     */
    public String getWordAt(int idx) {
        return words[idx];
    }

    /** Changes the first and last element of nums to be num
    *
     *  THIS METHOD MUTATES (MODIFIES) ORIGINAL ARRAY
    *  PRECONDITION: nums.length > 0
    */
    public static void bookEnd(int[] nums, int num) {
        nums[0] = num;
        nums[nums.length - 1] = num;
    }

    /** Multiplies each number in numList by multiplier.
    *
    *  THIS METHOD MUTATES (MODIFIES) ORIGINAL ARRAY
    *  PRECONDITION: numList.length > 0
    */
    public static void multiplyBy(int[] numList, int multiplier) {
        for (int i = 0; i < numList.length; i++) {
            numList[i] = numList[i] * multiplier;
        }
    }

    /** Returns an array of ints where each element is the product
    *  of the corresponding element in numList and multiplier.
    *
    *  THIS METHOD DOES NOT MUTATE (MODIFY) ORIGINAL ARRAY
    *  PRECONDITION: numList.length > 0
    */
    public static int[] multiplyByNoModify(int[] numList, int multiplier) {
        int[] returnedArray = new int[numList.length];
        for (int i = 0; i < numList.length; i++) {
            returnedArray[i] = numList[i] * multiplier;
        }
        return returnedArray;
    }

    /** Adds a "!" to the end of each String in wordList.  However, if a
    *  a string already ends in an exclamation point, do NOT add another.
    *
    *  THIS METHOD MUTATES (MODIFIES) ORIGINAL ARRAY
    *  PRECONDITION: wordList.length > 0
    */
    public static void addExclamation(String[] wordList) {
        for (int i = 0; i < wordList.length; i++) {
            if (!wordList[i].substring(wordList[i].length() - 1).equals("!")) {
                wordList[i] += "!";
            }
        }
    }

    /** Returns an array of booleans where each element reflects whether
    *  the corresponding element in tempList is at or below the freezing
    *  temperature of 32 (true) or not (false).
    *
    *  THIS METHOD DOES NOT MUTATE (MODIFY) ORIGINAL ARRAY
    *  PRECONDITION: tempList.length > 0
    */
    public static boolean[] isFreezing(int[] tempList) {
        boolean[] returnedArray = new boolean[tempList.length]; 
        for (int i = 0; i < tempList.length; i++) {
            if (tempList[i] <= 32) {
                returnedArray[i] = true;
            } else {
                returnedArray[i] = false;
            }
        }
        return returnedArray;
    }

    /** Shifts all elements in numList to the LEFT one index
    *
    *  The first element in the array should wrap around
    *  to the back of the array.  For example, given the array
    *  {5, 1, 3, 4, 7, 6}, this method modifies the array
    *  to {1, 3, 4, 7, 6, 5} (all elements shifted left one
    *  with the last element wrapping around to the back)
    *
    *  THIS METHOD MUTATES (MODIFIES) ORIGINAL ARRAY
    *  PRECONDITION: numList.length > 0
    */
    public static void shiftLeft(int[] numList) {
        int first = numList[0];
        for (int i = 0; i < numList.length - 1; i++) {
            numList[i] = numList[i + 1];
        }
        numList[numList.length - 1] = first;
    }

    /** Shifts all elements in numList to the RIGHT one index.
    *
    *  The last element in the array should wrap around
    *  to the front of the array.  For example, given the array
    *  {5, 1, 3, 4, 7, 6}, this method modifies the array
    *  to {6, 5, 1, 3, 4, 7} (all elements shifted right one
    *  with the last element wrapping around to the front)
    *
    *  THIS METHOD MUTATES (MODIFIES) ORIGINAL ARRAY
    *  PRECONDITION: numList.length > 0
    */
    public static void shiftRight(int[] numList) {
        int last = numList[numList.length - 1];
        for (int i = numList.length - 1; i > 0; i--) {
            numList[i] = numList[i - 1];
        }
        numList[0] = last;
    }

    
    /** Reverses all elements in an array.
    *
    *  For example, given the array {5, 1, 3, 4, 7, 6}, this method
    *  modifies the array to {6, 7, 4, 3, 1, 5}.
    *  Should work with all array lengths (both odd and even).
    *
    *  THIS METHOD MUTATES (MODIFIES) ORIGINAL ARRAY
    *  PRECONDITION: numList.length > 0
    */
    public static void reverse(int[] numList) {
        int[] temp = new int[numList.length];
        for (int i = 0; i < numList.length; i++) {
            temp[i] = numList[i];
        }

        for (int i = 0; i < numList.length; i++) {
            numList[i] = temp[temp.length - i - 1];
        }
    }

    public static void reverseInPlace(int[] numList) {
        for (int i = 0; i < numList.length / 2; i++) {
            int temp = numList[numList.length - i - 1];
            numList[numList.length - i - 1] = numList[i];
            numList[i] = temp;
        }
    }

  }
  