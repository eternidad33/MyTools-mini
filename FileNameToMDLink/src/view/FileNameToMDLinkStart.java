package view;

import controller.FileUtil;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

/**
 * 项目名 MyTools-mini
 * <br>包名 view
 * <br>创建时间 2020/4/1 11:41
 * <br>描述
 *
 * @author Vigilr
 */
public class FileNameToMDLinkStart {
    private JTextArea textArea;
    private JTextField textfield;
    private JPanel panel1;
    private JButton button1;


    public FileNameToMDLinkStart() {
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String filePath = textfield.getText();
                File file = new File(filePath);
                if (!file.isDirectory()) {
                    textArea.setText("文件路径不正确，请重新输入文件夹路径！");
                } else {
                    textArea.setText("运行成功!\n"+ FileUtil.getStringBuffer(filePath));
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("FileNameToMDLinkStart");
        frame.setContentPane(new FileNameToMDLinkStart().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
