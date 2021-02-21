package colorcoder;

public class ColorService {
	final static int numberOfMajorColors = MajorColor.values().length;
	final static int numberOfMinorColors = MinorColor.values().length;
	final static int numberOfPairs = numberOfMajorColors * numberOfMinorColors;
	
	public static ColorPair getColorFromNumber(int pairNumber) {
        int zeroBasedPairNumber = pairNumber - 1;
        MajorColor majorColor = 
        		(MajorColor) fromIndex(zeroBasedPairNumber / numberOfMinorColors, MajorColor.values());
        MinorColor minorColor =
        		(MinorColor) fromIndex(zeroBasedPairNumber % numberOfMinorColors, MinorColor.values());
        return new ColorPair(majorColor, minorColor);
    }
    
    static int getNumberFromColor(ColorPair pair) {
        return pair.getMajor().getIndex() * numberOfMinorColors + pair.getMinor().getIndex() + 1;
    }

    public static void testNumberToPair(int pairNumber, MajorColor expectedMajor, MinorColor expectedMinor)
    {
        ColorPair colorPair = getColorFromNumber(pairNumber);
        System.out.println("Got pair " + colorPair.toString());
        assert(colorPair.getMajor() == expectedMajor);
        assert(colorPair.getMinor() == expectedMinor);
    }

    public static void testPairToNumber(MajorColor major, MinorColor minor, int expectedNumber)
    {
        int pairNumber = getNumberFromColor(new ColorPair(major,minor));
        System.out.println("Got pair number " + pairNumber);
        assert(pairNumber == expectedNumber);
    }
    
    public static Color fromIndex(int index,Color[] values) {
    	return (index >= 0 && index <= values.length) ? values[index]: null;
    }
}
