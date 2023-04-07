package com.raven.utils;

import java.awt.Component;
import javax.swing.JOptionPane;

public class XDialog {

    /**
     * Hiển thị thông báo cho ngư�?i dùng
     *
     * @param parent là cửa sổ chứa thông báo
     * @param message là thông báo
     */
    public static void alert(Component parent, String message) {
        JOptionPane.showMessageDialog(parent, message,
                "Notification", JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Hiển thị thông báo và yêu cầu ngư�?i dùng xác nhận
     *
     * @param parent là cửa sổ chứa thông báo
     * @param message là câu h�?i yes/no
     * @return là kết quả nhận được true/false
     */
    public static boolean confirm(Component parent, String message) {
        int result = JOptionPane.showConfirmDialog(parent, message,
                "Notification",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        return result == JOptionPane.YES_OPTION;
    }
    
    public static boolean delete(Component parent, String message) {
        int result = JOptionPane.showConfirmDialog(parent, message,
                "Notification",
                JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
        return result == JOptionPane.YES_OPTION;
    }

    /**
     * Hiển thị thông báo yêu cầu nhập dữ liệu
     *
     * @param parent là cửa sổ chứa thông báo
     * @param message là thông báo nhắc nhở nhập
     * @return là kết quả nhận được từ ngư�?i sử dụng nhập vào
     */
    public static String prompt(Component parent, String message) {
        return JOptionPane.showInputDialog(parent, message,
                "Notification", JOptionPane.INFORMATION_MESSAGE);
    }

}
