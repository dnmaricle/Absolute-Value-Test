/*package-info.java/
 * This business logic calculates circuit
 * of voltage, amperage, and resistance
 * and gives the missing value (given that the
 * user has the other two values) back to
 * the user interface.
 */
package bp;
 /**
  * This class calculates a electrical circuit with
  * the variables voltage, amperage, and resistance
  * given the fact that the user knows the other
  * two variables.
  * @author David Maricle
  *@version 1.5
  */
     public final class Circuit {
	 /**
	 * Instantiating the value of the volts.
	 */
	 public double volts;
	 /**
	  * Instantiating the value of the amperage.
	  */
     public double amperage;
     /**
      * Instantiating the value of the resistance.
      */
     public double resistance;
 /**
  * This method sets the value of the voltage after
  * checking to see if the user input is valid.
  * @param v1 value used to set the volts for further use in program.
  * @throws NumberFormatException throws out numbers not in standard format
  * of voltage, amperage, and resistance.
  */
public void setVolts(
		 final double v1) throws NumberFormatException {
    	if (v1 <= 0) {
throw new NumberFormatException(
		"Please enter a positive value and rerun the program.");
        }
    	volts = v1;
}
/**
 * Second voltage accessor method that check if the user has inputed a
 * value that is a double.
 * @param pVoltage the value the user has inputted.
 * @throws NumberFormatException throws any values that are not in
 * double format.
 */
public void setVolts2(
		 final String pVoltage) throws NumberFormatException {
	double v1 = Double.parseDouble(pVoltage);
	if (v1 == Double.NaN) {
		throw new NumberFormatException(
				"Invalid format. Please rerun program.");
	}
	volts = v1;
}
    /**
     * This method sets the value of the amperage after
     * checking to see if the user input is valid.
     * @param a1 variable used to set the value of the
     * amperage for further use in the program.
     * @throws NumberFormatException throws any number that
     * is not in standard format for calculating
     * the voltage, amperage, or the resistance.
     */
    public void setAmperage(
    		final double a1) throws NumberFormatException {
    	if (a1 <= 0) {
throw new NumberFormatException(
"Please enter a positive value and rerun the program.");
    	}
    	/**
    	 * The amperage for the circuit is assigned to the value
    	 * the user has inputted.
    	 */
       amperage = a1;
       }
    /**
     * Second amperage accessor method that checks to see if the user
     * has inputed a double value.
     * @param pResistance the value that the user has inputted for 
     * the resistance.
     * @throws NumberFormatException throws out any values that are not in
     * double format.
     */
    public void setAmperage2(
    		final String pResistance) throws NumberFormatException {
    	double a1 = Double.parseDouble(pResistance);
    	if (a1 == Double.NaN) {
    		throw new NumberFormatException(
    				"Invalid format. Please rerun program.");
    	}
    	amperage = a1;
    }
    /**
     * This method sets the value of the resistance after
     * checking to see if the user
     * input is valid.
     * @param r1 value used to set the value of the resistance
     * @throws NumberFormatException throws away any values
     * that are not in standard format
     * to calculate the voltage, amperage, or resistance.
     */
public void setResistance(
		final double r1) throws NumberFormatException {
    	if (r1 <= 0) {
throw new NumberFormatException(
"Please enter a positive value and rerun the program.");
    	}
        resistance = r1;
        }
/**
 * Second resistance accessor method to check if the user
 * has inputed a value in double format.
 * @param pResistance the value the user has inputed for the resistance
 * @throws NumberFormatException throws out any values that are
 * not in value format.
 */
public void setResistance2(
		final String pResistance) throws NumberFormatException {
	double r1 = Double.parseDouble(pResistance);
	if (r1 == Double.NaN) {
		throw new NumberFormatException(
				"Invalid format. Please rerun program.");
	}
	resistance = r1;
}
    /**
     * This method gets the value of the voltage that was previously
     * calculated and returns that value to the user.
     * @return the value of the voltage.
     */
    public double getVolts() {
        return volts;
    }
    /**
     * This method gets the value of the amperage that was previously
     * calculated and returns that value to the user.
     * @return the value of the amperage.
     */
    public double getAmperage() {
        return amperage; }
    /**
     * This method gets the value of the resistance that was previously
     * calculated and returns that value to the user.
     * @return the value of the resistance.
     */
    public double getResistance() {
        return resistance; }
    /**
     * This method calculates the value of the voltage given the value of
     * the amperage and the resistance previously set by the user.
     */
  public void calculateVolts() {
 volts = amperage * resistance;
}
 /**
  * This method calculates the value of the amperage given the value of
  * the voltage and the resistance previously set by the user.
  */
   public void calculateAmperage() {
     amperage = volts / resistance;
   }
 /**
  * This method calculates the value of the resistance given the value of
  * the voltage and the amperage.
  */
  public void calculateResistance() {
      resistance = volts / amperage;
      }
}

