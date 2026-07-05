9:00 to 9:40 --->Dropdown
9.40 to 10.10 --->BreakOut+Break
10:10 to 10:40 --->AbsoluteXpath
10:40 to 11:15 ---> BasicXpath
11:15 to 12:00 ---> AdvancedXpath
12:00 to 12:15 --->ImplicitWait

Dropdown: What is a Dropdown?

A dropdown in web development is a user interface element that allows users to select one option from a list of options. In HTML, this is structured with a tag as the parent element and elements as children. Selenium must be able to interact with these elements to test web applications thoroughly. How to Handle Dropdown? Selenium provides a Select class specifically for interacting with dropdown elements. The Select class offers methods to select options within a dropdown easily. When to Use? The Select class should be used when an element in the DOM is identified with a tag, indicating a dropdown menu. Structure in DOM The tag in the DOM represents the dropdown element, and the nested tags represent the individual choices available to the user.

How to Use Select Class? To use the Select class, a Selenium script must first identify the element in the DOM. Then, an instance of the Select class is created by passing the located WebElement as an argument to its constructor. This allows the script to manipulate the dropdown as needed. Helper Methods The Select class provides various methods to select options from a dropdown, such as: selectByIndex(index): Selects an option by its index in the dropdown, starting with 0. selectByVisibleText("text"): Selects an option by the text visible to the user in the dropdown. selectByValue("value"): Selects an option by the value of attribute.

Types of xpath:
1)Absolute xpath-long xpath,if any path is broken leads to a no such element exception,so it si not reliable and rosust
so it is not used in realtime scenarios.
2)Relative xpath:directly finds the element and locate it,it is robust.
 1)Basic xpath:
  a)Attribute BasedXpath://tagName[@attribute='attributeValue']
  eg)//input[@name='USERNAME']
  b)Text basedxpath:syn://tagName[text()='text value']
  eg)//a[text()='Leads']
  c)Partial AttributeBasedXpath:syn://tagName[contains(@attribute,'attributeValue')]
  eg)//input[contains(@class,'Submit')]
  d)Partial textBasedxpath:syn://tagName[contains(text()='patial text value')]
  eg)//a[contains(text(),'SFA')]
  e)collection BasedXpath:
  eg)(//input[@class='inputLogin'])[2]

 2)AdvancedXpath:
  a)Parent to child:
  syn:basic xpath of the parent/child tagname
  eg)//p[@class='top']/input
  b)Grandparent to grandchild:
  syn:basic xpath of the Grandparent/Grandchild tagname
  eg)(//form[@id='login']//input)[1]
  c)child to parent xpath:
  syn:Basic xpath for the child/parent:: tagname of the parent
  eg)//input[@name='PASSWORD']/parent::p
  d)grandchild to grandparent xpath
  syn:Basic xpath for the grandchild/ancestor:: tagname of the ancestor
  eg)//input[@name='PASSWORD']/ancestor::form
  e)elder to younger cosin xpath:
  syn:basic xpath for eldercousin/following::youngercousin tagname
  eg)(//span[text()='Company Name']/following::input)[1]
  f)younger to elder cousinxpath:
   syn:basic xpath for youngercousin/preceding::Eldercousin tagname
   (//input[@name='companyName']/preceding::span)[6]
  g)elder to younger siblingxpath:
  syn:basic xpath for the eldersibling/following-sibling::younger sibling tagname
  eg)//label[text()='Username']/following-sibling::input
  h)younger to elder sibling xpath:
syn:basic xpath for the youngersibling/preceding-sibling::Elder sibling tagname
//input[@id='username']/preceding-sibling::label