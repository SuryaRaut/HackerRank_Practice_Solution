import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by surya on 11/27/17.
 */
public class DateDemo {

    public static void main(String[] args) {


    Date date;
        date =new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

        System.out.println("Current Date " + simpleDateFormat.format(date) );
}
}
