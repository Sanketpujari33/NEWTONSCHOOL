package DSA.Playground;

public class Main {

  public static int removeDuplicate(int arr[], int size) {
    int j = 0;
    if (size == 0 || size == 1) return size;
    for (int i = 0; i < size; i++) {
      if (arr[i] != arr[i + 1]) {
        arr[j++] = arr[i];
      }
    }
    arr[j++] = arr[size - 1];
    return j;
  }

  public static int missingNumber(int arr[], int size) {
    int ans = 1;
    for (int i = 0; i < size; i++) {
      if (arr[i] == ans) {
        ans++;
      }
    }
    return ans;
  }

  public static void quickSort(int arr[], int low, int high) {
    if (low < high) {
      int pi = parttion(arr, low, high);
      quickSort(arr, low, pi - 1);
      quickSort(arr, pi + 1, high);
    }
  }

  public static int parttion(int arr[], int low, int high) {
    int povit = arr[high];
    int j = low - 1;
    for (int i = low; i < high; i++) {
      if (arr[i] < povit) {
        j++;
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
      }
    }
    j++;
    int temp = arr[j];
    arr[j] = arr[high];
    arr[high] = temp;
    return j;
  }

  public static void divide(int arr[], int l, int r) {
    if (l >= r) {
      return;
    }
    int mid = l + (r - l) / 2;
    divide(arr, l, mid);
    divide(arr, mid + 1, r);
    conqure(arr, l, mid, r);
  }

  public static void conqure(int arr[], int l, int mid, int r) {
    int marge[] = new int[r - l + 1];
    int idx1 = l;
    int idx2 = mid + 1;
    int x = 0;
    while (idx1 <= mid && idx2 <= r) {
      if (arr[idx1] <= arr[idx2]) {
        marge[x++] = arr[idx1++];
      } else {
        marge[x++] = arr[idx2++];
      }
    }
    while (idx1 <= mid) {
      marge[x++] = arr[idx1++];
    }
    while (idx2 <= r) {
      marge[x++] = arr[idx2++];
    }
    for (int i = 0, j = l; i < marge.length; i++, j++) {
      arr[j] = marge[i];
    }
  }

  public static void selectinSort(int arr[], int size) {
    for (int i = 0; i < size - 1; i++) {
      int smallest = i;
      for (int j = i + 1; j < size; j++) {
        if (arr[j] < arr[smallest]) {
          smallest = j;
        }
      }
      int temp = arr[smallest];
      arr[smallest] = arr[i];
      arr[i] = temp;
    }
  }

  public static void inserSort(int arr[], int size) {
    for (int i = 0; i < size; i++) {
      int curr = arr[i];
      int j = i - 1;
      while (j > -1 && arr[j] > curr) {
        arr[j + 1] = arr[j];
        j--;
      }
      arr[j + 1] = curr;
    }
  }

  public static void bSort(int arr[], int size) {
    int temp = 0;
    for (int i = 0; i < size - 1; i++) {
      for (int j = i + 1; j < size; j++) {
        if (arr[i] > arr[j]) {
          temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
  }

  public static int binnarySearch(int arr[], int size, int key) {
    int low = 0;
    int high = arr.length;
    while (low <= high) {
      int mid = low + (high - low) / 2;
      if (arr[mid] == key) return mid;
      if (arr[mid] < key) low = mid + 1; else high = mid - 1;
    }
    return -1;
  }

  public static int linnerSerch(int arr[], int size, int key) {
    for (int i = 0; i < size; i++) {
      if (arr[i] == key) {
        return i;
      }
    }
    return -1;
  }

  public static void print(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void resultPrint(int result) {
    if (result == -1) {
      System.out.println("Not present element in the arrays");
    } else System.out.println(result);
  }

  public static void main(String[] args) {
    int nums[] = { 0, 1, 2, 4, 5, 6, -1, -2 };
    int size = nums.length;
    int x = 1;
    System.out.println("Missing Number:-");
    int M = missingNumber(nums, size);
    resultPrint(M);
    System.out.println("Linner Serche:-");
    int L = linnerSerch(nums, size, x);
    resultPrint(L);
    System.out.println("Binnary Serche:-");
    int B = binnarySearch(nums, size - 1, x);
    resultPrint(B);
    System.out.println("bubble Sort:-");
    bSort(nums, size);
    print(nums);
    System.out.println("Insertion Sort:-");
    inserSort(nums, size);
    print(nums);
    System.out.println("Selection sort:-");
    selectinSort(nums, size);
    print(nums);
    System.out.println("marge Sort:-");
    divide(nums, 0, size - 1);
    print(nums);
    System.out.println("Quick Sort:-");
    quickSort(nums, 0, size - 1);
    print(nums);
  }
}
