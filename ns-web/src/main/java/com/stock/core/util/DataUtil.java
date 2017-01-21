package com.stock.core.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: huacy
 * Date: 2017/1/21
 * Time: 15:04
 */
public class DataUtil {

    private static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /**
     * 獲取整數時間get 11:05 11:10 time
     */
    public static String getToday5SecondsDate() {
        Calendar calendar = Calendar.getInstance();
        int minute =  getMinute(calendar.get(Calendar.MINUTE));
        calendar.set(Calendar.MINUTE, minute);
        calendar.set(Calendar.SECOND, 0);
        return dateFormat.format(calendar.getTime());
    }

    /**
     * 根據時間獲取整數時間
     */
    public static String get5SecondsByDate(Date inputDate) {
        int minute = getMinute(inputDate.getMinutes());
        inputDate.setMinutes(minute);
        return dateFormat.format(inputDate);
    }

    private static int getMinute(int minute) {
        int result = 0;
        if(0 <= minute && minute < 5){
            result = 0;
        } else if(5 <= minute && minute < 10){
            result = 5;
        } else if(10 <= minute && minute < 15){
            result = 10;
        } else if(15 <= minute && minute < 20){
            result = 15;
        } else if(20 <= minute && minute < 25){
            result = 20;
        } else if(25 <= minute && minute < 30){
            result = 25;
        } else if(30 <= minute && minute < 35){
            result = 30;
        } else if(35 <= minute && minute < 40){
            result = 35;
        } else if(40 <= minute && minute < 45){
            result = 40;
        } else if(45 <= minute && minute < 50){
            result = 45;
        }else if(50 <= minute && minute < 55){
            result = 50;
        }else if(55 <= minute && minute <= 59){
            result = 55;
        }
        return result;
    }
}
