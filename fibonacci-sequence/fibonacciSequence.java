public class Main {
        
        static int fib(int num) {
                
                //1, 1, 2, 3, 5, 8, 13,
                //fib(3)=fib(2)+fib(1)
                //fib(2)=fib(1)+fib(0)
                //fib(0)=0
                if(num==0) return 0;
                if(num==1) return 1;
                return fib(num-1)+fib(num-2);
        }

        public static void main(String[] args) {
         System.out.println(fib(4));       
         System.out.println(fib(3));       
         System.out.println(fib(5));       
         System.out.println(fib(6));       
        };
}

