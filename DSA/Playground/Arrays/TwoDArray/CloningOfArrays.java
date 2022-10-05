package DSA.Playground.Arrays.TwoDArray;

public class CloningOfArrays {

  public static void main(String[] args) {
    int[] intArrys = { 1, 2, 3 };
    int[] cloneArrys = intArrys.clone();
    System.out.println(intArrys == cloneArrys);

    for (int i = 0; i < cloneArrys.length; i++) {
      System.out.println(cloneArrys[i] + " ");
    }
    int[][] Arryys = { { 1, 2, 3 }, { 4, 5 } };
    int cloneArraya[][] = Arryys.clone();
    System.out.println(Arryys == cloneArraya);

    System.out.println(Arryys[0] == cloneArraya[0]);
    System.out.println(Arryys[1] == cloneArraya[1]);
  }
}
