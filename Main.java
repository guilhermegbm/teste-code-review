import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

class Main {
  public static void main(String[] args) {
    System.out.println("Teste");

    Calendar c = Calendar.getInstance();

    Date d = c.getTime();

    System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(d));
  }
}