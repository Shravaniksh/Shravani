package basic_java;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class Test7 {
	public static void main(String[] args)
	{
		LocalDate date=LocalDate.now();
		//default format
		System.out.println("Default format of LocalDate="+date);
		//specific format
		System.out.println("Pattern"+date.format(DateTimeFormatter.ofPattern("d::MMM::uuuu")));
		LocalTime It=LocalTime.now();
		System.out.println("Time:"+It);
		LocalDateTime dateTime=LocalDateTime.now();
		//default format
		System.out.println("Default format of LocalDateTime="+dateTime);
		//specific format
		System.out.println(dateTime.format(DateTimeFormatter.ofPattern("d::MM::uuuu::HH::mm")));
		System.out.println(dateTime.format(DateTimeFormatter.BASIC_ISO_DATE));
	}

}
