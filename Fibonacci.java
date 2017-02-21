class Main {
  public static int fibonacci(int num) {
    if(num == 0) return 0;
    if(num == 1) return 1;
    if(num == -1) return -1;
    
    if(num > 0)
      return fibonacci(num - 1) + fibonacci(num - 2);
    else
      return fibonacci(num + 1) + fibonacci(num + 2);
  }
  
  public static void main(String[] args) {
    System.out.println(fibonacci(-3));
    System.out.println(fibonacci(3));
  }
}
