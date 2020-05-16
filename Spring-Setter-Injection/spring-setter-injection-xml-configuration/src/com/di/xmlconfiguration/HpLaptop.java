package com.di.xmlconfiguration;

public class HpLaptop implements ILaptop {
	
	private ILaptopService laptopService;
	
	public void setLaptopService(ILaptopService laptopService) {
		this.laptopService = laptopService;
	}

	@Override
	public String getConfiguration() {
		return "This is 4GB RAM, i5 intel processor, 1TB Hard Disk";
	}

	@Override
	public String getServiceDueCycle() {
		return this.laptopService.getServiceDueCycle("hp");
	}

}
