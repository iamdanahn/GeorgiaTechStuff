public class selectionSort {

  public static void main(Comparable[] list) {
    int minIdx;
    Comparable nextSmallest;

    for (int i = 0; i < list.length - 1; i++) {
      minIdx = i;
      for (int j = i + 1; j < list.length; j++) {
        if (list[j].compareTo(list[minIdx]) < 0) {
          minIdx = j;
        }
      }

      nextSmallest = list[minIdx];
      list[minIdx] = list[i];
      list[i] = nextSmallest;
    }
  }
  // public static int[] main(int[] args) {
  //   // 1. iterate thru entire list to find the smallest number
  //   // 2. swap the smallest number's index with the starting index
  //   // 3. increment starting index by 1 and repeat

  //   for (int i = 0; i < args.length - 1; i++) {
  //     int minIdx = i;
  //     int smallest = args[i];
  //     for (int j = i + 1; j < args.length; j++) {
  //       if (args[j] < smallest) {
  //         minIdx = j;
  //       }
  //     }

  //     // swap
  //     int temp = args[i];
  //     args[i] = args[minIdx];
  //     args[minIdx] = temp;

  //     // smallest = args[minIdx];
  //     // args[minIdx] = args[i];
  //     // args[i] = smallest;
  //   }

  //   return args;
  // }
}