public class hello {
   public static void main(String args[]) {
 
     System.out.println("Hello");
      System.out.println("Hello World!!");
      System.out.println("Hi! Yanchimo");
     printRandomHiroshiAge(30);

    }
   
   /** 
    * ひろしの年齢をランダムで表示
    * @param max ひろしのmaxの年齢
   */
   public void printRandomHiroshiAge(int max){
 	  int r = (int)(Math.random() * max) + 1;
 	  System.out.println("ひろしは" + r + "歳です");
   }

   /** 
    * ヤンさんの年齢をランダムで表示
    * @param max ひろしのmaxの年齢
   */
   public void printRandomHiroshiAge(int max){
 	  int r = (int)(Math.random() * max) + 100;
 	  System.out.println("ひろしは" + r + "歳です");
   }
 }