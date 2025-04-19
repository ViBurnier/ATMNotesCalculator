package CashWithDrawSystem;

public class Count{
    //sempre usar o menor numeros de notas possiveis
    //usar if e while
    //valor ser positivo e multiplo de 2 (valor + e * 2)
    //valor de saque 376

    //    private final int nota50 = 50;x
    //    private final int nota20 = 20;x
    //    private final int nota10 = 10;x
    //    private final int nota5 = 5;x
    //    private final int nota2 = 2;x

    static Exibir show = new Exibir();

    private static int bankNote = 100;

    public static void resolve(int valueInsert){
        //atualizar em um so atributo os valores das notas
        //quero que while verifique quantas notas cabem dentro de value (e talvez atualizar o valor, ainda nao sei)

        double valueCompare = 0;
        double bankAmount = 0.0;

        while(valueCompare < valueInsert){

            valueInsert = (int) (valueInsert - valueCompare);
            bankAmount = Math.floor(valueInsert / bankNote);


            valueCompare =+ bankNote * bankAmount;

            if(bankAmount != 0){

            show.showAmountNote(bankAmount, bankNote);
            }
            newNoteBank();
        }

    }

    public static int newNoteBank(){

        if(bankNote == 100 || bankNote == 20 || bankNote == 10){
            bankNote = bankNote / 2;
            return bankNote;
        }


        if(bankNote == 50){
            bankNote = bankNote - 30;
            return bankNote;
        }


        if(bankNote == 5){
            bankNote = bankNote - 3;
            return bankNote;
        }

        else{
            return 0;
        }

    }


}

