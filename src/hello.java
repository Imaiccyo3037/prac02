public class hello {
   public static void main(String args[]) {
 
     System.out.println("Hello");
      System.out.println("Hello World!!");
      System.out.println("Hi! Yanchimo");
     printRandomHiroshiAge(30);

    }
   
   /** 
    * �Ђ낵�̔N��������_���ŕ\��
    * @param max �Ђ낵��max�̔N��
   */
   public void printRandomHiroshiAge(int max){
 	  int r = (int)(Math.random() * max) + 1;
 	  System.out.println("�Ђ낵��" + r + "�΂ł�");
   }

   /** 
    * ��������̔N��������_���ŕ\��
    * @param max �Ђ낵��max�̔N��
   */
   public void printRandomHiroshiAge(int max){
 	  int r = (int)(Math.random() * max) + 100;
 	  System.out.println("�Ђ낵��" + r + "�΂ł�");
   }
 }