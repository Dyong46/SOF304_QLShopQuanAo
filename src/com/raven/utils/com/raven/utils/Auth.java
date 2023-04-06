
package com.raven.utils;

import com.raven.model.NhanVien;


public class Auth {
    /**
     * �?ối tượng này chứa thông tin ngư�?i sử dụng sau khi đăng nhập
     */
    public static NhanVien user = null;
    
    /**
     * Xóa thông tin của ngư�?i sử dụng khi có yêu cầu đăng xuất
     */
    public static void clear() {
        Auth.user = null;
    }
    
    /**
     * Kiểm tra xem đăng nhập hay chưa
     */
    public static boolean isLogin() {
        return Auth.user != null;
    }
    
     /**
     * Kiểm tra xem có phải là trưởng phòng hay không
     */
    public static boolean isManager() {
        return Auth.isLogin() && user.getVaiTro();
    }
}
