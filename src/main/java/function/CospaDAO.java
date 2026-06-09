package function;

import entity.CospaDTO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

//ファイルから読み込みと保存
public class CospaDAO {
    File file = new File("database.txt");

    //読み込み
    public ArrayList<CospaDTO> load() {
        ArrayList<CospaDTO> list = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()){
                CospaDTO product = new CospaDTO();

                product.setId(scanner.nextInt());
                product.setUrl(scanner.next());
                product.setName(scanner.next());
                product.setDate(scanner.next());
                product.setCost(scanner.nextInt());
                product.setNumber(scanner.nextInt());
                product.setPurpose(scanner.nextInt());
                product.setCalory(scanner.nextInt());

                list.add(product);
            }
            return list;
        } catch (FileNotFoundException e) {
            return list;
        }
    }

    //保存
    public void save(ArrayList<CospaDTO> list){

        String saveStr = "";

        for (int i = 0; i < list.size(); i++) {
            saveStr += list.get(i).getId() + " ";
            saveStr += list.get(i).getUrl() + " ";
            saveStr += list.get(i).getName() + " ";
            saveStr += list.get(i).getDate() + " ";
            saveStr += list.get(i).getCost() + " ";
            saveStr += list.get(i).getNumber() + " ";
            saveStr += list.get(i).getPurpose() + " ";
            saveStr += list.get(i).getCalory() + " ";
        }

        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(saveStr);
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}