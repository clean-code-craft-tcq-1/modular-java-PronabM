package colorcoder;

public class Main {
    public static void main(String[] args) {
        ColorService.testNumberToPair(4, MajorColor.WHITE, MinorColor.BROWN);
        ColorService.testNumberToPair(5, MajorColor.WHITE, MinorColor.SLATE);
    
        ColorService.testPairToNumber(MajorColor.BLACK, MinorColor.ORANGE, 12);
        ColorService.testPairToNumber(MajorColor.VIOLET, MinorColor.SLATE, 25);
        
        System.out.println(new ReferenceManual().toString());
    }
}
