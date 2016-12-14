package com.android;

public class privateinterface {

    private interface innerInterface {

        void test();

        int numTest();


    }

    public interface testFace {

        int numTest();
    }

    private class innnerCLass implements innerInterface, testFace {


        @Override
        public void test() {

            System.out.println("innerclass called");

        }

        @Override
        public int numTest() {
            return 0;
        }


    }

    public static void main(String args[]) {
        privateinterface test = new privateinterface();
        test.new innnerCLass().test();

        System.out.println(test);

    }
}








