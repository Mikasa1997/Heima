package com.enze.d2_simpledateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test3 {
    public static void main(String[] args) throws ParseException {
        String startTime = "2020年11月11日00:00:00";
        String endTime = "2020年11月11日00:10:00";
        String jiaPayTime = "2020年11月11日0:03:47";
        String piPayTime = "2020年11月11日0:10:11";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日HH:mm:ss");
        Date st = sdf.parse(startTime);
        Date et = sdf.parse(endTime);
        Date jt = sdf.parse(jiaPayTime);
        Date pt = sdf.parse(piPayTime);

        if (jt.after(st) && jt.before(et)) {
            System.out.println("小贾秒杀成功！");
        } else {
            System.out.println("小贾秒杀失败");
        }

        if (pt.after(st) && pt.before(et)) {
            System.out.println("小皮秒杀成功!");
        } else {
            System.out.println("小皮秒杀失败！");
        }

    }
}
