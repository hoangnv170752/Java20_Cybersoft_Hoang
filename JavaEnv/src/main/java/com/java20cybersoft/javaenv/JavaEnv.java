package com.java20cybersoft.javaenv;
/**
 *
 * @author hoangpresident
 */
public class JavaEnv {

    public static void main(String[] args) {
        System.out.println("Current JVM version - " + System.getProperty("java.version"));
        System.out.println("Java runtime version - " + Runtime.version());
        System.out.println("Java home - " + System.getProperty("java.home"));
        System.out.println("Java vendor URL - " + System.getProperty("java.vendor"));
        System.out.println("Java class path - " + System.getProperty("java.class.path"));
    }
}
