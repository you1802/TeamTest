package function;

import entity.CospaDTO;

import java.util.ArrayList;
import java.util.Calendar;

public class Display {
    public void listDisplay(ArrayList<CospaDTO> list) {
        for (int i = 0; i < list.size(); i ++) {
        System.out.println("ID:" + list.get(i).getId() + " URL:" + list.get(i).getUrl() + " 商品名:" + list.get(i).getName() + " 日時:" + list.get(i).getDate().get(Calendar.HOUR_OF_DAY) + " 価格:" + list.get(i).getCost() + " 個数:" + list.get(i).getNumber() + " 用途:" + list.get(i).getPurpose() + " カロリー:" + list.get(i).getCalory());
        }
    }
}
