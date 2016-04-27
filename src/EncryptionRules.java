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
    }


    public static boolean isFileNeedToDecrypt(File file)
    {
       return filesNeedToEncrypt.contains(file.getName());

    }
}
