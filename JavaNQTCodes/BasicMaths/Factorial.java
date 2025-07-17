// class Solution
// {
//     public int factorial(int num)
//     {
//         if(num == 0 || num == 1) return 1;
//         return num * factorial(num - 1);
//     }
// }


class Factorial {
    static int factorial(int num)
    {
        if(num == 0 || num == 1) return 1;
        return num * factorial(num - 1);
    }
    public static void main(String[] args) {
        // Solution s1 = new Solution();
        // System.out.println("Factorial : " + s1.factorial(5));
        System.out.println("Factorial : " + factorial(5));
    }
    
}
