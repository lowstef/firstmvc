import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

/**
 * @author lowstef
 * @create 2018/8/10
 * @since 1.0.0
 */

public class Test6 {

    public static void main(String[] args) throws ParseException {

        Integer i1 = 1000;
        Integer i2 = 1000;
        System.out.println(i1.hashCode());
        System.out.println(i2.hashCode());

        long l = System.currentTimeMillis();
        System.out.println(l);
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);

        Calendar instance = Calendar.getInstance();
        int i = instance.get(Calendar.DAY_OF_MONTH);
        System.out.println(i);

        String str = "2008年8月8日";
        SimpleDateFormat da = new SimpleDateFormat("yyyy年MM月dd日");
        Date parse = da.parse(str);
        Calendar instance1 = Calendar.getInstance();
//        instance1.setTime(parse);
        instance1.set(2008,7,8);
        Date time1 = instance1.getTime();
        System.out.println(time1);
        int i3 = instance1.get(Calendar.DAY_OF_WEEK);
        System.out.println(i3);
        Random random = new Random();
        int i4 = random.nextInt(100);
        System.out.println(i4);

    }

}
