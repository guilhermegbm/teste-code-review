import java.text.SimpleDateFormat;
import java.util.Calendar;

class Main {
  public static void main(String[] args) {
    System.out.println("Teste");

    Calendar c = Calendar.getInstance();

    System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(c.getTime()));
  }
}