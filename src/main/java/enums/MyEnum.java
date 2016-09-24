package enums;

public enum MyEnum {
    SOME_STRING_ONE("valueOne","valueTwo");

    MyEnum(String value1, String value2) {
        this.valueOne = value1;
        this.valueTwo = value2;
    }

    private String valueOne;
    private String valueTwo;

    public String getValue() {
        return valueOne;
    }

    public void setValues(String valueOne, String valueTwo) {
        this.valueOne = valueOne;
        this.valueTwo = valueTwo;
    }
}
