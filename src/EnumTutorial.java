import org.jetbrains.annotations.NotNull;

import static java.util.Calendar.SUNDAY;

public class EnumTutorial {
    public static void main(String[] args) {
        RecordTutorial recordTutorial = new RecordTutorial("Marco", 12345);
        System.out.println(recordTutorial.nome().toUpperCase());
        NewClass newClass = new NewClass();
        //newClass.baixarLivro();
        //NewInterface newInterface = new NewClass();
        //newInterface.ler();

        System.out.println(recordTutorial.upperCaseMessage());
        /*Dias_Da_Semana dias_da_semana = Dias_Da_Semana.SUNDAY;
        System.out.println(dias_da_semana);
        System.out.println(Dias_Da_Semana.SATURDAY.nomeEmPortugues);
        System.out.println(Dias_Da_Semana.SATURDAY);
        System.out.println(Dias_Da_Semana.MONDAY.nomeEmPortugues);
        asSunday(dias_da_semana);*/

    }
    public static void divisibleBy0(int valor) {
        if (valor > 0) {
            try {
                int result = valor / 0;
            }
            catch (ArithmeticException ae){
                System.out.println("Divisão inválida");
            }
        }
    }
    public static void asSunday(@NotNull Dias_Da_Semana dias_da_semana) {
        switch (dias_da_semana) {
            case SUNDAY -> {
                System.out.println("It's Sunday! :)");
            }
            default -> System.out.println("Not is Sunday :(");
        }
    }
}


