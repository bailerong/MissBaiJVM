package Eden;

public class TestEden
{
    /*
    * JVM参数如下
    * -XX：+PrintGCDetails
    * -XX：+UserSerialGC(使用Serial+Serial Old收集器组合)
    * -Xms 20M  -Xmx 20M -Xmn10M（设置新生代的大小）
    * -XX:SurvivorRation=8（Eden：Survivor=8：1）*/
    private static final int _1MB=1024*1024;
    public static void testAlloaction() {
        byte[] alloaction1,alloaction2,alloaction3,alloaction4;
        alloaction1=new byte[2* _1MB];
        alloaction2=new byte[2* _1MB];
        alloaction3=new byte[2* _1MB];
        // 出现Minor GC
        alloaction4=new byte[4* _1MB];

    }

    public static void main(String[] args) {
        testAlloaction();
    }

}
