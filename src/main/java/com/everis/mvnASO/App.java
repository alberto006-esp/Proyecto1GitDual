package com.everis.mvnASO;

import org.apache.commons.lang3.StringUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	if(StringUtils.isBlank(" ")) {
        System.out.println( "Hello World!" );
    	}else {
    		System.out.println("Bye");
    	}
    }
}
