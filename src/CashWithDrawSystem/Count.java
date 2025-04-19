package CashWithDrawSystem;

public class Count{
    //instacia a classe exibir, isso ainda causa um forte acoplamento mas já será resolvido.
    static Exibir exibir = new Exibir();

    //nota de dinheiro que sera atualizada pelo método newNoteBank().
    private static int bankNote = 100;


    public static void resolve(int valueInsert){

        //esses dois atributos estão aqui para não perder os valores que ganharam dentro do while

        //valor de comparação serve para armazenar as notas e comparar com o valor inserido
        //se o valueCompare for igual ao valueInsert a conta acaba.
        int valueCompare = 0;
        int bankAmount = 0;

        while(valueCompare < valueInsert){

            bankAmount = valueInsert / bankNote;
            valueInsert = (valueInsert - valueCompare);
            valueCompare =+ bankNote * bankAmount;

            int imp = valueInsert % 2;
            int calc = bankAmount * bankAmount;

            if(bankAmount != 0){
                //se valor for impar
                    if(imp == 1){
                        exibir.showAmountNote(bankAmount, bankNote);
                    }
                //se valor for par
                    if(calc == valueInsert){
                        exibir.showAmountNote(bankAmount, bankNote);
                    }
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

        else{
            bankNote = 2;
            return bankNote;
        }

    }


}

