package CashWithDrawSystem;

public class Main {

    public static void main(String[] args) {
        Verific verific = new VerificarValue();

        UserInsertConsole insertConsole = new UserInsertConsole();
        insertConsole.insert();

        if(verific.verificValue(insertConsole.getValue())){
            Count count = new Count();

            count.resolve(insertConsole.getValue());
        }

    }
}
