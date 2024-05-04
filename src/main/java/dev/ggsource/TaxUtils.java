/////////////////////////////////////////////////////////////////////////////////////////
// Title: Effective Income Rate Calculator
/////////////////////////////////////////////////////////////////////////////////////////
//
// Date Created: 5/3/2024
// Description: Takes an income and calculates the effective tax rate. Then it
//				shows the net income annually and on a bi-weekly schedule.
/////////////////////////////////////////////////////////////////////////////////////////

package dev.ggsource;

import java.util.TreeMap;

public class TaxUtils {
	// 1. We get the income
	// 2. Determine the maximum tax bracket it falls into
	// 3. Calculate how much is going to be paid in Federal Taxes
	// 4. Add State Taxes
	private static TreeMap<Double, Double> incomeBrackets = new TreeMap<>();
	static {
		incomeBrackets.put(0.0, 10.0); // 10% Tax rate up to $11,000
		incomeBrackets.put(11001.0, 12.0); // 12% Tax rate up to $44,725
		incomeBrackets.put(44726.0, 22.0); // 22% Tax rate up to $95,375
		incomeBrackets.put(95376.0, 24.0); // 24% Tax rate up to $182,100
		incomeBrackets.put(182101.0, 32.0); // 32% Tax rate up to $231,250
		incomeBrackets.put(231251.0, 35.0); // 35% Tax rate up to $578,125
		incomeBrackets.put(578126.0, 37.0); // 37% Tax rate for anything over the previous
	}

}
// TODO: Fill out README.