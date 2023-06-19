import java.io.*;
import java.nio.charset.StandardCharsets;
//import java.io.FileOutputStream;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;

public class Main {
    public static void main(String[] args) {
//        ---------- Запись в файл ----------

//        String text = "Hello world";
//
//        try (FileOutputStream fos = new FileOutputStream("notes.txt")) {
//            fos.write(text.getBytes(), 0, text.getBytes().length);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }


//        ---------- Чтение из файла ----------
//
//        try (FileInputStream fin = new FileInputStream("notes.txt")) {
//            int i;
//            while ((i =fin.read()) != -1) {
//                System.out.print((char) i);
//            }
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }

//        ---------- Чтение и спользование буфера ----------
//        String text = "Hello world\nGhbdtn";
//
//        byte[] buffer = text.getBytes();
//
//        try (ByteArrayInputStream in = new ByteArrayInputStream(buffer);
//        BufferedInputStream fin = new BufferedInputStream(in)) {
//            int i;
//
//            while ((i = fin.read()) != -1) {
//                System.out.print((char) i);
//            }
//
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }

//        ---------- Запись с испоьзованием буфера ----------

//        String text = "Hello world!";
//        try (FileOutputStream out = new FileOutputStream("notes.txt");
//        BufferedOutputStream fout = new BufferedOutputStream(out)) {
//
//            fout.write(text.getBytes(), 0, text.getBytes().length);
//
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

//      ----------------------------------------------------------------------------------------------------

//      ---------- Посимвольная запись в файл ----------

//        String text = "Hello world";
//
//        try (FileWriter writer = new FileWriter("notes.txt", false)) {
////          Запись полной строки
//            writer.write(text);
//
////          Запись по символам
//            writer.write("!");
//            writer.append("\n");
//
////          Очищаем буфер
//            writer.flush();
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

//        ---------- Посимвольное чтение из файла ----------

//        try (FileReader reader = new FileReader("notes.txt")) {
//            int i;
//
//            while ((i = reader.read()) != -1) {
//                System.out.print((char) i);
//            }
//
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

    }
}

