package com.fxz.csvdemo.util;

import com.fxz.csvdemo.entity.Employee;
import com.opencsv.CSVWriter;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * 描述：CSV工具类
 *
 * @author Fang
 * @date 2021-03-22 15:34:47
 */
@Service
public class CSVWriterUtils {

    public static void writeCsv(String fileName, Employee employee) {
        String savePath = "D:/csv/writer/";

        try {
            //如果保存路径不存在，则自动创建
            File file = new File(savePath);
            if (!file.exists()) {
                file.mkdirs();
            }
            String filePath = savePath + fileName;
            FileOutputStream fos = new FileOutputStream(filePath);
            OutputStreamWriter out = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
            CSVWriter writer = new CSVWriter(out,CSVWriter.DEFAULT_SEPARATOR, CSVWriter.NO_QUOTE_CHARACTER, CSVWriter.DEFAULT_ESCAPE_CHARACTER, CSVWriter.RFC4180_LINE_END);

            writer.writeAll(getCsvContent(employee));
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static Iterable<String[]> getCsvContent(Employee employee) {
        List<String[]> allElements = new ArrayList<String[]>();
        //头文件
        String[] title = writeTitle();
        allElements.add(title);
        //文件内容
        if (employee != null) {
            String[] content = writeContent(employee);
            allElements.add(content);
        }
        return allElements;
    }

    private static String[] writeContent(Employee employee) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return new String[]{
                employee.getId(),
                employee.getName(),
                String.valueOf(employee.getAge()),
                employee.getDepartment(),
                String.valueOf(employee.getSalary()),
                employee.getCreateBy(),
                sdf.format(employee.getCreateTime()),
                employee.getUpdateBy(),
                sdf.format(employee.getUpdateTime())
        };
    }

    private static String[] writeTitle() {
        return new String[]{
                "id",
                "name",
                "age",
                "department",
                "salary",
                "createBy",
                "createTime",
                "updateBy",
                "updateTime"
        };
    }

}
