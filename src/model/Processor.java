package model;

import java.util.Objects;

public class Processor {
	
	private int coreNumber;
	private float velocity;
	private final String unidadVelocidad = "Ghz";
	public Processor(int coreNumber,int velocity) {
		super();
		this.coreNumber = coreNumber;
		this.velocity = velocity;
	}
	
	public int getCoreNumber() {
		return coreNumber;
	}
	public void setCoreNumber(int coreNumber) {
		this.coreNumber = coreNumber;
	}
	public float getVelocity() {
		return velocity;
	}
	public void setVelocity(float velocity) {
		this.velocity = velocity;
	}
	@Override
	public int hashCode() {
		return Objects.hash(coreNumber, velocity);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Processor other = (Processor) obj;
		return coreNumber == other.coreNumber && Objects.equals(velocity, other.velocity);
	}
	@Override
	public String toString() {
		return "Processor [coreNumber=" + coreNumber + ", velocity=" + velocity + unidadVelocidad
				+ "]";
	}
	
}
