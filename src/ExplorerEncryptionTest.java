/*
 * Copyright (c) 2016 Gina, All rights reserved.
 */
import java.io.File;

/**
 * Created by Gina on 16/4/24.
 */
public class ExplorerEncryptionTest {
    public static void main(String[] args)
    {
        String path="document/";
        File file=new File(path);
        //定义file类型数组
        File[] tempList = file.listFiles();
        System.out.println("该目录下对象个数："+tempList.length);
        for (int i = 0; i < tempList.length; i++) {
            if (tempList[i].isFile()) {
                System.out.println("文     件：" + tempList[i]);

                FileReader.readFileByChars(tempList[i]);
            }
        }

    }

}
