package com.joker.util;

public class CommonUtil {
    /**
     * 性别代码转换成中文
     * @param sexDm
     * @return
     */
    public static String chanslateSex(int sexDm) {
        switch (sexDm) {
            case 0:
                return "女";
            case 1:
                return "男";
            default:
                return "不确定";
        }
    }
}
