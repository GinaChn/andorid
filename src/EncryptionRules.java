/*
 * Copyright (c) 2016 Gina, All rights reserved.
 */

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gina on 16/4/27.
 */
public class EncryptionRules {

    private static List<String > filesNeedToEncrypt;
    public void init()
    {
         filesNeedToEncrypt=new ArrayList();
         filesNeedToEncrypt.add("file_log.txt");
        //如果更多的文件需要解密,直接在下边添加    filesNeedToEncrypt.add("文件名"); 就可以了
    }


    public static boolean isFileNeedToDecrypt(File file)
    {
       return filesNeedToEncrypt.contains(file.getName());

    }
}
