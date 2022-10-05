package DSA.DSAMock.DSA2;

import java.util.Arrays;

public class SortString {

  public static void sortingString(String str[], int size) {
    for (int i = 0; i < size - 1; i++) {
      for (int j = i + 1; j < size; j++) {
        if (str[i].compareTo(str[j]) > 0) {
          String temp = str[i];
          str[i] = str[j];
          str[j] = temp;
        }
      }
    }
    System.out.println(Arrays.toString(str));
  }

  public static void main(String[] args) {
    String[] countries = {
      "Zimbabwe",
      "South-Africa",
      "India",
      "America",
      "Yugoslavia",
      " Australia",
      "Denmark",
      "France",
      "Netherlands",
      "Italy",
      "Germany",
    };
    int size = countries.length;
    sortingString(countries, size);
  }
}
