//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.io.*;

public class Main {
    public static void main(String[] args) {
        final String txtFolder = "txt";
        final String resultFile = "result.txt";
        String txt;
        String current;
        String result;
        String lineText = "";

        current = System.getProperty("Пользователь");
        txt = current + File.separator + txtFolder;
        result = txt + File.separator + resultFile;
        File x = new File(txt);
        if (x.exists()) {
            File[] files = x.listFiles();
            for (File i : files) {
                String fileName = i.getName();
                if (fileName.startsWith("file") && fileName.endsWith(".txt") && i.isFile() ){

                    String buf = "";
                    try(BufferedReader y = new BufferedReader(new FileReader(i))) {
                        while ((buf=y.readLine()) != null){
                            lineText += buf + " ";
                        }

                    }catch (IOException ex){
                        System.out.println("Ошибка файла " + fileName);
                        ex.printStackTrace();
                    }

                }
            }

            try(BufferedWriter z = new BufferedWriter(new FileWriter(result))) {
                z.write(lineText);
            } catch (IOException ex){
                System.out.println("Ошибка файла " + resultFile);
                ex.printStackTrace();
            }

        } else {
            System.out.println(" Ошибка каталога!");
        }

    }
}