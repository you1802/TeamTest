package entity;

import java.util.Calendar;

public class CospaDTO {
   private int id;
   private String url;
   private String name;
   private Calendar date;
   private int cost;
   private int number;
   private int purpose;
   private  int calory;

   public CospaDTO(int id, String url, String name, Calendar date, int cost, int number, int purpose, int calory) {
       this.id = id;
       this.url = url;
       this.name = name;
       this.date = date;
       this.cost = cost;
       this.number = number;
       this.purpose = purpose;
       this.calory = calory;
   }

   public CospaDTO(){}

   //以下アクセッサー

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
       return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Calendar getDate() {
       return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPurpose() {
        return purpose;
    }

    public void setPurpose(int purpose) {
        this.purpose = purpose;
    }

    public int getCalory() {
        return calory;
    }

    public void setCalory(int calory) {
        this.calory = calory;
    }
}
//　ID  URL 名前  日時 値段 個数 用途 カロリー