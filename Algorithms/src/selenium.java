public class selenium {
    
    /*
     * The locators in selenium are
     * ID, CLASSNAME, XPATH, CSS, NAME, TAG NAME, LINK TEXT, PARTIAL LINK TEXT
     * To construct Xpath should follow the syntax //TagName[@attribute='value']
     * Look at the HTML Syntax <input type ="Text" placeholder="Username" value="">
     * The xpath for above should be //input[@placeholder="Username"] or //input[@type="Text"][2] indexing
     * Xpaths can be identified from parent to child as well, //parent/child/child[index]
     * Xpath contains key word //Tagname[@attribute='value'][contains(.,'text')]//value
     * //div[@class="inventory_item"][contains(.,"Sauce Labs Backpack")][class="inventory_item_price"]
     * //Identify Xpath based on text-> //TagName[text()='Text']->//button[text()='Log Out'] or //*[text()=''] is optional
     * //Siblings Xpath->//header/div/button[1]/following-sibling::button[1]
     * Return to parent Xpath-> //header/div/button/parent::div
     * //button[contains(@class,'submit')]
     * 
     * //div[@class='cart_item_label']/a/div
     * //div[@class='cart_item_label']/star/div
     * //div[@class='cart_item_label']//div[@class='inventory_item_name']
     * //div[a/div[@class='inventory_item_name']]
     * 3 types of xpath, absolute, relative and exact
     * //ul/li[1]
     * //button[text()='submit']
     * //button[.='submit']
     * //button[contains(text(),'submit')]
     * //button[starts-with(text(),'submit')]
     * //div[@class='inventory_item_name'][text()='Sauce Labs Backpack']
     * //a[.='Sauce Labs Backpack']
     * //div[@class='inventory_item_price'][.='$29.99']
     * //div[@class='cart_item_label']//div[@class='inventory_item_name']
     * //div[@class='cart_item']/div[2]
     * (//div[@class='cart_item'])[2]
     * //li[contains(@class,'a-carousel-card')]//span[2]
     * 
     * 
     * 
     * CSS TagName.ClassName
     * input[@placeholder="password"] or index input[@placeholder="password"]:nth-child(2)
     * Regular expression css input[type*='value'] or input[type='value'][type='value']
     * CSS-> button[type^='value'] starts with, end with button[type$=], or button[type*='value'] contains text 
     * Underneath #shoppingCart > span, or #shoppingCart span
     * 
     * driver.manage().window().maximize()
     * 
     * What is the page object model used when creating tests?
     * Page Object Model, Page Factory
     * 
     * Page Object Model a design pattern in Selenium that 
     * creates an Object repository for storing all web elements
     * 
     * How are reusable utilities handled within framework?
     * By inheriting that class into other classes
     * Where did you use inheritance OOPS Concept in your framework?
     * There are some reusable classes and we don't want to create object for each class
     * How do you drive the data from external files in the framework?
     * By using Json files to parse the data, with TestNG data provider, with a dependency Jackson data Bind
     * Do you use interfaces into your framework?
     * TestNG Listeners, WebDriver is another interface
     * How to achive encapsulation in the framwork?
     * By hidding the test data or implementation details and just exposing it's use
     * 
     * Does your framework supports parallel run? How does it supports thread safe?
     * With help of testNG xml, setting suit tests parallel
     * Do you have static key words in your framework?
     * Basically if you keep your driver static, is not possible to achive parallel testing
     * How do handle flaky tests in the framework?
     * Implement retry testNG analyzer interface to retry tests failed
     * Does your framework take screenshot on test failures? How did you implement it?
     * TestNG listeners
     * Explain framework architecture
     * 
     * beforeTest annotation in testNG will run before any test annotation, whereas beforeMethod will run 
     * beforeMethod annotation whereas beforeClass will run beforeClass annotation and beforeSuite the scope 
     * is suit level will execute beforeSuite testNG.xml file
     * In testNG we can set groups attribute to test, example @test(groups={"ErrorValidations"}) and in testNG
     * xml file we can create a tag <groups/> inside this tag another tag <run/> to run specifically the groups
     * we trying to run like <include name="ErrorHandling"/>
     * One of the ways to execute paralel run in testNG xml in the <Suite/> level tag add paralel="tests"
     * In the BeforeMethod and AfterMethod in order to pick the group level tag we add attributes Before(alwaysRun=True)
     * DataProvider annotation will allow us to run our tests with multiple data sets. I can be done with an array of objects
     * or with HashMap or Json format. Code snippet examples:
     *   @DataProvider
         public Object [][] getData(){
         HashMap<String, String> map = new HashMap<>();
         map.put("email","lisandrofernando@demo.com");
         map.put("password","Lisandro100@");
         map.put("product","ZARA COAT 3");
         map.put("country","india");
         return new Object [] [] {{map}};
        }
     *   @DataProvider
         public Object [][] getData(){
         return new Object [] [] {{"@email.com","password","product"}};
        }
     * 
     * List out a few authentication techniques used by API?
     * Session cookie based authentication, Basic Authentication, Digest Authentication, Oauth 
     * 
     * What exactly needs to verify in API testing?
     * 1. The accuracy of the data
     * 2. HTTP Status code
     * 3. Response time
     * 4. Authorization would be checked
     * 5. Non functional testing like perfomance testing, security testing
     * 6. Error codes
     * 
     * What protocol is used by the Restful web services?
     * Restful Web services use HTTP protocol. They use HTTP protocol as medium of communication between 
     * the client and the server
     * 
     * What are Soap Services?
     * SOAP stand for Simple Object Access Protocol. It is an XML based message protocol. It helps in exchancing 
     * information among computers.
     * 
     * How do we represent a resource in Rest?
     * Using HTTP Methods
     * 
     * List out a few common Json Parsing Techniques used in Rest Assured Automation?
     * Json Path, Deserialization of Json using POJO Classes, Gson library
     * 
     * How would you send attachements to API using Rest Assured Test?
     * Using MultiPart Method
     * 
     * Hadoop is an open source framework used to store and process large datasets across distributed
     * computing systems. It is designed to handle big data efficiently by distributing tasks 
     * accross multiple machines. Key features of Hadoop:
     * 1. HDFS(Hadoop distributed file system)
     * 2. MapReduce
     * 3. Scalability
     * 4. Fault tolerance
     * 
     * Hive is a data warehouse built on top of Hadoop. It provides a way to query and manage data
     * in Hadoop using a language similar to SQL, called HiveQL. Key features of Hive:
     * 1. SQL-like queries
     * 2. Integration with Hadoop
     * 3. Schema on Read
     * 4. Data analysis
     * 
     *  Hadoop: Focuses on storing and processing data programmatically (e.g., using Java or Python).
        Hive: Simplifies querying and managing data stored in Hadoop with a SQL-like interface.

        To intgrate Hadoop with java add Hadoop library in java maven project hadoop-common
        Can be used the FileSystem class in the Hadoop API to interact with HDFS. Intantiate Configuration()
        To interact with Hive using Java, you need the Hive JDBC driver. Add the dependency to your pom.xml.hive-jdbc
        Connection connection = DriverManager.getConnection(url, user, password);
        Statement statement = connection.createStatement();

        // Execute a query
        String query = "SELECT * FROM your_table LIMIT 10";
        ResultSet resultSet = statement.executeQuery(query);
     */

}
