package model;

import java.util.Objects;

public class Batery {
	
	private int mAhNumber;
	private final String UNIDAD_MEDIDA = "mAh";
	public Batery(int mAhNumber) {
		super();
		this.mAhNumber = mAhNumber;
	}
	public int getmAhNumber() {
		return mAhNumber;
	}
	public void setmAhNumber(int mAhNumber) {
		this.mAhNumber = mAhNumber;
	}
	@Override
	public int hashCode() {
		return Objects.hash(mAhNumber);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Batery other = (Batery) obj;
		return mAhNumber == other.mAhNumber;
	}
	@Override
	public String toString() {
		return "Bateria [mAhNumber=" + mAhNumber + UNIDAD_MEDIDA + "]";
	}
	
	

}
