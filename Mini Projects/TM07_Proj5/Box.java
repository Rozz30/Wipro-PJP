
public class Box implements Comparable<Box> {
	double length;
	double width;
	double height;
	double volume;
	public Box(double length, double width, double height) {
		super();
		this.length = length;
		this.width = width;
		this.height = height;
		this.volume=length*width*height;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double volume() {
		volume=length*height*width;
		return volume;
	}
	
	@Override
	public String toString() {
		return "Length=" + length + ", Width=" + width + ", Height=" + height + ", Volume=" +String.format("%.2f", volume)  ;
	}
	@Override
	public int compareTo(Box that) {
		if(this.volume()>that.volume()) {
			return 1;
		}else if(this.volume()<that.volume()) {
			return -1;
		}else {
			return 0;
		}
	}
	@Override
	public boolean equals(Object obj) {
		Box that = (Box) obj;
		if(this.volume()==that.volume()) {
			return true;
		}else {
			return false;
		}
	}
	
	
}
