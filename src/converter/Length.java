package converter;
/**
 * This enum collect all value and unit of length
 * @author wasuthun wanaphongthipakorn
 *
 */
public enum Length {
	METER (1.0000),
	CENTIMETER (0.0100),
	KILOMETER (1000.0),
	MILE (1609.344),
	FOOT (0.30480),
	WA (2.00000),
	AU (149597870700.0);
	
	private final double lenght;
	/**
	 * Private constructor
	 * @param value
	 */
	private Length(double value) {
			this.lenght=value;
	}
	/**
	 * Access a value of length
	 * @return value of length
	 */
	public double getValue() {
		return lenght;
	}
	
}
