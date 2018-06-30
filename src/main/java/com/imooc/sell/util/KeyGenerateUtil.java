package com.imooc.sell.util;

import java.util.Random;

//生成数据库id索引的随机生成方法
public class KeyGenerateUtil {

    /** 生成唯一的主键
     * 格式：时间+随机数
     * @return**/
    //必须要加synchronized ，否则多线程时可能会产生相同的返回值
    public static synchronized String genUniqueKey() {
        Random random = new Random();

        //返回的是从1970.1.1到本机现在时间的毫秒数，为long，但是注意如果客户端和服务端时间不一样，会出现问题！
        System.currentTimeMillis();

        Integer number  = random.nextInt(900000) + 100000;

        return System.currentTimeMillis() + String.valueOf(number);
    }
}
