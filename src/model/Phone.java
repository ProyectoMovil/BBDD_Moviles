package model;

public class Phone {
	
	private Screen screen;
	private String model;
	private Ram ram;
	private Processor processor;
	private Antutu antutu;
	private Batery batery;
	private float prize;
	public Phone(Screen screen, String model, Ram ram, Processor processor, Antutu antutu, Batery batery, float prize) {
		super();
		this.screen = screen;
		this.model = model;
		this.ram = ram;
		this.processor = processor;
		this.antutu = antutu;
		this.batery = batery;
		this.prize = prize;
	}
	public Screen getScreen() {
		return screen;
	}
	public void setScreen(Screen screen) {
		this.screen = screen;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Ram getRam() {
		return ram;
	}
	public void setRam(Ram ram) {
		this.ram = ram;
	}
	public Processor getProcessor() {
		return processor;
	}
	public void setProcessor(Processor processor) {
		this.processor = processor;
	}
	public Antutu getAntutu() {
		return antutu;
	}
	public void setAntutu(Antutu antutu) {
		this.antutu = antutu;
	}
	public Batery getBatery() {
		return batery;
	}
	public void setBatery(Batery batery) {
		this.batery = batery;
	}
	public float getPrize() {
		return prize;
	}
	public void setPrize(float prize) {
		this.prize = prize;
	}
	@Override
	public String toString() {
		return "Phone [screen=" + screen + ", model=" + model + ", ram=" + ram + ", processor=" + processor
				+ ", antutu=" + antutu + ", batery=" + batery + ", prize=" + prize + "]";
	}
	
	

}
