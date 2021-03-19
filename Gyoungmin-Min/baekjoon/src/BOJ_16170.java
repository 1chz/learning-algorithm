import java.time.LocalDate;

public class BOJ_16170 {
    public static void main(String[] args) throws Exception{
        LocalDate ld = LocalDate.now();
        System.out.printf("%s %s %s",ld.getYear(),ld.getMonthValue(),ld.getDayOfMonth());
    }
}
