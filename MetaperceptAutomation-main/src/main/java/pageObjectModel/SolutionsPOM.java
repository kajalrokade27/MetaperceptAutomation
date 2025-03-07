package pageObjectModel;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SolutionsPOM 
{
  public SolutionsPOM(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
	  
  }
  
  public @FindBy(xpath="//a[@class='headerA'][normalize-space()='solutions']")
  WebElement solutions;
  
  //software engineering
  public @FindBy(xpath="//li[contains(@class,'headerLI has-dropdown')]//ul[@class='submenu']//li//a[normalize-space()='Software Engineering']")
  WebElement softEng;
  
  public @FindBy(xpath="//h1[@class='jsx-643036caf1458463 breadcrumb__title mb-10']")
  WebElement softEngPage;
  
  
  public @FindBy(xpath="//li[contains(@class,'headerLI has-dropdown')]//ul[@class='submenu']//li//a[normalize-space()='Technical Publication']")
  WebElement techPub;
  
  public @FindBy(xpath="//h3[@class=\"jsx-3669263792 mb-0 ps-3\"]")
  List<WebElement> DevElements;
  
  public @FindBy(xpath="(//p[@class='mb-0 pb-20'])[1]")
  WebElement metR;
  
  public @FindBy(xpath="//p[contains(text(),'LearnOL covers EdTech topics such as course conten')]")
  WebElement learnOLData;
  
  public @FindBy(xpath="//p[contains(text(),'Our web application development services include t')]")
  WebElement webApplicationData;
  
  public @FindBy(xpath="//p[contains(text(),'The specialized software development teams at Meta')]")
  WebElement customSoftData;
  
  public @FindBy(xpath="//p[contains(text(),'Metapercept has developed an end-to-end approach t')]")
  WebElement applDevData;
  
  public @FindBy(xpath="//p[contains(text(),'Picking the correct development, testing, and depl')]")
  WebElement platEvalData;
  
  public @FindBy(xpath="//p[contains(text(),'Simplify software operations with streamlined appl')]")
  WebElement applDeployData;
  
  public @FindBy(xpath="//p[contains(text(),'Timely service delivery is pivotal for successful ')]")
  WebElement servDelData;
  
  public @FindBy(xpath="//h3[@class=\"jsx-3503102505 mb-0 ps-3\"]")
  List<WebElement> mServNDocOps;
  
  public @FindBy(xpath="//p[contains(text(),'We develop UI design to create visually appealing ')]")
  WebElement userInterfaceData;
  
  public @FindBy(xpath="//p[contains(text(),'We refactor business logic into services. Enterpri')]")
  WebElement businessLogicData;
  
  public @FindBy(xpath="//div[@id='microservicesSection']//p[contains(@class,'mb-0 pb-20')]")
  WebElement aPIManageData;
  
  public @FindBy(xpath="//p[contains(text(),'The data-driven approach brings details to the res')]")
  WebElement databaseData;
  
  public @FindBy(xpath="//p[contains(text(),'Strategic planning is the guiding compass for all ')]")
  WebElement strtgPlanningData;
  
  public @FindBy(xpath="//p[contains(text(),'We are revolutionizing the technical publication p')]")
  WebElement docManageData;
  
  public @FindBy(xpath="//p[contains(text(),'Empowering teams for efficient collaboration, our ')]")
  WebElement projectCollData;
  
  public @FindBy(xpath="//div[@id='devopsSection']//p[2]")
  WebElement knowledgeManageData;
  
  
  //Technical publication
  public @FindBy(xpath="//p[contains(@class,'jsx-686778646080269d mb-0')]")
  WebElement techPubPage;
  
  public @FindBy(xpath="//h4[@class=\"jsx-1626512939 mb-0 ps-3\"]")
  List<WebElement> leftElements;
  
  public @FindBy(xpath="//p[contains(text(),'A pilot project is always a great way to get start')]")
  WebElement contentAnalysisData;
  
  public @FindBy(xpath="//p[contains(text(),'Topic-based authoring is essential for organizatio')]")
  WebElement topicAuthoringContent;
  
  public @FindBy(xpath="//p[contains(text(),'We excel in translating the element definitions of')]")
  WebElement elementDefContent;
  
  public @FindBy(xpath="//p[contains(text(),'Content reuse plays a significant role in structur')]")
  WebElement contentReuseData;
  
  public @FindBy(xpath="//p[contains(text(),'We help achieve content distribution goals, which ')]")
  WebElement contentAuditData;
  
  public @FindBy(xpath="//p[contains(text(),'We assist our clients in identifying the right con')]")
  WebElement contentManageData;
  
  public @FindBy(xpath="//p[contains(text(),'With DITA and its topic-based approach to authorin')]")
  WebElement contentStructuringData;
  
  public @FindBy(xpath="//p[contains(text(),'Content governance is crucial, demanding a well-ma')]")
  WebElement contentOptData;
  
  public @FindBy(xpath="//h4[@class=\"jsx-1228565795 mb-0 ps-3\"]")
  List<WebElement> rightElements;
  
  public @FindBy(xpath="//p[contains(text(),'We are the leading DITA-XML CMS solutions and serv')]")
  WebElement contentCompData;
  
  public @FindBy(xpath="//p[contains(text(),'Content is crucial for engaging customers, raising')]")
  WebElement contentTuningData;
  
  public @FindBy(xpath="//p[contains(text(),'Transforming content involves repurposing existing')]")
  WebElement contentTransformData;
  
  public @FindBy(xpath="//p[contains(text(),'We at Metapercept develop plugins and authoring so')]")
  WebElement unifiedAuthContent;
  
  public @FindBy(xpath="//p[contains(text(),'Content mapping is a powerful tool for any informa')]")
  WebElement migrAnalData;
  
  public @FindBy(xpath="//div[@id='contentMigrationTypes']//p[contains(@class,'mb-0 pb-10')]")
  WebElement informDistrData;
  
  public @FindBy(xpath="//p[contains(text(),'Any content that is no longer in use or is not ass')]")
  WebElement contentClenData;
  
  public @FindBy(xpath="//p[contains(text(),'Tailoring technical documentation output productio')]")
  WebElement opDistriData;
  
  //Information architecture
  public @FindBy(xpath="//li[contains(@class,'headerLI has-dropdown')]//ul[@class='submenu']//li//a[normalize-space()='Information Architecture']")
  WebElement informArch;
  
  public @FindBy(xpath="//p[@class='mb-0']")
  WebElement informArchPage;
  
 //Staff Augmentation
  public @FindBy(xpath="//li[contains(@class,'headerLI has-dropdown')]//ul[@class='submenu']//li//a[normalize-space()='Staff Augmentation']")
  WebElement staffAug;
  
  public @FindBy(xpath="//p[@class='mb-0']")
  WebElement staffAugPage;
  
  //consulting
  public @FindBy(xpath="//li[contains(@class,'headerLI has-dropdown')]//ul[@class='submenu']//li//a[normalize-space()='Consulting']")
  WebElement consulting;
  
  public @FindBy(xpath="//h1[@class='jsx-643036caf1458463 breadcrumb__title mb-10']")
  WebElement consultingPage;
  
 public @FindBy(xpath="//a[@class=\"tp-white-btn\"]")
 List<WebElement> readMore;
  
  
  
  
  
  
  
  
  
}
