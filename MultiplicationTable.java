/*
Explanation:
    We define the number (num) and the limit (limit) for the multiplication range.
    We use a for loop iterating from 1 to limit.
    Inside the loop, we calculate the product (product) of num and the current iterator (i).
    Finally, we print the result in the format num * i = product.

    This approach has a time complexity of O(n), where n is the limit. Each iteration involves constant time operations, making it efficient for practical use cases.
*/


public class MultiplicationTable {

    public static void main(String[] args) {
        int num = 8; 
        int limit = 10;

        System.out.println("Multiplication Table of " + num);
        for (int i = 1; i <= limit; i++) {
            int product = num * i;
            System.out.println(num + " * " + i + " = " + product);
        }
    }
}
