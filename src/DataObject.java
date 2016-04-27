/*
 * Copyright (c) 2016 Gina, All rights reserved.
 */

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Gina on 16/4/27.
 */
public class DataObject {
    private Map<String,String> oldFiles=new HashMap();
    private Map<String,String> newFiles=new HashMap();

    public Map<String, String> getOldFiles() {
        return oldFiles;
    }

    public void setOldFiles(Map<String, String> oldFiles) {
        this.oldFiles = oldFiles;
    }

    public Map<String, String> getNewFiles() {
        return newFiles;
    }

    public void setNewFiles(Map<String, String> newFiles) {
        this.newFiles = newFiles;
    }
}
