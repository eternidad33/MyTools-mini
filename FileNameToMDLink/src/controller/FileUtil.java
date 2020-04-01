package controller;

import java.io.File;

/**
 * 项目名 MyTools-mini
 * <br>包名 controller
 * <br>创建时间 2020/4/1 11:13
 * <br>描述
 *
 * @author Vigilr
 */
public class FileUtil {

    /**
     * 将单个文件转为Markdown链接
     *
     * @param [file]
     * @return java.lang.String
     */
    public static String toMDLink(File file) {
//        [Java进阶-数组](/articles/Java进阶-数组.ipynb)
        String fileName = file.getName();
        String fileParentName = file.getParentFile().getName();
        return "- [" + fileName.substring(0, fileName.lastIndexOf('.')) + "](/" + fileParentName + '/' + fileName + ")";
    }

    /**
     * 获取转换文件夹中所有文件后的MD链接
     *
     * @param [str]
     * @return java.lang.StringBuffer
     */
    public static StringBuffer getStringBuffer(String str) {
        StringBuffer sb = new StringBuffer();
        File file = new File(str);
        if (file.isDirectory()) {
            File[] results = file.listFiles();
            for (int i = 0; i < results.length; i++) {
                if (results[i].isFile()) {
                    sb.append(toMDLink(results[i])).append('\n');
                }
            }
        }
        return sb;
    }

}
