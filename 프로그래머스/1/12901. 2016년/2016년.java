import java.util.*;

class Solution {
    public String solution(int a, int b) {
        String[] days = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        Map<Integer, Integer> calendar = getCalendar();
        int date = 0;
        
        for (int i = 1; i < a; i++) {
            date += calendar.get(i);
        }
        
        date += b;
        
        return days[date % 7];
    }
    
    public Map<Integer, Integer> getCalendar() {
        Map<Integer, Integer> calendar = new HashMap<>();
        calendar.put(1, 31);
        calendar.put(2, 29);
        calendar.put(3, 31);
        calendar.put(4, 30);
        calendar.put(5, 31);
        calendar.put(6, 30);
        calendar.put(7, 31);
        calendar.put(8, 31);
        calendar.put(9, 30);
        calendar.put(10, 31);
        calendar.put(11, 30);
        calendar.put(12, 31);
        
        return calendar;
    }
}