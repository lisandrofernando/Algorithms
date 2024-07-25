public class selenium {
    
    /*
     * The locators in selenium are
     * ID, CLASSNAME, XPATH, CSS, NAME, TAG NAME, LINK TEXT, PARTIAL LINK TEXT
     * To construct Xpath should follow the syntax //TagName[@attribute='value']
     * Look at the HTML Syntax <input type ="Text" placeholder="Username" value="">
     * The xapth for abobe should be //input[@placeholder="Username"] or //input[@type="Text"][2] indexing
     * Xpaths can be identified from parent to child as well, //parent/child/child[index]
     * Xpath contains key word //Tagname[@attribute='value'][contains(.,'text')]//value
     * //div[@class="inventory_item"][contains(.,"Sauce Labs Backpack")][class="inventory_item_price"]
     * //Identify Xpath based on text-> //TagName[text()='Text']->//button[text()='Log Out'] or //*[text()=''] is optional
     * //Siblings Xpath->//header/div/button[1]/following-sibling::button[1]
     * Return to parent Xpath-> //header/div/button/parent::div
     * //button[contains(@class,'submit')]
     * CSS TagName.ClassName
     * input[@placeholder="password"] or index input[@placeholder="password"]:nth-child(2)
     * Regular expression css input[type*='value'] or input[type='value'][type='value']
     * CSS-> button[type^='value'] starts with, end with button[type$=], or button[type*='value'] contains text 
     * Underneath #shoppingCart > span, or #shoppingCart span
     * 
     * driver.manage().window
     */

}
