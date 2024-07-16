import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ler_Deletar_E_Criar_Arquivos_Txt {
   public static void main(String[] args) throws IOException {
//       Path path = Path.of("C:\\Marco\\Programação\\ANOTAÇÕES\\Back-End\\Java\\ANOTAÇÕES.txt");
//       if (Files.notExists(path)) {
//           Files.createFile(path);
//       }
//       String a = "abc";
//       Files.writeString(path, a);
//       List<String> listaLinhas = Files.readAllLines(path);
//       listaLinhas.forEach(System.out::println);


//        Path caminho = Paths.get("C:\\Marco\\Programação\\ANOTAÇÕES\\Back-End\\Java\\ANOTAÇÕES.txt");
//        List<String> listaLinhas2 = Files.readAllLines(caminho);
//        String content = String.join("\n", listaLinhas2);
//        System.out.println(content);

//       boolean isArchiveCreate = new File("C:\\Marco\\arq.txt").createNewFile();
//       FileWriter fw = new FileWriter("C:\\Marco\\arq.txt", true);
//       fw.write("Marco\n");
//       int c = 0;
//       while(c < 10) {
//           fw.write(c + "\n");
//           c++;
//       }
//       fw.close();
//       fw.flush();
        String linha = "aaa;a aaaaaa ;aaaaaaa";
        String[] content = linha.split(";");
//       System.out.println(content[0]);
//       System.out.println(content[1]);
//       System.out.println(content[2]);

//       FileReader fr = new FileReader("arq.txt");
//       BufferedReader bf = new BufferedReader(fr);
//       while (bf.readLine() != null) {
//           String linha = bf.readLine();
//           System.out.println(linha);
//       }

//       try {
//           Path path = Paths.get("Java\\ANOTAÇÕES.txt");
//           if (Files.notExists(path)) {
//               Files.createFile(path);
//           }
//           List<String> listaLinhas2 = Files.readAllLines(path);
//           String content = String.join("\n", listaLinhas2);
//           System.out.println(content);
//
//           File file = new File("C:\\Marco\\out");
           //boolean sucesso = new File(file + "\\out").mkdir();
           //boolean sucesso2 = new File(file + "\\out\\testando123.txt").createNewFile();
//           String source = file.getParent();
//           String source2 = file.getPath();
//           System.out.println(source);
//           System.out.println(source2);
//           List<String> lista = Files.readAllLines(path);
//           String content = String.join("\n", lista);
//           System.out.println(content);
//       } catch (Exception e) {
//           System.out.println(e);
//       }
   }
}
