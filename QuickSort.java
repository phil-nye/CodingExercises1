//Use with challenge --> https://www.reddit.com/r/dailyprogrammer/comments/5ww6o5/20170301_challenge_304_intermediate_horse_race/
class QuickSort {
  public static int myPartition(int[] horses, int left, int right) {
    //use right-most (last) entry as pivot
    int pivot = horses[right];
    
    //move values to the left or right of the pivot
    int i = left - 1, temp = 0;
    for(int j = left; j < right; j++) {
      if(horses[j] <= pivot) {
        i++;
        
        //swap A[i] with A[j]
        temp = horses[i];
        horses[i] = horses[j];
        horses[j] = temp;
      }
    }
    
    //swap A[i + 1] with A[hi]
    temp = horses[i + 1];
    horses[i + 1] = horses[right];
    horses[right] = temp;
    
    //return new position of the pivot
    return i + 1;
  }
  
  public static void myQuickSort(int[] horses, int left, int right) {
    if(left < right) {
      int partition = myPartition(horses, left, right);
      myQuickSort(horses, left, partition - 1);
      myQuickSort(horses, partition + 1, right);
    }
  }
  
  public static void main(String[] args) {
    int[] horses = {107,47,102,64,50,100,28,91,27,5,22,114,23,42,13,3,93,8,92,79,53,83,63,7,15,66,105,57,14,65,58,113,112,1,62,103,120,72,111,51,9,36,119,99,30,20,25,84,16,116,98,18,37,108,10,80,101,35,75,39,109,17,38,117,60,46,85,31,41,12,29,26,74,77,21,4,70,61,88,44,49,94,122,2,97,73,69,71,86,45,96,104,89,68,40,6,87,115,54,123,125,90,32,118,52,11,33,106,95,76,19,82,56,121,55,34,24,43,124,81,48,110,78,67,59};
    
    myQuickSort(horses, 0, horses.length - 1);
    
    int i = 1;
    for(int score : horses) {
      System.out.print(score);
      if(score == i)  System.out.print("=");
      else  System.out.print("!=");
      System.out.println(i);
      i++;
    }
  }
}
