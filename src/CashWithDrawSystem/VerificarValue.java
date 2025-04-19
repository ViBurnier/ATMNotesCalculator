package CashWithDrawSystem;

//Usa a interface para verificar o valor, retornando um valor booleano, que serve como uma chave, true para poder passar
// e false para trancar (nesse caso, jogar um erro, e implementar um tratamento mais pra frente).
public class VerificarValue implements Verific{

    @Override
    //Passa valor boolean para o if no Main, se retornar true, a conta com o valor é feita.
    public boolean verificValue(int valor) {
        System.out.println("Verificando valor...");
        if( valor <= 0){
            throw new IllegalArgumentException("Valor invalido");
        }

        return true;
    }
}
