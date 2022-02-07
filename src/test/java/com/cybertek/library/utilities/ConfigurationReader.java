package com.cybertek.library.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    //we create an object of Properties class coming from JAVA
    //make it private so no one can access it directly
    //make it static because we are gonna use it in static block
    private  static Properties properties = new Properties();


    //static block because it runs once and before anything else
    //our test data should be ready before we start any action
    static {

        //we get the path of properties file
        String path = "configuration.properties";

        try {//all below code in try/catch because FileInputStream throws IOException

            //we create an object of FileInputStream to be able to open the file in JVM memory
            FileInputStream file = new FileInputStream(path);


            //we load the file into properties object
            properties.load(file);

            //we close the file
            file.close();

        }catch (IOException e){

            e.printStackTrace();

            e.getMessage();

        }
    }

    //this is our custom getter method for our private encapsulated variable
    //this method is public because it should be available everywhere
    //static because we should be able to call it thru class name
    //we want String value to be returned from method
    //accepts String arg as key of data
    //and properties.getProperty() method comes from Properties class of Java

    public static String getProperties(String keyWord){

       return properties.getProperty(keyWord);

    }


}
