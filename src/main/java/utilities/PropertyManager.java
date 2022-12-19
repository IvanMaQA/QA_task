package utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertyManager {
    private static String goodEmail, goodPassword;
    private static String configFilePath = "src/main/resources/configuration.properties";
    private static PropertyManager instance;

    public static PropertyManager getInstance() {
        if(instance == null) {
            instance = new PropertyManager();
            instance.loadData();
        }
        return instance;
    }
    private void loadData(){
        Properties properties = new Properties();
        try {
            FileInputStream fi = new FileInputStream(configFilePath);
            properties.load(fi);
        } catch (Exception e){
            e.printStackTrace();
        }
        goodEmail = properties.getProperty("goodEmail");
        goodPassword = properties.getProperty("goodPassword");
    }

    public static void changeProperty(String key, String value){
        Properties editProperties = new Properties();
        try{
            FileInputStream editFi = new FileInputStream(configFilePath);
            editProperties.load(editFi);
            editProperties.setProperty(key, value);
            editProperties.store(new FileOutputStream(configFilePath), null);
        }catch (Exception e){
            e.printStackTrace();
        }
        instance = null;
    }

    public String getGoodEmail() {
        return goodEmail;
    }
    public String getGoodPassword() {
        return goodPassword;
    }

}
