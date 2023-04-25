import java.time.*;
import java.util.Locale;

class Solution {
    public String solution(int a, int b) {
        String[] answer = {"-","MON","TUE","WED","THU","FRI","SAT","SUN"};
        LocalDate date = LocalDate.of(2016, a, b);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        int dayOfWeekNumber = dayOfWeek.getValue();
        
        return answer[dayOfWeekNumber];
    }
}