import javax.swing.*;
import java.io.File;

public class Main {



    public static void main(String[] args) {
        //запрос url
        String url = JOptionPane.showInputDialog ("Пожалуйста, введите url файла");;
        System.out.println(url);

        //запрос директории для сохранения файлов
        JFileChooser fc = new JFileChooser();
        fc.setDialogTitle("Выберите директорию сохранения файла");
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int result = fc.showOpenDialog(null);
//        if (result == fc.APPROVE_OPTION) System.out.println(fc.getSelectedFile());
        System.out.println(fc.getSelectedFile());

        

    }

}
