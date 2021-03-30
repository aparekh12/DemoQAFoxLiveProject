package com.tutorialsninja.automation.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
/*@CucumberOptions(//features={"classpath:FeatureFiles/Register.feature"},
               //  features={"classpath:FeatureFiles/Login.feature"},
		       //  features={"classpath:FeatureFiles/Search.feature"},
		       	  features={"classpath:FeatureFiles/Orders.feature"},
                 glue= {"classpath:com.tutorialsninja.automation.stepdef"},
                 plugin= {"html:target/cucumber_html_report"},
              //   tags= {"@Register","@Four"}
              // 		 tags= {"@Register"} run on all register scenarios
              // 	 tags= {"@Login","@Four"}
              // 	 tags= {"@Login"}
              //       tags ={"@Search","@Two"}   
                     tags ={"@Orders","@One"}   
		          
		          
		)*/

//all feature files runs ne after other
@CucumberOptions(//features={"classpath:FeatureFiles/Register.feature"},
        features={"classpath:FeatureFiles/Register.feature", "classpath:FeatureFiles/Login.feature",
        		"classpath:FeatureFiles/Search.feature","classpath:FeatureFiles/Orders.feature"},
        glue= {"classpath:com.tutorialsninja.automation.stepdef"},
        plugin= {"html:target/cucumber_html_report"}
     //   tags= {"@Register","@Four"}
     // 		 tags= {"@Register"} run on all register scenarios
     // 	 tags= {"@Login","@Four"}
     // 		 tags= {"@Login"}
       
)


public class TestRunner {

}
