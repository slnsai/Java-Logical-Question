package call.by.value;

public class Rectangle
{
	int length;
	int breath;
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreath() {
		return breath;
	}
	public void setBreath(int breath) {
		this.breath = breath;
	}
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breath=" + breath + "]";
	}
	

}
