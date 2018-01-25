package com.darren.dbrock;

public class Computer {
	
	private String macAddress;
	private String model;
	private String processorPower;
	private String ram;
	private String GPU;
	
	public Computer(String model, String processor, String ram, String GPU) {
		this.model = model;
		this.processorPower = processor;
		this.ram = ram;
		this.GPU = GPU;
	}
	
	public String getMacAddress() {
		return macAddress;
	}
	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getProcessorPower() {
		return processorPower;
	}
	public void setProcessorPower(String processorPower) {
		this.processorPower = processorPower;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getGPU() {
		return GPU;
	}
	public void setGPU(String gPU) {
		GPU = gPU;
	}

}
