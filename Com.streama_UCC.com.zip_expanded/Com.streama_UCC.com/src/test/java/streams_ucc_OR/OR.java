package streams_ucc_OR;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OR
{
   WebDriver driver;
  
 //***** Streams Login and Lodsgout locators ****//
    @FindBy(xpath="//div[@class='productLogo']/img") public WebElement streamslogo;
    @FindBy(id="xusername") protected WebElement username;
	@FindBy(id="password") public WebElement password;
	@FindBy(className="normal-button") public WebElement loginbutton; 
	@FindBy(id="streams_menu_icon_area") public WebElement menubutton; 
	@FindBy(xpath="(//li[@class='actionBarMenuList'])[1]") public WebElement settingspage;
	@FindBy(xpath="//li[@onclick='SH.signOut();']") public WebElement logoutbutton;
	@FindBy(xpath="//div[@class='errorMessageLogin']") public WebElement invalidusername_or_password;
	@FindBy(id="header_userName") public static WebElement loginusername;
	@FindBy(id="status_msg") public WebElement statusbar;
	@FindBy(id="cstatus_new") public WebElement EnterStatus;
    @FindBy(xpath="//div[@id='status_msg' and @statmsgid='1']") public WebElement statusbardesktop;
    @FindBy(xpath="//li[1]/span[2]") public WebElement ondesktop;
	
//**** Streams Recents locators ****//
   // @FindBy(id="spaneltab_2") public WebElement RecentsButton;
    @FindBy(xpath="//a[@class='chatFilter']") public WebElement ChatFilter;
    @FindBy(xpath="//a[@id='spaneltabanc_2']") public WebElement RecentsButton;
	@FindBy(id="search_recents") public WebElement  recents_searchbar;
	@FindBy(xpath="//a[@id='spaneltabanc_1']") public WebElement contacts_tabbutton; 
	@FindBy(id="search_contacts") public WebElement searchbar_contcatstab;
	@FindBy(xpath="//span[@id='main_user_img']/img") public WebElement UserProfilePic;
	
//********* Middel chat panel locators ******************************************
	@FindBy(id="middle_rpopt") protected WebElement streamdetailedpanel_middlechat;
	@FindBy(id="pin_panel") protected WebElement Pinneditemsbar_rightsidepanel;
	@FindBy(id="pin_cnt") protected WebElement pincount_rightsidepanel;
	@FindBy(xpath="//div[@id='pin_panel']/div[@class='rightHeadBar']") protected WebElement pinneditemsbar;
	@FindBy(xpath="//textarea[@rows='1']") protected WebElement typemessagefield;
	@FindBy(id="middle_sendicon") protected WebElement messagesentclickbuton;
	@FindBy(id="send_icon") protected WebElement commentsentclick;
	@FindBy(id="tb_rshare_pp") protected WebElement Reshareusernaemsentfield;
	@FindBy(xpath="//div[@id='rsharpp_but']/input[@value='Re-Share'][1]") protected WebElement rehare_click;
	
	//------------------Upload locators --------------------------------------------
	
	@FindBy(xpath="//a[@class='chatUpload']") protected WebElement uploadbutton_chatwindow;
	@FindBy(xpath="//div[@class='uploadMenu']/ul/li[1]") protected WebElement Pictures_uploadbutton;
	@FindBy(xpath="//div[@class='uploadMenu']/ul/li[2]")protected WebElement Audio_uploadbutton;
	@FindBy(xpath="//div[@class='uploadMenu']/ul/li[3]") protected WebElement Attachfile_uploadbutton;
	@FindBy(xpath="//input[@value='Upload']") protected WebElement uploadbutton_uploadpopup_window;
	@FindBy(xpath="//div[@class='uploadBarMain']/span[@class='uploadFilename']") protected  static WebElement uploadingfilename;
	@FindBy(id="upimg_fname") protected WebElement Renamefile_Whileuploading;
	@FindBy(id="fs_addmore") protected WebElement plus_button_uploadpopup;

	
//-------------- TEAM CREATIOON LOCATORS---------------------------------------	
	@FindBy(xpath="//a[@class='addUser']") protected WebElement plussbutton_recents;
	@FindBy(xpath="//div[@id='plusIconpp']/ul/li[1]") protected WebElement Createtam_Button;
	//@FindBy(id="contpp_tname'") protected WebElement enterteamame;
	@FindBy(xpath="//input[@id='contpp_tname']") protected WebElement EnterTeamame;
	@FindBy(id="tb_contpp") protected WebElement Sentsuername_Teamcreation_page;
	//@FindBy(id="contpp_findbtn") protected WebElement findbutton_teamcreationpage;
	@FindBy(xpath="//input[@id='tb_contpp']") protected WebElement Findbutton_Teamcreationpage;
	@FindBy(xpath="//input[@id='contpp_crteam']") protected WebElement Createteam_Click;
	//----------- TEAM ATTRIBUTES -------------------------------//
	@FindBy(id="team_type_1") protected WebElement Displayteam_radiobutton;
	@FindBy(id="team_type_2") protected WebElement privatetamradio_button;
	@FindBy(id="options_2") protected WebElement privatetam_invitetype_dropdown;
	@FindBy(xpath="//input[@value='OK']") protected WebElement empty_specialcharacters_teamname;
	
	
	/*** ULM Branding Logos Locators **********/
	@FindBy(xpath="//input[@value='Login']") public WebElement Loginbuton_IDPULM;
	@FindBy(xpath="//img[contains(@class,'logoAuth')][@align='left']") public WebElement LeftSideLogo;
	@FindBy(xpath="//img[contains(@class,'logoAuthRight')][@align='right']") public WebElement RightSideLogo;
	@FindBy(xpath="//div[@class='introText']/img") public WebElement ULMLOGO_LoginPage;
	@FindBy(xpath="(//div[@class='introText'])[2]") public WebElement ULMKeyFeaturesHeading;
	@FindBy(xpath="//div[@class='login_footer']") public WebElement LoginPageCopyRIghts;
	@FindBy(xpath="//div[@class='footer' and @align='center']") public WebElement ForgotPasswordCopyRight;
	@FindBy(linkText="Forgot Password?") public WebElement ForgotPasswordPage;
	@FindBy(id="username") public WebElement Forgotpasswrodpage_UsernameField;
	@FindBy(linkText="HOME") public WebElement HomeLink_ForgotpasswordPage;
	@FindBy(linkText="Privacy Policy") public WebElement PrivacyPolicy_Link;
	@FindBy(xpath="//img[@alt='Logo' and @class='mobile']") public WebElement BCMLogo_LogoutPage;
	@FindBy(xpath="//img[@alt='Kumo Cloud Solutions, Inc.']") public WebElement KumoLogo_LogoutPage;
	
	
	@FindBy(xpath="//div[@class='productLogo']/img") public WebElement IDPHomePage_Logs;
	@FindBy(xpath="//div[@class='copyrights_footer']") public WebElement IDPHomePage_CopyRights;
	
	//--- ULM Locators ----//
	@FindBy(xpath="//span[@title='Queue Filter']") public WebElement QueueFilter;
	@FindBy(id="ulmq_filter") public WebElement QueueFilterButton;
	@FindBy(xpath="//div[@id='ulm_queues_list']//*[@class='optionHeading']") public WebElement QueueFilterHeadder;
	
	
	
}
