package colorcoder;

public class ReferenceManual {
	private String format = "|%1$-10s|%2$-13s|%3$-13s|\n";
	private String horizontalRule = "-".repeat(40)+"\n";
	public String toString() {
	    String referenceManual = "\nReference Manual\n" + horizontalRule;
	    referenceManual += String.format(format, "Pair no.","Major Color","Minor Color") + horizontalRule;
	    for (int i = 1; i <= ColorService.numberOfPairs; i++) {
	      ColorPair colorPair = ColorService.getColorFromNumber(i);
	      referenceManual += String.format(format, i,colorPair.getMajor().toString(),colorPair.getMinor().toString());
	    } 
	    return referenceManual + horizontalRule;
	  }
}
