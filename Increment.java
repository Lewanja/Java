public class Increment {
    public static void main(String[] args){
        int test= 5;
        //test =test+1 same as ++test. increments variable's value and uses new value in the expression
        ++test;
        System.out.println(test);
        //test ++; variables value is first used in the expression and then increased
        int newTest = 8;
        newTest ++;
        System.out.println(newTest);
    }
}
