package com.joker.util;

public class CommonUtil {
    /**
     * �Ա����ת��������
     * @param sexDm
     * @return
     */
    public static String chanslateSex(int sexDm) {
        switch (sexDm) {
            case 0:
                return "Ů";
            case 1:
                return "��";
            default:
                return "��ȷ��";
        }
    }
}
