package day8.assign;

public class ClassMethod1 {
   public static boolean isValidAge(int age, int min, int max) {
//       if (min < age && age < max) {
//           return true;
//       } else {
           return min < age && age < max;
       }
//   }

    public static void main(String[] args) {
        ClassMethod1 cm1 = new ClassMethod1();
        System.out.println(isValidAge(20,18,30));
    }
}

