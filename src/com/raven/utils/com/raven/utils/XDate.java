package com.raven.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class XDate {

    static final SimpleDateFormat DATE_FORMATER = new SimpleDateFormat("MM/dd/yyyy");

    /**
     * Chuyển đổi String sang Date
     *
     * @param date là String cần chuyển
     * @param pattern là định dạng th�?i gian
     * @return Date kết quả
     */
    public static Date toDate(String date, String... pattern) {
        try {
            if (pattern.length > 0) {
                DATE_FORMATER.applyPattern(pattern[0]);
            }
            if (date == null) {
                return XDate.now();
            }
            return DATE_FORMATER.parse(date);
        } catch (ParseException ex) {
            throw new RuntimeException(ex);
        }
    }

    /**
     * Chuyển đổi từ Date sang String
     *
     * @param date là Date cần chuyển đổi
     * @param pattern là định dạng th�?i gian
     * @return String kết quả
     */
    public static String toString(Date date, String... pattern) {
        if (pattern.length > 0) {
            DATE_FORMATER.applyPattern(pattern[0]);
        }
        if (date == null) {
            date = XDate.now();
        }
        return DATE_FORMATER.format(date);
    }

//    public static boolean isDate(String date, String... pattern) {
//        try {
//            if (pattern.length > 0) {
//                DATE_FORMATER.applyPattern(pattern[0]);
//            }
//            if (date == null) {
//                return false;
//            }
//            DateFormat sdf = new SimpleDateFormat(this.dateFormat);
//            sdf.setLenient(false);
//            try {
//                sdf.parse(dateStr);
//            } catch (ParseException e) {
//                return false;
//            }
//            return true;
//        } catch (ParseException ex) {
//            throw new RuntimeException(ex);
//        }
//    }

    /**
     * Lấy th�?i gian hiện tại
     *
     * @return Date kết quả
     */
    public static Date now() {
        return new Date();
    }

    /**
     * Bổ sung số ngày vào th�?i gian
     *
     * @param date th�?i gian hiện có
     * @param days số ngày cần bổ sung váo date
     * @return Date kết quả
     */
    public static Date addDays(Date date, int days) {
        date.setTime(date.getTime() + days * 24 * 60 * 60 * 1000);
        return date;
    }

    /**
     * Bổ sung số ngày vào th�?i gian hiện hành
     *
     * @param days số ngày cần bổ sung vào th�?i gian hiện tại
     * @return Date kết quả
     */
    public static Date add(int days) {
        Date now = XDate.now();
        now.setTime(now.getTime() + days * 24 * 60 * 60 * 1000);
        return now;
    }
}
