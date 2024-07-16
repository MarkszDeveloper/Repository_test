public class InnerClass {
    public int valor = 1;

    // Implementação do Runnable para que já seja implementado ao ser instanciado.
    protected static class UserProfile implements Runnable {
        public int password = 0;
        public int user_length = 0;
        @Override
        public void run() {
            System.out.println("Run!");
        }
    }
    // Criação de um Enum como uma Inner Class.
    public enum Dias_Da_Semana2 {
        SUNDAY("Segunda"),
        MONDAY("Terça"),
        TUESDAY("Quarta"),
        WEDNESDAY("Quinta"),
        FRIDAY("Sexta"),
        SATURDAY("Sábado");

        public final String nomeEmPortugues;
        Dias_Da_Semana2(String nomeEmPortugues) {
            this.nomeEmPortugues = nomeEmPortugues;
        }
    }
}
