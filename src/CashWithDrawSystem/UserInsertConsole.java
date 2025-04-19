package CashWithDrawSystem;

import java.util.Scanner;

public class UserInsertConsole implements InsertValue {
   private int value;

   @Override
   public void insert() {
      Scanner askValue = new Scanner(System.in);
      System.out.println("insira um valor");

      value = askValue.nextInt();

   }

   public int getValue() {
      return value;
   }
}
