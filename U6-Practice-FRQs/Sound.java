public class Sound {

    /* the array of values in this sound; guaranteed not to be null */
    private int[] samples;
  
    /* constructor not shown */
    
    public Sound(int[] samples) {
        this.samples = samples;
    }
    
    
    public int[] getSamples() {
        return samples;
    }
    
    /* Changes those values in this sound that have an amplitude
     * greater than limit. Values greater than limit are changed to
     * limit. Values less than -limit are changed to -limit.
     * The method returns the total number of values that were changed
     * in the array.
     *
     * PRECONDITION: limit ≥ 0
     */
    public int limitAmplitude(int limit) {
        int numChanges = 0;
        for (int i = 0; i < samples.length; i++) {
            if (Math.abs(samples[i]) > limit){
                samples[i] = samples[i] > 0 ? limit : limit * -1;
                numChanges++;
            }
        }
        return numChanges;
        
        }
        
  
    /* Removes all silence from the beginning of this sound.
     * Silence is represented by a value of 0.
     *
     * PRECONDITION: samples contains at least one nonzero value
     *
     * POSTCONDITION: the length of samples reflects the removal
     *                of starting silence
     */
    public void trimSilenceFromBeginning() {
        
        int numContZeros = 0;
        
        int index = 0;
        while (true) {
        if (samples[index] == 0) {
            numContZeros++;
        } else {
            break;
        }
        index++;
        }
        
        int[] placeholder = new int[samples.length - numContZeros];
        for (int i = numContZeros; i < samples.length; i++) {
        placeholder[i - numContZeros] = samples[i];
        }
        samples = placeholder;
        }
        
 }
 
