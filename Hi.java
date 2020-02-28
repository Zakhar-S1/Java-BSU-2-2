import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        
        int y = 6;
        int x = in.nextInt();
          
        System.out.println("Hello World!");
        Sysyem.out.println("Goodbye World!");
        System.out.println("x=" + x + "; y=" + y);
        
        in.close();
    }
}
