package newTest;
//动态对象年龄判定
/*
* JVM参数如下：
* -XX：+PrintGCDetails
* -XX:UseSerialGC(使用Serial+Serial Old收集器组合)
* -Xms 20M -Xmx20M -Xmn 10M（设置新生代大小）
* -XX ：SurvivorRatio=8(Eden: Survivor=8:1)
* -XX :MaxTenuringThreshold=15
* */
public class newTest {
private static final int _1MB=1024*1024;
public static void testAllocation(){
 byte[] alloaction1, alloaction2, alloaction3, alloaction4;
 alloaction1=new byte[_1MB/4];
 alloaction2=new byte[_1MB/4];
 //alloaction1+alloaction2大于Survivor空间的一半
 alloaction3=new byte[4*_1MB];
 alloaction4=new byte[4*_1MB];
 alloaction4=null;
 alloaction4=new byte[4*_1MB];

}

    public static void main(String[] args) {
        testAllocation();
    }
}
