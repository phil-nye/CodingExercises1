class Main {
  public static int fibonacci(int num) {  //recursive
    if(num == 0) return 0;
    if(num == 1) return 1;
    if(num == -1) return -1;
    
    if(num > 0)
      return fibonacci(num - 1) + fibonacci(num - 2);
    else
      return fibonacci(num + 1) + fibonacci(num + 2);
  }
  
  public static int fib(int num) {  //non recursive
    int total = 0;
    int first = 0, second = 1;
    
    if(num == 0)  return first;
    if(num == 1)  return second;
    
    for(int i = 0; i < Math.abs(num) - 1; i++) {
      total = first + second;
      first = second;
      second = total;
    }
    
    if(num < 0)   total *= -1;
    
    return total;
  }
  
  public static void main(String[] args) {
    System.out.println(fibonacci(-3));
    System.out.println(fibonacci(3));
    System.out.println(fib(-8));
    System.out.println(fib(8));
  }
}
