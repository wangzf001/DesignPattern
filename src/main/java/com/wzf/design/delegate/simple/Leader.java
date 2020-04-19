package com.wzf.design.delegate.simple;

import java.util.HashMap;

/**
 * @Author: HERO
 * @Date: 2020/4/6 16:32
 * @Version 1.0
 */
public class Leader implements IEmployee{

    private HashMap<String,IEmployee> targets = new HashMap<String,IEmployee>();

    public Leader(){
        targets.put("架构",new EmployeeA());
        targets.put("前端",new EmployeeB());
    }

    public void doing(String task){
        targets.get(task).doing(task);
    }

}
