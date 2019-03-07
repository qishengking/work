package fristchapter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class PutongCeshi {
    public static void main(String[] args){
        String[] mData = {"2017-06-23 00:00:00", "2017-06-24 00:00:00", "2017-06-25 00:00:00", "2017-06-26 00:00:00",
                "2017-06-27 00:00:00", "2017-06-21 00:00:00", "2017-06-29 00:00:00", "2017-06-30 00:00:00",
                "2017-07-01 00:00:00"};

        List<Calendar> data1 = new ArrayList<>();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd H:m:s");
        Date startDate = null;
        try {
            for (int i = 0; i < mData.length; i++) {
                Calendar c = Calendar.getInstance();
                startDate = dateFormat.parse(mData[i]);
                // 对 calendar 设置为 date 所定的日期
                c.setTime(startDate);
                data1.add(c);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }

//        for(Calendar d:data1){
//            System.out.println(d.getTime());
//        }

//        int count = join(data1);
//        System.out.println(count);
//        for(int i=1;i<3;i++){
//            System.out.println(i);
//        }


    }


    public static int join(List<Calendar> data1) {
        int count = 1;
        for (int i = data1.size() - 1; i > 1; i--) {
            //判断一周连续
            if ((data1.get(i).getTimeInMillis() - data1.get(i - 1).getTimeInMillis()) / (1000 * 60 * 60 * 24) == 1) {
//                if (data1.get(i).get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
////                    count++;
////                    if(count==7){
////                        break;
////                    }
////                } else {
////                    count = 1;
////                    break;
////                }
                count++;
                System.out.println("ceshi:"+count);
            } else {
                break;
            }
        }
        return count;
    }
}
