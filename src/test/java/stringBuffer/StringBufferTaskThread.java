package stringBuffer;

import java.util.concurrent.CountDownLatch;

/**
 * Created by wzf on 2017/11/21.
 */
public class StringBufferTaskThread {
    private static final String STARTER = "-start";
    private static final String ENDER = "-end";

    private Object s = null;
    private CountDownLatch countDownLatch;  // 记载运行线程数

    public StringBufferTaskThread(StringBuffer stringBuilder, CountDownLatch countDownLatch) {
        super();
        this.s = stringBuilder;
        this.countDownLatch = countDownLatch;
    }

    public StringBufferTaskThread(StringBuilder stringBuffer, CountDownLatch countDownLatch) {
        super();
        this.s = stringBuffer;
        this.countDownLatch = countDownLatch;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + STARTER);
        for(int i=0; i<10; i++) {
            try {
                Thread.sleep(2);
                if(s instanceof StringBuffer){
                    ((StringBuffer) s).reverse();
                    System.out.println("Buffer->"+s.toString());
                }else if(s instanceof StringBuilder){
                    ((StringBuilder) s).reverse();
                    System.out.println("Builder->"+s.toString());
                }
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + ENDER);
        countDownLatch.countDown();
    }
}
