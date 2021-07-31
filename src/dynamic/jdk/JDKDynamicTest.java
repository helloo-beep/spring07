package dynamic.jdk;

public class JDKDynamicTest {
    public static void main(String[] args) {
        JDKDynamicProxy jdkDynamicProxy=new JDKDynamicProxy();
        TestDao TESTdao=new TestDaoImpl();
        TestDao testDaoAdvice= (TestDao) jdkDynamicProxy.createProxy(TESTdao);
        testDaoAdvice.save();
        System.out.println("............................");
        testDaoAdvice.modify();
        System.out.println("............................");
        testDaoAdvice.delete();
    }
}
