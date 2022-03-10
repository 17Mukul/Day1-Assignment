package com.demo.app;

public class Computer {
	private Moniter moniter;
	private Keyboard keyboard;
	private Mouse mouse;
	private Cpu cpu;
	
	public Computer(int size, String keyboardColor, String mouseType, String processor) {
		this.moniter = new Moniter(size);
		this.keyboard = new Keyboard(keyboardColor);
		this.mouse = new Mouse(mouseType);
		this.cpu =new Cpu(processor);
	}

	public String getComputer() {
		return moniter.getSize()+"  "+keyboard.getKeyboardColor()+"  "+mouse.getMouseType()+"  "+cpu.getProcessor();
	}
}
