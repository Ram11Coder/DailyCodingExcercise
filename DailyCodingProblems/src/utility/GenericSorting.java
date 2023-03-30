package utility;

import java.util.Arrays;
import java.util.List;

// Create a generic method that handle all types of parameter
// Create a generic method to print all type of datas(Object,arrays,string,collection ) in java using streams
// Generic sorting and searching , print,
public class GenericSorting<T> {
  // private GenericSorting() {}

  public static void sort(List<?> list) {
    list.stream().map(s -> s.toString()).sorted((o1, o2) -> o1.compareTo(o2))
        .forEach(System.out::println);
  }

  public static void main(String[] args) {
    sort(Arrays.asList(1, 2, 5, 7, 4, 3));
    sort(Arrays.asList(1.0, 2.0, 5.32, 1.27, 5.4, 3.32));
    sort(Arrays.asList(1L, 2L, 5L, 7L, 4L, 3L));
    sort(Arrays.asList("Ram", "Abi", "Arun"));
    sort(Arrays.asList(true, false, true));
  }
}
