package DSA.DSAMock.DSA1;

/*Java Program to find the second largest and second smallest elements in the array without using Functions*/

public class SecSmalLargElement {

  // then print  array[size-2] for second larges element.
  //And array[1] for smallest elements
  public static void main(String[] args) {
    //Declare array size
    System.out.println("Enter the size of the array");
    //Initialize array size
    int n = 7;
    System.out.println(n);
    //Declare array

    System.out.println("Enter the array");
    //Initialize array
    int arr[] = { 1, 3, 6, 9, 8, 5, 7, 2 };
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
    //Use to hold the element
    for (int i = 0; i < n; i++) {
      //Use to compare with the rest of the elements
      for (int j = i + 1; j < n; j++) {
        //Check and swap
        if (arr[i] < arr[j]) {
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
    //Display second largest element.
    System.out.println("Second Largest element is " + arr[1]);
    //Display second smallest element.
    System.out.println("Second Smallest element is " + arr[n - 2]);
  }
}
