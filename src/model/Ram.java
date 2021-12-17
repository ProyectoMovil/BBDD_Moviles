package model;

public class Ram {

	private int gigaBytes;
	private final String gB = " GB";

	public int getCapacity() {
		return gigaBytes;
	}

	public Ram(int core) {
		this.gigaBytes = calculateCapacity(core);
	}

	private int calculateCapacity(int core) {
		int megaBytesPerCore = 500;
		float megabytes = core * megaBytesPerCore;
		megabytes = converterMegabytesToGygabytes(megabytes);
		megabytes = Math.round(megabytes);
		return (int) megabytes;
	}

	private float converterMegabytesToGygabytes(float megabytes) {
		float converterGyga = 0.000977f;
		return megabytes * converterGyga;
	}

	@Override
	public String toString() {
		return gigaBytes + gB;
	}
}