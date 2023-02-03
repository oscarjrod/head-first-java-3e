package oscar.learning.ch4;

public class Value {

    private int intValue;

    public int getIntValue() {
        return intValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }

    public int doStuff(int factor) {
        if (intValue > 100) {
            return intValue * factor;
        } else {
            return intValue * (5 - factor);
        }
    }

}