package CashWithDrawSystem;

public class VerificarValue implements Verific{

    @Override
    public boolean verificValue(int valor) {
        System.out.println("Verificando valor...");
        if( valor <= 0){
            throw new IllegalArgumentException("Valor invalido");
        }

        return true;
    }
}
