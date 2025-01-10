public class Payroll {
    private int[] itemsSold; // number of items sold by each employee
    private double[] wages; // wages to be computed in part (b)
    

    public Payroll(int[] items) {
      itemsSold = items;
      wages = new double[items.length];
    }

    public double[] getWages() {
    return wages;
    }

   
    /*  Returns the bonus threshold as described in part (a).
     */
    public double computeBonusThreshold() {
        int min = itemsSold[0];
        int max = itemsSold[0];
        int sum = 0;
        
        for (int i = 0; i < itemsSold.length; i++) {
        sum += itemsSold[i];
        if (itemsSold[i] < min) {
            min = itemsSold[i];
        } else if (itemsSold[i] > max) {
            max = itemsSold[i];
        }
        }
        
        sum -= min;
        sum -= max;
            return (double) sum / (itemsSold.length - 2);
        }
        
   
    /* Computes employee wages as described in part (b) and stores
       them in wages. The parameter fixedWage represents the fixed
       amount each employee is paid per day. The parameter
       perItemWage represents the amount each employee is paid per
       item sold.
     */
    public void computeWages(double fixedWage, double perItemWage) {
        double bonusThres = computeBonusThreshold();
        for (int i = 0; i < itemsSold.length; i++) {
        if (itemsSold[i] > bonusThres) {
        wages[i] = (fixedWage + perItemWage * itemsSold[i]) * 1.1;
        } else {
        wages[i] = fixedWage + perItemWage * itemsSold[i];
        }
        }
        }
        
  }
  
