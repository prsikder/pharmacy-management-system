/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;
import java.io.File;
import javax.swing.JOptionPane;
import proj.PharmacyUtils;

/**
 *
 * @author Asus
 */
public class OpenPdf {
    public static void openById(String id) {
        try {
            File file = new File(PharmacyUtils.billPath + id + ".pdf");
            if (file.exists()) {
                Process p = Runtime.getRuntime()
                                  .exec("rundll32 url.dll,FileProtocolHandler " + file.getAbsolutePath());
            } else {
                JOptionPane.showMessageDialog(null, "File does not exist.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
}
