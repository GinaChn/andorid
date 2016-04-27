/*
 * Copyright (c) 2016 Gina, All rights reserved.
 */
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
        EncryptionRules.init();

        Map<String,String> oldFileMap=FileReader.convertFileInfoToMap(oldPath,false);
        Map<String,String> newFileMap=FileReader.convertFileInfoToMap(newPath,true);

        if(oldFileMap.size()!=newFileMap.size())
        {
            System.out.println("文件数目不相等!");
            System.out.println("原文件夹下共有"+oldFileMap.size()+"个文件");
            System.out.println("新文件夹下共有"+newFileMap.size()+"个文件");

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
