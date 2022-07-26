package seleniumBasic;

public class XPathPractice {

	/*
	 Xpath
	 xml path to locate web element
	 
	 1. Absolute xpath
	 2. relative xpath
	 
	1. Absolute xpath
	  Website:- https://demo.guru99.com/test/selenium-xpath.html
	  ex- /html/body/div[3]/div/div/div/div/a/img
	  
	  use- single /
	  
	2. relative xpath
	
	use- double //
	
	format-   //tagName[@attribute='Value']  , //*[@attribute='Value']
	
	Simple format
	 - /img[@src='/logo.png']
 
     contains-
      //tagname[contains(@attribute,'value')]
     
     //a[contains(@class,'dropdown')]
      
      
      Text()
      //tagname[text()='value']       - //b[text()='Testing']
      //tahname[contains(text(),'value')]   -  //h1[contains(text(),'Tutorials')]
       
       
       
       And / Or
       
       Or
       //input[@type='submit' or @name='btnLogin']
        
       AND
       
       //input[@type='reset' and @name='btnReset']
         
        
       starts-with
       //tagname[starts-with(@attribute,'value')
        
        //*[starts-with(@id,'message')]
         
      
      Xpath- Axes
       parent 
       //a[@title='Software Testing']//parent::li
        
        
       Child
       
       (//ul[@id='java_technologies' and @class='menu'])[1]//child::li[1]
       
       
       preceding
       //a[@title='Cucumber Testing']//parent::li//preceding::li[2]
        
        
        following
        //a[@title='Cucumber Testing']//parent::li//following::li[1]
         
         
        Ancestor
         
         //a[@title='Cucumber Testing']//ancestor::ul
       
       
       
        following-sibling
        preceding-sibling
       
       
      
      
      */
	  
	 
	 
}
