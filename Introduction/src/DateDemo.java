import java.text.SimpleDateFormat;
import java.util.Calendar;

/*import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d=new Date();
		SimpleDateFormat sdf= new SimpleDateFormat("M/d/yyy hh:mm:ss");
		System.out.println(sdf.format(d));
		System.out.println(d.toString());

	}

}*/
//Calendra 

public class DateDemo{
	@SuppressWarnings("static-access")
	public static void main (String[] args) {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sd= new SimpleDateFormat("M/d/yyy hh:mm:ss");
		System.out.println(sd.format(cal.getTime()));
		System.out.println(cal.DAY_OF_WEEK_IN_MONTH);
		System.out.println(cal.AM_PM);
		System.out.println(cal.MINUTE);
		System.out.println(cal.getTimeInMillis());
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println(cal.get(Calendar.AM_PM));
		
		
	}
}