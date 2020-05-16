/**
 * 
 */
package com.di.xmlconfiguration;

/**
 * @author Ashutosh Bane
 *
 */
public class LaptopService implements ILaptopService {

	@Override
	public String getServiceDueCycle(String type) {
		String cycle;
		switch (type) {
		case "hp":
			cycle = "Jan-June/July-Dec";
			break;
		case "dell":
			cycle = "Apr-Sept/Oct-Mar";
			break;
		default:
			throw new Error("Unknow type passed");
		}
		
		return cycle;
	}

}