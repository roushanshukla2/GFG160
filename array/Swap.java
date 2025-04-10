package array;

public class Swap {
    public static void main(String[] args)
    {
        int a = 10, b = 20;
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        
        // Swap using a temporary variable
        int temp = a;
        a = b;
        b = temp;
        
        System.out.println("After swapping: a = " + a + ", b = " + b);
        
        // Swap without using a temporary variable
        a = 10; // Resetting values for demonstration
        b = 20;
        
        a = a + b; // Step 1: a becomes 30 (10 + 20)
        b = a - b; // Step 2: b becomes 10 (30 - 20)
        a = a - b; // Step 3: a becomes 20 (30 - 10)
        
        System.out.println("After swapping without temp: a = " + a + ", b = " + b);
    }
    
}
