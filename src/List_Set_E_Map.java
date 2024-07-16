import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.time.Duration;
import java.util.*;
import java.util.stream.Stream;

public class List_Set_E_Map {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> lista = new ArrayList<>();
        Set<Integer> lista2 = new HashSet<>();
        Map<String, Integer> lista3 = new HashMap<>();
        lista3.put("abx", 1);
        lista3.put("abc", 5);
        if (lista3.containsKey("abc")) {
            lista3.put("abx", 4);
        }
        lista3.forEach((chave, valor) -> {
            System.out.println("Valor: " + valor + "\tChave: " + chave);
        });
        lista2.add(1);
        lista2.add(null);
        lista2.add(null);
        lista2.add(5435);
        Iterator<Integer> iterator = lista2.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        List<Integer> lista4 = new ArrayList<>();

        lista4.add(1);
        lista4.add(10);
        lista4.add(20);
        lista4.add(Integer.parseInt("40"));
        lista4.add(50);
        lista4.forEach(System.out::println);

        Generics<Double> generics = new Generics<Double>(1232.423);
        ArrayList<Integer> sla = new ArrayList<>();
        List<?> sla2 = Arrays.asList(1, 2, 3, 4, 5, "Marco");
        sla2.forEach(System.out::println);
        sla.add(12345);
        sla.set(0, 2222222);
        System.out.println(sla.get(0));


        Thread thread = new Thread(() -> {
            for (int i = 0; i <10; i++) {
                System.out.println("Olá");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException("Programa interrompido!");
                }
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Abacaxi");
            }
        });
        thread.start();
        thread.join();
        boolean vivo = thread.isAlive();
        System.out.println(vivo);
        Thread thread2 = new Thread(() -> System.out.println(2));
        thread2.start();
        thread2.join();
        thread3.start();
        thread3.join();
        System.out.println(thread2.isAlive());

        InterfaceFuncional2 interfaceFuncional2 = (nome, segNome) -> System.out.println("Hello World! "+nome+" "+ segNome);
        String nome = "Marco";
        String segNome = "Antonio";
        interfaceFuncional2.escrever(nome, segNome);


        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setSize(420, 420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton butao = new JButton("MEU BUTAO");
        butao.addActionListener((e) -> System.out.println("Olá :)"));
        butao.setBounds(100, 100, 200, 100);
        frame.add(butao);
    }
    public void ler() {

    }
}