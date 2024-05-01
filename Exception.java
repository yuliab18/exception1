 class Exception {
    private int a ;
    private String b;
    public  Exception(int a, String b){
        this.a = a;
        this.b = b;
    }
     public void firstExceptions() {
         try {
             Object obj = Integer.valueOf(a);
             String str = (String) obj;
             int c = a / 0;
         } catch (ClassCastException e) {
             System.out.println("Невірне приведення типів: " + e.getMessage());
         } catch (ArithmeticException e) {
             System.out.println("Арифметична помилка: " + e.getMessage());
         }
     }
      public void secondExceptions() {
         try { int c = a / 0;
             try {
                 Object obj = Integer.valueOf(a);
                 String str = (String) obj;
             } catch (ClassCastException e) {
                 System.out.println("Невірне приведення типів: " + e.getMessage());
             }
         } catch (ArithmeticException e) {
             System.out.println("Арифметична помилка: " + e.getMessage());
         }
     }
public void thirdException (){
    try {
        Object obj = Integer.valueOf(a);
        String str = (String) obj;
        int c = a / 0;
    } catch (ClassCastException e) {
        System.out.println("Невірне приведення типів: " + e.getMessage());
    } catch (ArithmeticException e) {
        System.out.println("Арифметична помилка: " + e.getMessage());
    }
       finally {
         System.out.println("Виконання блоку finally");
     }

}

 }


