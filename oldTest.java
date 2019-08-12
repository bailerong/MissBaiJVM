package old;
/*
* JVM参数如下：
* -XX:+PrintGCDetails
* -XX:+UseSerialGC
* -Xms20M  -Xmx20M -Xmn10M
* -XX:SurvivorRatio=8
*-XX:PretenureSizeThreshold=3145728（此时不能写3M）
*/
//我们的对象的代码
//什么称为我们的大对象呢？
public class oldTest {
    private static final int _1MB=1024*1024;
    public static void testAlloaction(){
        byte[] alloaction;
        alloaction=new byte[4*_1MB];
    }
//代码很简单，但是我们需要明白的是什么是我们的大对象和内存的分配，比较重要
    public static void main(String[] args) {
        testAlloaction();
    }

}
