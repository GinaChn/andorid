/*
 * Copyright (c) 2016 Gina, All rights reserved.
 */
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Gina on 16/4/24.
 */
public class ExplorerEncryptionTest {



    public static void main(String[] args)
    {

        String newPath="document/";
        String oldPath="document_old/";

        Map<String,String> oldFileMap=FileReader.convertFileInfoToMap(oldPath);
        Map<String,String> newFileMap=FileReader.convertFileInfoToMap(newPath);

        if(oldFileMap.size()!=newFileMap.size())
        {
            System.out.println("文件数目不相等!");
        }
        Iterator<String> keys = oldFileMap.keySet().iterator();
        while (keys.hasNext())
        {
            String key = (String) keys.next();
            if(!oldFileMap.get(key).equals(newFileMap.get(key)))
            {
                System.out.println("文件:"+key+"内容不相等");
            }
        }

    }



}
