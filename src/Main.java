import javax.swing.*;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {



    public static void main(String[] args) throws MalformedURLException {
        //запрос url = https://doc-0c-98-docs.googleusercontent.com/docs/securesc/t2710bqkj28m3sbuct25gnbn2rgg19s8/7lqo1vmg6stnt9jes4g3vj8jhdd2cnih/1577440800000/03088178280747381373/03088178280747381373/1CIDKZjQkLRkrebwdW8aQQide5vYGlQ0s?e=download&authuser=0&nonce=tjolnmb5cth52&user=03088178280747381373&hash=1397lgnunuruvh8kk70btnhir89n7h1h
        String url1 = JOptionPane.showInputDialog ("Пожалуйста, введите url файла");
        //String url2 = JOptionPane.showInputDialog ("Пожалуйста, введите url файла");
        url1 = "https://doc-0c-98-docs.googleusercontent.com/docs/securesc/t2710bqkj28m3sbuct25gnbn2rgg19s8/7lqo1vmg6stnt9jes4g3vj8jhdd2cnih/1577440800000/03088178280747381373/03088178280747381373/1CIDKZjQkLRkrebwdW8aQQide5vYGlQ0s?e=download&authuser=0&nonce=tjolnmb5cth52&user=03088178280747381373&hash=1397lgnunuruvh8kk70btnhir89n7h1h";
        URL url = new URL(url1);
        System.out.println(url);

        //запрос директории для сохранения файлов
        JFileChooser fc = new JFileChooser();
        fc.setDialogTitle("Выберите директорию сохранения файла");
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int result = fc.showOpenDialog(null);
//        if (result == fc.APPROVE_OPTION) System.out.println(fc.getSelectedFile());
        System.out.println(fc.getSelectedFile());

        //подготовка коннекта


    }

}
