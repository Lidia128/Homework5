import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

    //Задача № 1
        System.out.println("Задача № 1");
        System.out.println();
        int clientOs = 0;
               if (clientOs != 1){
            System.out.println("Установите версию приложения для iOS по ссылке");
    }else{
        System.out.println("Установите версию приложения для Android по ссылке");}
        System.out.println();
    //Задача № 2
        System.out.println("Задача № 2");
        System.out.println();
        int clientDeviceYear=2015;
          if (clientOs==0 && clientDeviceYear<=2015) {
              System.out.println("Установите облегченную версию приложения для iOS по ссылке");
          }else if (clientOs!=0 && clientDeviceYear<=2015) {
              System.out.println("Установите облегченную версию приложения для Android по ссылке");
          }else if (clientOs==0 && clientDeviceYear>2015) {
              System.out.println("Установите версию приложения для iOS по ссылке");
          }else{
              System.out.println("Установите версию приложения для Android по ссылке");}
        System.out.println();
        //Задача № 3
        System.out.println("Задача № 3");
        System.out.println();
        int year=2021;
        if (year%4==0) {
            System.out.println("Год является високосным " + year);
        }else if (year%4!=0){
            System.out.println("Год не является високосным");
        }
        System.out.println();
        //Задача № 4
        System.out.println("Задача № 4");
        System.out.println();
        int deliveryDistance = 95;
        int day=1;
        if (deliveryDistance<=20) {
            System.out.println("Доставка будет в течении " +day+ " дня");
        }else if (deliveryDistance>=20 && deliveryDistance<=60){
            System.out.println("Доставка будет в течении " +(day+1)+ " дней");
        }else if (deliveryDistance>=60 && deliveryDistance<=100){
            System.out.println("Доставка будет в течении " +(day+2)+ " дней");
        }
        System.out.println();
        //Задача № 5
        System.out.println("Задача № 5");
        System.out.println();
        int monthNumber = 12;
        switch (monthNumber){
            case 1:
                System.out.println("Январь - зима");
                break;
            case 2:
                System.out.println("Февраль - зима");
                break;
            case 3:
                System.out.println("Март - весна");
                break;
            case 4:
                System.out.println("Апрель - весна");
                break;
            case 5:
                System.out.println("Май - весна");
                break;
            case 6:
                System.out.println("Июнь - лето");
                break;
            case 7:
                System.out.println("Июль - лето");
                break;
            case 8:
                System.out.println("Август - лето");
                break;
            case 9:
                System.out.println("Сентябрь - осень");
                break;
            case 10:
                System.out.println("Октябрь - осень");
                break;
            case 11:
                System.out.println("Ноябрь - осень");
                break;
            case 12:
                System.out.println("Декабрь - зима");
                break;
            default:
                System.out.println("Такого месяца нет");


        }
          }




    }