/*
 * Copyright (c) 2016 Gina, All rights reserved.
 */

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Gina on 16/4/24.
 */
public class FileReader {
    public static String readFileByChars(File file) {
        Reader reader = null;
        StringBuffer result = new StringBuffer();
        try {
            // 一次读一个字符
            reader = new InputStreamReader(new FileInputStream(file));
            int tempchar;
            while ((tempchar = reader.read()) != -1) {
                // 对于windows下，\r\n这两个字符在一起时，表示一个换行。
                // 但如果这两个字符分开显示时，会换两次行。
                // 因此，屏蔽掉\r，或者屏蔽\n。否则，将会多出很多空行。
                if (((char) tempchar) != '\r') {
                    result.append(tempchar);
                    ;
                }
            }
            reader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result.toString();
    }

    public static Map<String, String> convertFileInfoToMap(String path) {
        Map<String, String> oldFiles = new HashMap();

        File file = new File(path);
        //定义file类型数组
        File[] tempList = file.listFiles();
        //System.out.println("该目录下对象个数："+tempList.length);
        for (int i = 0; i < tempList.length; i++) {
            if (tempList[i].isFile()) {
                //System.out.println("文     件：" + tempList[i]);
                if (!tempList[i].getName().startsWith(".")) {
                    if (EncryptionRules.isFileNeedToDecrypt(tempList[i])) {
                        oldFiles.put(tempList[i].getName(), FileReader.readFileByChars(AndroidEncryption.decrypt(tempList[i])));
                    } else {
                        oldFiles.put(tempList[i].getName(), FileReader.readFileByChars(tempList[i]));
                    }
                }
            }
        }
        return oldFiles;
    }
}
