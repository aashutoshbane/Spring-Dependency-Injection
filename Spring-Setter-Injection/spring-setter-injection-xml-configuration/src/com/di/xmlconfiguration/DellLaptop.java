package com.di.xmlconfiguration;

public class DellLaptop implements ILaptop {
	
	private ILaptopService laptopService;
	private String serviceEmail;
	private String headQuarters;
	
	public String getHeadQuarters() {
		return headQuarters;
	}

	public void setHeadQuarters(String headQuarters) {
		this.headQuarters = headQuarters;
	}

	public String getServiceEmail() {
		return serviceEmail;
	}

	public void setServiceEmail(String serviceEmail) {
		this.serviceEmail = serviceEmail;
	}

	public void setLaptopService(ILaptopService laptopService) {
		this.laptopService = laptopService;
	}

	@Override
	public String getConfiguration() {
		return "This is 8GB RAM, i7 intel processor, 512 SSD";
	}

	@Override
	public String getServiceDueCycle() {
		return this.laptopService.getServiceDueCycle("dell");
	}

}
