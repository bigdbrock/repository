package com.darren.dbrock;

public class Computer {
	
	private String macAddress;
	private String model;
	private String ram;
	private String processor;
	
	public Computer(String model, String ram, String processor) {
		this.model = model;
		this.ram = ram;
		this.processor = processor;
		Main.computers.add(this);
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
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	
	@Override
	public String toString() {
		return "Model: " + model + ", RAM: " + ram + 
				", Processor: " + processor + ", MAC Address: " + macAddress;
	}

}
