package com.fxz.csvdemo.test;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * 描述：
 *
 * @author Fang
 * @date 2021-03-22 14:38:26
 */
public class CSVTest {

    public static void main(String[] args) throws FileNotFoundException {
//        FileOutputStream fos = new FileOutputStream("D:/Code/testsfsfsf.txt");
//        OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
//        String savePath = "D:/csv/" + "writer" + File.separator;
//        System.out.println(savePath);
        File file = new File("D:/csv/writer/");
        if (!file.exists()) {
            file.mkdirs();
        }
    }

}
