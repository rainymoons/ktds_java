package day8.assign;

public class ClassMethod1 {
   public static boolean isValidAge(int age, int min, int max) {
       if (min < age && age < max) {
           return true;
       } else {
           return false;
       }
   }

    public static void main(String[] args) {
        System.out.println(ClassMethod1.isValidAge(20,18,30));
    }
}

