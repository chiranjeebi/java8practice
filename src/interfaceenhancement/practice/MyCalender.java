package interfaceenhancement.practice;

import java.util.ArrayList;
import java.util.List;

public class MyCalender {

    class MyCalendar {

        List<int[]> calender;
        public MyCalendar() {
            calender=new ArrayList();
        }

        public boolean book(int start, int end) {
            for(int[] x:calender){;
                if(x[0]<end && start<x[1])
                    return false;
            }

            calender.add(new int[]{start,end});
            return true;
        }


    }

// Your MyCalendar object will be instantiated and called as such
}
