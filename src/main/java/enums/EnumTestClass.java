package enums;


public class EnumTestClass {
    public static void main(String[] args) {
        int counter = 1;
        System.out.println("--  "+counter+"  ---------------------------");
        System.out.println("System.out.println(MyEnum.SOME_STRING_ONE)");
        System.out.println(MyEnum.SOME_STRING_ONE);
        counter++;
        System.out.println("--  "+counter+"  ---------------------------");
        System.out.println("System.out.println(MyEnum.SOME_STRING_ONE.toString());");
        System.out.println(MyEnum.SOME_STRING_ONE.toString());
        counter++;
        System.out.println("--  "+counter+"  ---------------------------");
        System.out.println("System.out.println(MyEnum.SOME_STRING_ONE.ordinal());");
        System.out.println(MyEnum.SOME_STRING_ONE.ordinal());
        counter++;
        System.out.println("--  "+counter+"  ---------------------------");
        System.out.println("System.out.println(MyEnum.SOME_STRING_ONE.values())");;
        System.out.println(MyEnum.SOME_STRING_ONE.values());
        counter++;

        System.out.println("--  "+counter+"  ---------------------------");
        System.out.println("System.out.println(MyEnum.valueOf(\"SOME_STRING_ONE\"));");
        System.out.println(MyEnum.valueOf("SOME_STRING_ONE"));
        counter++;

        System.out.println("--  "+counter+"  ---------------------------");
        System.out.println("getValue test");
        System.out.println(MyEnum.SOME_STRING_ONE.getValue());

        counter++;
        System.out.println("--  "+counter+"  ---------------------------");
        System.out.println("setValues test");
        MyEnum.SOME_STRING_ONE.setValues("stingOneTEST","stingTwoTEST");
        System.out.println(MyEnum.SOME_STRING_ONE.getValue());
        counter++;

        counter++;
        System.out.println("--  "+counter+"  ---------------------------");
        System.out.println("setValue test2");
        MyEnum.SOME_STRING_ONE.setValues("stingTwoTEST", "stingOneTEST");
        System.out.println(MyEnum.SOME_STRING_ONE.getValue());
        counter++;
    }
}

