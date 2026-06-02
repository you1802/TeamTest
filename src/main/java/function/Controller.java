package function;

import entity.CospaDTO;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Controller {
    //商品情報を入力
    public ArrayList<CospaDTO> listInput(Scanner scanner, ArrayList<CospaDTO> list) {
        CospaDTO cospaDTO = new CospaDTO();
        cospaDTO.setId(list.isEmpty() ? 0 : list.get(list.size() - 1).getId() + 1);
        System.out.println("URL:?");
        cospaDTO.setUrl(scanner.nextLine());
        System.out.println("商品名:?");
        cospaDTO.setName(scanner.nextLine());
        cospaDTO.setDate(Calendar.getInstance());
        System.out.println("価格:?");
        cospaDTO.setCost(scanner.nextInt());
        System.out.println("個数:?");
        cospaDTO.setNumber(scanner.nextInt());
        System.out.println("用途:? (１<塩　２<甘　３<他)");
        cospaDTO.setPurpose(scanner.nextInt());
        System.out.println("カロリー:?");
        cospaDTO.setCalory(scanner.nextInt());
        list.add(cospaDTO);
        return list;
    }
    //商品情報を編集
    public void listEdit(Scanner scanner, ArrayList<CospaDTO> list){
        System.out.println("編集ID:?");
        int id = scanner.nextInt();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id){
                System.out.println("編集項目:? (URL:1 商品名:2 価格:3 個数:4 用途:5 カロリー:6)");
                switch (scanner.nextInt()) {
                    case 1: list.get(i).setUrl(scanner.nextLine()); break;
                    case 2: list.get(i).setName(scanner.nextLine()); break;
                    case 3: list.get(i).setCost(scanner.nextInt()); break;
                    case 4: list.get(i).setNumber(scanner.nextInt()); break;
                    case 5: list.get(i).setPurpose(scanner.nextInt()); break;
                    case 6: list.get(i).setCalory(scanner.nextInt()); break;
                }
                return;
            }
        }
        System.out.println("キャンセル");
    }


}
