import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
 
public class Util {
    public static String getNow() {
 
        // 현재 날짜/시간
        LocalDateTime now = LocalDateTime.now();
 
       
 
        // 포맷팅
        String formatedNow = now.format(DateTimeFormatter.ofPattern("yyyy- MM- dd HH:mm:ss"));
 
        return formatedNow;
 
    }
}