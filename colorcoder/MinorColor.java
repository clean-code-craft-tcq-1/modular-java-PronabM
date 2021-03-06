package colorcoder;

public enum MinorColor implements Color {
	BLUE(0,"Blue"),
    ORANGE(1,"Orange"),
    GREEN(2,"Green"),
    BROWN(3,"Brown"),
    SLATE(4,"Slate");
    private int index;
    private String displayName;
    private MinorColor(int index, String displayName) {
        this.index = index;
        this.displayName = displayName;
    }
    public int getIndex() {
        return this.index;
    }
    
    public String toString(){
    	return this.displayName;
    }
}
