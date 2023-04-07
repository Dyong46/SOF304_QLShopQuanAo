package com.raven.utils;

import com.raven.model.NhanVien;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.swing.ImageIcon;

public class XShare {

    /**
     * Ảnh biểu tượng của ứng dụng, xuất hiện trên m�?i cửa sổ
     */
    public static final Image APP_ICON;

    static {
        // Tải biểu tượng ứng dụng
        String file = "src\\com\\raven\\icon\\logoIcon.png";
        APP_ICON = new ImageIcon(file).getImage();
    }

    /**
     * Sao chép file logo chuyên đ�? vào thư mục logo
     *
     * @param file là đối tượng file ảnh
     * @return chép được hay không
     */
    public static boolean saveLogo(File file) {
        File dir = new File("logos");
        // Tạo thư mục nếu chưa tồn tại
        if (!dir.exists()) {
            dir.mkdirs();
        }
        File newFile = new File(dir, file.getName());
        try {
            // Copy vào thư mục logos (đè nếu đã tồn tại)
            Path source = Paths.get(file.getAbsolutePath());
            Path destination = Paths.get(newFile.getAbsolutePath());
            Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (IOException ex) {
            return false;
        }
    }

    /**
     * �?�?c hình ảnh logo chuyên đ�?
     *
     * @param fileName là tên file logo
     * @return ảnh đ�?c được
     */
    public static ImageIcon readLogo(String fileName) {
        File path = new File("logos", fileName);
        return new ImageIcon(path.getAbsolutePath());
    }

    /**
     * �?ối tượng này chứa thông tin ngư�?i sử dụng sau khi đăng nhập
     */
    public static NhanVien USER = null;

    /**
     * Xóa thông tin của ngư�?i sử dụng khi có yêu cầu đăng xuất
     */
    public static void logoff() {
        XShare.USER = null;
    }

    /**
     * Kiểm tra xem đăng nhập hay chưa
     *
     * @return đăng nhập hay chưa
     */
    public static boolean authenticated() {
        return XShare.USER != null;
    }
    
    /**
     * 
     * @return 
     */
    public static boolean isManager() {
        return XShare.USER.getVaiTro();
    }

}
