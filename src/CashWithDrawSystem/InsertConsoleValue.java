package CashWithDrawSystem;

import java.util.Scanner;

//Usa a interface InsertValue, que serve para que cada class tenha seu proprio método
// de enviar valor, seja para VerificarValue, count.resolve ou para outras que possam surgir.
public class InsertConsoleValue implements InsertValue {
   private int value;

   @Override
   //Scanner para usuario digitar valor
   public void insert() {
      Scanner askValue = new Scanner(System.in);
      System.out.println("insira um valor");

      value = askValue.nextInt();
   }


   //pega o valor do scanner
   public int getValue() {
      return value;
   }
}
