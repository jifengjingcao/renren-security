import java.util.HashMap;

/**
 * Created by wzf on 2017/12/14.
 */
public class A {

    HashMap hashMap = new HashMap();


    public static void main(String[] args) {
        try {
            System.out.println(1);
            return;
        }finally {
            System.out.println(2);
        }
    }
}
