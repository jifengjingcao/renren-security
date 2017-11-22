package stringBuffer;

import java.util.concurrent.CountDownLatch;

/**
 * Created by wzf on 2017/11/21.
 */
public class StringBufferAndStringBuilderTest {

    private static final int THREAD_NUM = 1000;

    public static void main(String[] args){
        long startTime = System.currentTimeMillis();
        String strToReverse = "AAAABBBB";

        StringBuffer stringBuffer = new StringBuffer(strToReverse);
        StringBuilder stringBuilder = new StringBuilder(strToReverse);
        CountDownLatch countDownLatch = new CountDownLatch(THREAD_NUM);
        CountDownLatch countDownLatch2 = new CountDownLatch(THREAD_NUM);

        for(int i=0; i<THREAD_NUM; i++) {
            new StringBufferTaskThread(stringBuilder, countDownLatch).run();
            new StringBufferTaskThread(stringBuffer, countDownLatch2).run();
        }

        try {
            countDownLatch.await();
            countDownLatch2.await();
            System.out.println("StringBuffer toString: " + stringBuffer.toString());
            System.out.println("StringBuilder toString: " + stringBuilder.toString());
            long endTime = System.currentTimeMillis();
            System.out.println("Running time: " + (endTime-startTime));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}