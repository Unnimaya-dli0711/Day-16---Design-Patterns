package org.example;

import java.util.HashMap;

class Singleton {
    static Singleton instance;
    static HashMap<Integer,String> hashMap;
    public void setValue(int key,String value){
        hashMap.put(key,value);
    }
    public void getValue(int key){
        System.out.println(hashMap.get(key));
    }
    private Singleton(){
        hashMap=new HashMap<>();
    }
    static synchronized Singleton getInstance(){
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        Singleton singleton1=new Singleton();
        Singleton singleton2=new Singleton();
        singleton1.setValue(1,"unnimaya");
        singleton1.setValue(1,"sandra");
        singleton2.getValue(1);
    }
}

