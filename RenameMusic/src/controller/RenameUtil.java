package controller;

import java.io.File;

/**
 * 项目名 MyTools-mini
 * <br>包名 control
 * <br>作者 Vigilr
 * <br>创建时间 2020/3/29 22:38
 * <br>描述
 *
 * @author Vigilr
 */
public class RenameUtil {
    /**
     * 返回新的文件名称
     *
     * @param: [oldName]
     * @return: java.lang.String
     */
    public static String getNewName(String oldName) {
        String newName;
        //去掉字符串的所有空格
        newName = oldName.replaceAll(" ", "");
        //分离歌手，歌名，文件后缀
        String[] results = newName.split("-|\\.");
        //连接新的字符串
        if (results.length == 3) {
            newName = results[1] + "-" + results[0] + "." + results[2];
        }
        return newName;
    }

    /**
     * 重命名单个文件
     *
     * @param: [file, fileName]
     * @return: void
     */
    public static void rename(File file, String fileName) {
        //文件类型不是目录
        if (!file.isDirectory()) {
            File newFile = new File(file.getParent(), fileName);
            file.renameTo(newFile);
            System.out.println("修改完成：" + newFile.getName());
        }
    }

    /**
     * 重命名音乐目录下文件
     *
     * @param: [directoryFile]
     * @return: void
     */
    public static void renameMusicDirectory(File directoryFile) {
        if (directoryFile.isDirectory()) {
            File[] results = directoryFile.listFiles();
            for (int i = 0; i < results.length; i++) {
                if (results[i].isFile()) {
                    String newName = getNewName(results[i].getName());
                    System.out.println("修改前的名称：" + results[i].getName());
                    rename(results[i], newName);
                }
            }
        }
    }

    /**
     * 返回文件夹信息
     *
     * @param: [file]
     * @return: java.lang.String
     */
    public static String getMusicDirectoryInfo(File file) {
        StringBuffer musicInfos = new StringBuffer();
        if (file.isDirectory()) {
            File[] results = file.listFiles();
            if (results != null) {
                for (int i = 0; i < results.length; i++) {
                    musicInfos.append(results[i].getName()).append("\n");
                }
            }
        }
        return musicInfos.toString();
    }
}
