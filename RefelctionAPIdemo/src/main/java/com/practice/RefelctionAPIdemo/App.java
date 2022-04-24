package com.practice.RefelctionAPIdemo;

//import com.practice.RefelctionAPIdemo.beans;

import java.lang.reflect.Field;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
        Class<?> clz = Class.forName("com.practice.RefelctionAPIdemo.beans.Car");
        Field engField= clz.getDeclaredField("carEngineMilege");
        engField.setAccessible(true);
        Object object=clz.newInstance();
		engField.set(object,55);
		System.out.println(object);       
    	
    }
}
