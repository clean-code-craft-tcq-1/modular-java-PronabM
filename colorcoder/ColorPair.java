package colorcoder;

public class ColorPair {
	private MajorColor major;
	private MinorColor minor;
	  
	  public ColorPair(MajorColor major, MinorColor minor) {
	    this.major = major;
	    this.minor = minor;
	  }
	  
	  public MajorColor getMajor() {
	    return this.major;
	  }
	  
	  public MinorColor getMinor() {
	    return this.minor;
	  }
	  
	  public String toString() {
		    return this.major.toString() + " " + this.minor.toString();
	  }
}
