/*
 * Copyright (c) 2016 Gina, All rights reserved.
 */

import java.io.*;

/**
 * Created by Gina on 16/4/24.
 */
public class FileReader {
        public static void readFileByChars(File file) {
        Reader reader = null;
        try {
            // 一次读一个字符
            reader = new InputStreamReader(new FileInputStream(file));
            int tempchar;
            while ((tempchar = reader.read()) != -1) {
                // 对于windows下，\r\n这两个字符在一起时，表示一个换行。
                // 但如果这两个字符分开显示时，会换两次行。
                // 因此，屏蔽掉\r，或者屏蔽\n。否则，将会多出很多空行。
                if (((char) tempchar) != '\r') {
                    System.out.print((char) tempchar
                    );
                }
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
         finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
        }
    }

}
