package com.enze.d2_recursion;

import java.io.File;
import java.io.IOException;

/* C:\Program Files\DNF\大马猴70版本GM工具.exe  */
public class RecursionDemo5 {
    public static void main(String[] args) {
        searchFile(new File("C:/"), "大马猴70版本GM工具.exe");
    }

    /**
     * 搜索某个目录下的全部文件，找到我们想要的文件
     *
     * @param dir      被搜索的原目录
     * @param fileName 想要搜索的文件名称
     */
//    public static void searchFile(File dir, String fileName) {
//        //判断dir是否是目录
//        if (dir != null && dir.isDirectory()) {
//            File[] files = dir.listFiles();
//            if (files != null && files.length > 0) {
//                for (File file : files) {
//                    //判断当前遍历的1级文件对象是文件还是文件夹
//                    if (file.isFile()) {
//                        if (file.getName().contains(fileName)) {
//                            System.out.println("找到了" + file.getAbsolutePath());
//                        }
//                    } else {
//                        searchFile(file, fileName);
//                    }
//                }
//            }
//        } else {
//            System.out.println("对不起，您当前搜索的不是文件夹！");
//        }
//    }
    public static void searchFile(File dir,String fileName){
        // 3、判断dir是否是目录
        if(dir != null && dir.isDirectory()){
            // 可以找了
            // 4、提取当前目录下的一级文件对象
            File[] files = dir.listFiles(); // null  []
            // 5、判断是否存在一级文件对象，存在才可以遍历
            if(files != null && files.length > 0) {
                for (File file : files) {
                    // 6、判断当前遍历的一级文件对象是文件 还是 目录
                    if(file.isFile()){
                        // 7、是不是咱们要找的，是把其路径输出即可
                        if(file.getName().contains(fileName)){
                            System.out.println("找到了：" + file.getAbsolutePath());
                            // 启动它。
                        }
                    }else {
                        // 8、是文件夹，需要继续递归寻找
                        searchFile(file, fileName);
                    }
                }
            }
        }else {
            System.out.println("对不起，当前搜索的位置不是文件夹！");
        }
    }
}
