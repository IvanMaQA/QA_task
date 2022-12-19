package dataGenerator;

import org.testng.annotations.DataProvider;

public class DataProviders {

    @DataProvider(name = "failedLogin")
    public Object [] [] getDataFromDataProvider(){
        return new Object[][]
                {
                        {"", DataCreation.generatePassword(),"Email can't be blank."},
                        {DataCreation.generateEmail(), DataCreation.generatePassword(),"Email address is invalid."}

                };
    }
}
