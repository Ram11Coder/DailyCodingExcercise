package greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Meeting {
  int start;
  int end;
  int pos;

  public Meeting(int start, int end, int pos) {
    this.start = start;
    this.end = end;
    this.pos = pos;
  }

  @Override
  public String toString() {
    return "Meeting [start=" + start + ", end=" + end + ", pos=" + pos + "]";
  }


}


public class NmeetingInOneRoom {
  public static Comparator<Meeting> comp = (o1, o2) -> o1.end - o2.end;

  public static void main(String[] args) {

    int start[] = {1, 3, 0, 5, 8, 5};
    int end[] = {2, 4, 6, 7, 9, 9};

    List<Meeting> meet = new ArrayList<Meeting>();

    for (int i = 0; i < start.length; i++) {
      meet.add(new Meeting(start[i], end[i], i + 1));
    }

    Collections.sort(meet, comp);
    System.out.println(meet);


    List<Integer> result = new ArrayList<Integer>();
    result.add(meet.get(0).pos);
    int limit = meet.get(0).end;

    for (int i = 1; i < end.length; i++) {

      if (meet.get(i).start > limit) {
        limit = meet.get(i).end;
        result.add(meet.get(i).pos);
      }
    }
    System.out.println(result);
  }
}
