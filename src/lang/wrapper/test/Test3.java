package lang.wrapper.test;

public class Test3 {
    public static void main(String[] args) {
        String str = "100";
        Integer integer1 = Integer.parseInt(str);
        int intValue = integer1.intValue();
        Integer integer2 = Integer.valueOf(intValue);

        System.out.println("integer1 = " + integer1);
        System.out.println("intValue = " + intValue);
        System.out.println("integer2 = " + integer2);
    }
}
