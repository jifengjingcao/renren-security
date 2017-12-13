import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by wzf on 2017/12/1.
 */
public class Main {

    public static void main(String[] args) throws ParseException {
        DecimalFormat decimalFormat=new DecimalFormat(".00");
        decimalFormat.format(555*81/70);
        System.out.println(decimalFormat.format(555*81/70));


        Date date=null;
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        date=sdf.parse("2017/11/30 10:16:21");
        SimpleDateFormat sdf1=new SimpleDateFormat("yyyyMM");
        System.out.println(sdf1.format(date));

    }
}
