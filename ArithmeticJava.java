
class ArithmeticJava{
    public static void main(String[] args) {
        int no1=20;
        int no2=30;

        int ans=no1/no2;
        System.out.println(ans);
         
        try {
            int ans =no1/no2;
            System.out.println("answer ="+ans);
        } catch (ArithmeticException e) {
           
            System.out.println("Error :division by zero not allowed");
        }
        finally{
            System.out.println("program continues");
        }

    }
}