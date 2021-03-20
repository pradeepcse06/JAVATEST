package packageb;
import packageb.IntegerTest;

class PrimitiveTest {

    public static void main(String[] args) {
        System.out.println("Testing Primitive data types MAX, MIN and overflow, underflow");
        ByteTest Bo = new ByteTest();
        ShortTest So = new ShortTest();
        IntegerTest In = new IntegerTest();
        LongTest Ln = new LongTest();
        Bo.ByteTest();
        So.ShortTest();
        In.Integer_Test();
        Ln.LongTest();

    }
}

class ByteTest {

    void ByteTest() {
        byte B = 127;

        byte myByteMax = Byte.MAX_VALUE;
        byte myByteMin = Byte.MIN_VALUE;
        byte myByteTest = 127;
        System.out.println("myByteMax is  " + myByteMax);
        System.out.println("myByteMin is  " + myByteMin);
        System.out.println("myByteTest is " + myByteTest);
        System.out.println("myByteoverflow  is " + (myByteMax + 1));
        System.out.println("myByteunderflow is " + (myByteMin - 1));

    }
}

class ShortTest {

    public static void ShortTest() {
        short S = 12000;

        short myShortMax = Short.MAX_VALUE;
        short myShortMin = Short.MIN_VALUE;
        short myShortTest = 12000;
        System.out.println("myShortMax is  " + myShortMax);
        System.out.println("myShortMin is  " + myShortMin);
        System.out.println("myShortTest is " + myShortTest);
        System.out.println("myByteoverflow  is " + (myShortMax + 1));
        System.out.println("myByteunderflow is " + (myShortMin - 1));

    }
}

class LongTest {

    public static void LongTest() {
        long L = 12000L;

        long myLongMax = Long.MAX_VALUE;
        long myLongMin = Long.MIN_VALUE;
        long myLongTest = 9223372036854775807L;
        System.out.println("myLongMax is  " + myLongMax);
        System.out.println("myLongMin is  " + myLongMin);
        System.out.println("myLongTest is " + myLongTest);
        System.out.println("myLongoverflow  is " + (myLongMax + 100));
        System.out.println("myLongunderflow is " + (myLongMin - 100));

    }
}
