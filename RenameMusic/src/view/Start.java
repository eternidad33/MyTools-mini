package view;

import controller.RenameUtil;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;


/**
 * 项目名 MyTools-mini
 * <br>包名 view
 * <br>创建时间 2020/3/30 9:58
 * <br>描述
 *
 * @author Vigilr
 */
public class Start {
    private JTextArea textArea1;
    private JPanel panel1;
    private JButton Button;
    private JTextField textField1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Start");
        frame.setContentPane(new Start().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Start() {
        Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String filePath = textField1.getText();
                File file = new File(filePath);
                if (!file.isDirectory()) {
                    textArea1.setText("文件路径不正确，请重新输入！");
                } else {
                    RenameUtil.renameMusicDirectory(file);
                    String str = RenameUtil.getMusicDirectoryInfo(file);
                    textArea1.setText("修改完成!\n" + str);
                }
            }
        });
    }
}
