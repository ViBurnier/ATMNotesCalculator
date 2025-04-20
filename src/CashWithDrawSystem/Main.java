package CashWithDrawSystem;

public class Main {

    public static void main(String[] args) {
        Verific verific = new VerificarValue();
        Count count = new Count();

        InsertConsoleValue insertConsoleValue = new InsertConsoleValue();
        insertConsoleValue.insert();

        while(!verific.verificValue(insertConsoleValue.getValue())){
            System.out.println("insira um valor valido");
            insertConsoleValue.insert();
        }


            count.resolve(insertConsoleValue.getValue());

    }
}
