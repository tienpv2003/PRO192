/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slot_13;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 *
 * @author PhạmVinhTiến
 */
class Slot_13 {

    public static void main(String[] args[]) throws IOException {
        File f = new File("f1.txt");
        System.out.println("Ten file là: " + f.getName());
        System.out.println("Tên file tuyệt đối là : " + f.getAbsoluteFile());
        System.out.println("Đường dẫn tuyệt đối là: " + f.getAbsolutePath());
        System.out.println("Path chuẩn là: " + f.getCanonicalPath());
        System.out.println("Ngày câpj nhật cuối cùng là: " + new Date(f.lastModified()));
        System.out.println("Thuộc tính Hidden là: " + f.isHidden());
        System.out.println("Thuộc tính can-read : " + f.canRead());
        System.out.println("Thuộc tính can-write: " + f.canWrite());
        System.out.println("Kich thước: " + f.length() + " bytes");

    }

}
