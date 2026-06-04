package function;

import entity.CospaDTO;

import java.io.File;
import java.io.FileNotFoundException;
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
}