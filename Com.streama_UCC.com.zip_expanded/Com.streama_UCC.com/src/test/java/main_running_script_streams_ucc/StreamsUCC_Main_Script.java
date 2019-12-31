package main_running_script_streams_ucc;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

import org.apache.xpath.operations.Quo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.seleniumhq.jetty9.util.log.Log;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.model.ITest;

import all_scripts.All_Actionsat_Ownserend;
import all_scripts.Alll_Actions_Receiverend;
import all_scripts.Audio_file_middlechatpanel;
import all_scripts.Colleguge_photos;
import all_scripts.IndependentULMLogin;
import all_scripts.Login_testcase;
import all_scripts.Status_Validation;
import all_scripts.Streams_UCC_Attachments;
import all_scripts.Streams_Ucc_sentmessage;
import all_scripts.Team_Creations;
import all_scripts.TextFile_Middelchat;
import output_results.Extend_Reports;
import output_results.Logs;
import output_results.MyTest_Listner;
import streams_ucc_UDF.UDF_All_Methods;
import streams_ucc_page.Page;
import test_data.Constants;

public class StreamsUCC_Main_Script extends MyTest_Listner {

//	public static WebDriver driver;
	
	public static String testdatasheetpath;
//	public static String Enterpriseuserid;
//	public static String Shredoutuserforlock;
	private static double Scriptsstardingtime;
	private static double Scriptsendingtime;
	public  static ExtentTest logger;
	public static String strNetwork;
	
	 @Test(priority=0)
	  public void login_streams() throws Exception
	  {
		 // Logs.report=new ExtentReports("E:\\Results\\Smartbox_output"+UDF_All_Methods.datesent()+".html",false);
		 // Logs.reports.startTest("login_streams");
		// UDF_All_Methods.report=new ExtentReports("E:\\Selenium\\Scripts\\Streams_Ucc_Reports.html", false);
		  Login_testcase l=new Login_testcase(driver);
		
		  l.login();
	  }
	
	@Test(priority=1)
	public void Message_validations() throws Exception
	{
		Streams_Ucc_sentmessage msg=new Streams_Ucc_sentmessage(driver);
		msg.textvalidations_at_Owner();
		msg.Textvalidation_Receiver();
	}
	
	@Test(priority=2)
	public void Photo_Attachment_validation() throws Exception
	{
		Streams_UCC_Attachments photo=new Streams_UCC_Attachments(driver);
		photo.Singlephoto_Actions_Ownerend();
		photo.Singlephoto_Receiver_Actions();
	}
	@Test(priority=3)
	public void Textfile_Validations() throws Exception
	{
		TextFile_Middelchat txt=new TextFile_Middelchat(driver);
		txt.textfilevalidations_Owner_end();
		txt.Textfilevalidation_Receiverend();
	}

	@Test(priority=4)
	public void Audiofile_validations() throws Exception
	{
		Audio_file_middlechatpanel audio=new Audio_file_middlechatpanel(driver);
		audio.Audiofilevalidations_Owner_end();
		audio.Audiofilevalidation_Receiverend();
	}
	
	@Test(priority=5)
	public void Collegeof_photos_validatoions() throws Exception
	{
		Colleguge_photos co=new Colleguge_photos(driver);
		co.collegephoto_Actions_Ownerend();
		co.Singlephoto_Receiver_Actions();
	}
	
	@Test(priority=6)
	public void team_Creation() throws Exception
	{
		Team_Creations t=new Team_Creations(driver);
		t.Create_team();
	}
	
	
	@Test(priority=7)
	public void OwnerActions() throws Exception{
		
		All_Actionsat_Ownserend owner= new All_Actionsat_Ownserend(driver);
		owner.OwnerActions();
	}
	
	@Test(priority=8)
	public void ReceiverActions() throws Exception{
		
		Alll_Actions_Receiverend receiver= new Alll_Actions_Receiverend(driver);
		receiver.ReceiverActions();
	}
	
	@Test(priority=9)
	public void StatusValidation() throws Exception
	{
		Status_Validation st=new Status_Validation(driver);
		st.Status();
	}
	
	@Test(priority=9)
	public void IndepedentULM_StreamsBrandings()
	{
		Logs.start_test_case("IndepedentULM_StreamsBrandings");
		driver.manage().deleteAllCookies();
		IndependentULMLogin streams=new IndependentULMLogin(driver);
		streams.IndependentULM_LOGIN_Brnading(0, strNetwork);
		streams.IndependentULM_ForGotPage_Brnading(0, strNetwork);
		streams.IndependentULM_ForGotPageHomeLink_Brnading(0, strNetwork);
		streams.IndepenDenetULM_PrivacyPolicyPage_Branding(0, strNetwork);
		streams.Independent_ULM_HomePage_Branding(0, strNetwork);
		streams.IndependentULM_SignoutPage(0, strNetwork);
	
	}
	
	@Test(priority=10)
	public void IndepedentULM_InpacketBrandings()
	{
		Logs.start_test_case("IndepedentULM_InpacketBrandings");
		driver.manage().deleteAllCookies();
		IndependentULMLogin inpacket=new IndependentULMLogin(driver);
		inpacket.IndependentULM_LOGIN_Brnading(1, strNetwork);
		inpacket.IndependentULM_ForGotPage_Brnading(1, strNetwork);
		inpacket.IndependentULM_ForGotPageHomeLink_Brnading(1, strNetwork);
		inpacket.IndepenDenetULM_PrivacyPolicyPage_Branding(1, strNetwork);
		inpacket.Independent_ULM_HomePage_Branding(1, strNetwork);
		inpacket.IndependentULM_SignoutPage(1, strNetwork);
	
	}
	@Test(priority=11)
	public void IndependentULM_KonnectBranding()
	{
		Logs.start_test_case("IndependentULM_KonnectBranding");
		driver.manage().deleteAllCookies();
		IndependentULMLogin Konnect =new IndependentULMLogin(driver);
		Konnect.IndependentULM_LOGIN_Brnading(2, strNetwork);
		Konnect.IndependentULM_ForGotPage_Brnading(2, strNetwork);
		Konnect.IndependentULM_ForGotPageHomeLink_Brnading(2, strNetwork);
		Konnect.IndepenDenetULM_PrivacyPolicyPage_Branding(2, strNetwork);
		Konnect.Independent_ULM_HomePage_Branding(2, strNetwork);
		Konnect.IndependentULM_SignoutPage(2, strNetwork);
		
	}
	
	@Test(priority=12)
	public void IndependentULM_QuorumTechBranding()
	{
		Logs.start_test_case("IndependentULM_QuorumTechBranding");
//		driver.manage().deleteAllCookies();
		IndependentULMLogin Quorumtech =new IndependentULMLogin(driver);
		Quorumtech.IndependentULM_LOGIN_Brnading(3, strNetwork);
		Quorumtech.IndependentULM_ForGotPage_Brnading(3, strNetwork);
		Quorumtech.IndependentULM_ForGotPageHomeLink_Brnading(3, strNetwork);
		Quorumtech.IndepenDenetULM_PrivacyPolicyPage_Branding(3, strNetwork);
		Quorumtech.Independent_ULM_HomePage_Branding(3, strNetwork);
		Quorumtech.IndependentULM_SignoutPage(3, strNetwork);
	}
	
	
	 @Parameters({"Network","browser"})
	  @BeforeSuite
	  public void beforeSuite(String Network,String browser) 
	  {
		 
		 	
	
		      String AdressBarURL="Empty";  
		      
		      
		      strNetwork=Network;
		      
		  //$$$$$$$$$$$$$$$ BELOW CHROME OPTIONS ARE USER FOR DISABLING THE BAR "THIS CHROME IS CONTROLED BY AUROMATIONS BAR" $$$$$$$$$
		        
//------------TO CAPTURE CONSOLE LOGS FROM CHROME BROWSER -----------------------------//		        
		        //   DesiredCapabilities caps = DesiredCapabilities.chrome();
		   /*     LoggingPreferences logPrefs = new LoggingPreferences();
		        logPrefs.enable(LogType.BROWSER, Level.ALL);
		        caps.setCapability(CapabilityType.LOGGING_PREFS, logPrefs);
		        driver = new ChromeDriver(caps);
		       // driver.manage().window().maximize();
*/		        
//*********************************************ENED FOR CAPTURE CONSOLE LOGS *********//		
		        if(browser.equalsIgnoreCase("gc"))
		        {
		        	  Logs.info("[Chrome driver launch]: Propertie initialized-->"+browser);
		          System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Softwares\\chromedriver.exe");
		          ChromeOptions options = new ChromeOptions();
		         
		          Logs.info("[Chrome driver launch]: Options created");
		      //  String systemname=System.getProperty("user.name");
			//	System.out.println("System user name is : "+systemname);
				  options.addArguments("user-data-dir=C:/Users/QA/AppData/Local/Google/Chrome/User Data/person 8");
				  Logs.info("[Chrome driver launch]: Custom profile launched using chrome options");
		          options.addArguments("disable-infobars");	
		          Logs.info("[Chrome driver launch]: Info headders are disabled using chrome options");
				  options.addArguments("--start-maximized");
				  Logs.info("[Chrome driver launch]: Maximized Chrome using chrome options");
//				  options.addArguments("--start-fullscreen");
			     driver=new ChromeDriver(options);
			     driver.manage().deleteAllCookies();
				Logs.info("[Chrome driver launch]: Chrome initialization done chrome options passed in Chrome driver paramater");
		        }
		        else if(browser.equalsIgnoreCase("ff"))
		        {
		        	Logs.info("browser---Else---------"+browser);
//		        	System.setProperty("webdriver.firefox.marionette","E:\\Selenium\\Softwares\\Jar_Drivers\\GekoDriver\\geckodriver.exe");
//		        	driver = new FirefoxDriver();
		        	
		        	
		        	System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\Softwares\\Jar_Drivers\\GekoDriver\\geckodriver.exe");
		        	driver = new FirefoxDriver();
		    		// ProfilesIni profile = new ProfilesIni();
		    		// FirefoxProfile myprofile = profile.getProfile("default");

		        	/*	FirefoxOptions profile = new FirefoxOptions();
		    		File FileDownloadPath = new File("C:\\Users\\QA\\Downloads\\Automation_Download");
		    		profile.addPreference("browser.helperApps.neverAsk.saveToDisk",
		    				"application/vnd.hzn-3d-crossword;video/3gpp;video/3gpp2;application/vnd.mseq;application/vnd.3m.post-it-notes;application/vnd.3gpp.pic-bw-large;application/vnd.3gpp.pic-bw-small;application/vnd.3gpp.pic-bw-var;application/vnd.3gp2.tcap;application/x-7z-compressed;application/x-abiword;application/x-ace-compressed;application/vnd.americandynamics.acc;application/vnd.acucobol;application/vnd.acucorp;audio/adpcm;application/x-authorware-bin;application/x-athorware-map;application/x-authorware-seg;application/vnd.adobe.air-application-installer-package+zip;application/x-shockwave-flash;application/vnd.adobe.fxp;application/pdf;application/vnd.cups-ppd;application/x-director;applicaion/vnd.adobe.xdp+xml;application/vnd.adobe.xfdf;audio/x-aac;application/vnd.ahead.space;application/vnd.airzip.filesecure.azf;application/vnd.airzip.filesecure.azs;application/vnd.amazon.ebook;application/vnd.amiga.ami;applicatin/andrew-inset;application/vnd.android.package-archive;application/vnd.anser-web-certificate-issue-initiation;application/vnd.anser-web-funds-transfer-initiation;application/vnd.antix.game-component;application/vnd.apple.installe+xml;application/applixware;application/vnd.hhe.lesson-player;application/vnd.aristanetworks.swi;text/x-asm;application/atomcat+xml;application/atomsvc+xml;application/atom+xml;application/pkix-attr-cert;audio/x-aiff;video/x-msvieo;application/vnd.audiograph;image/vnd.dxf;model/vnd.dwf;text/plain-bas;application/x-bcpio;application/octet-stream;image/bmp;application/x-bittorrent;application/vnd.rim.cod;application/vnd.blueice.multipass;application/vnd.bm;application/x-sh;image/prs.btif;application/vnd.businessobjects;application/x-bzip;application/x-bzip2;application/x-csh;text/x-c;application/vnd.chemdraw+xml;text/css;chemical/x-cdx;chemical/x-cml;chemical/x-csml;application/vn.contact.cmsg;application/vnd.claymore;application/vnd.clonk.c4group;image/vnd.dvb.subtitle;application/cdmi-capability;application/cdmi-container;application/cdmi-domain;application/cdmi-object;application/cdmi-queue;applicationvnd.cluetrust.cartomobile-config;application/vnd.cluetrust.cartomobile-config-pkg;image/x-cmu-raster;model/vnd.collada+xml;text/csv;application/mac-compactpro;application/vnd.wap.wmlc;image/cgm;x-conference/x-cooltalk;image/x-cmx;application/vnd.xara;application/vnd.cosmocaller;application/x-cpio;application/vnd.crick.clicker;application/vnd.crick.clicker.keyboard;application/vnd.crick.clicker.palette;application/vnd.crick.clicker.template;application/vn.crick.clicker.wordbank;application/vnd.criticaltools.wbs+xml;application/vnd.rig.cryptonote;chemical/x-cif;chemical/x-cmdf;application/cu-seeme;application/prs.cww;text/vnd.curl;text/vnd.curl.dcurl;text/vnd.curl.mcurl;text/vnd.crl.scurl;application/vnd.curl.car;application/vnd.curl.pcurl;application/vnd.yellowriver-custom-menu;application/dssc+der;application/dssc+xml;application/x-debian-package;audio/vnd.dece.audio;image/vnd.dece.graphic;video/vnd.dec.hd;video/vnd.dece.mobile;video/vnd.uvvu.mp4;video/vnd.dece.pd;video/vnd.dece.sd;video/vnd.dece.video;application/x-dvi;application/vnd.fdsn.seed;application/x-dtbook+xml;application/x-dtbresource+xml;application/vnd.dvb.ait;applcation/vnd.dvb.service;audio/vnd.digital-winds;image/vnd.djvu;application/xml-dtd;application/vnd.dolby.mlp;application/x-doom;application/vnd.dpgraph;audio/vnd.dra;application/vnd.dreamfactory;audio/vnd.dts;audio/vnd.dts.hd;imag/vnd.dwg;application/vnd.dynageo;application/ecmascript;application/vnd.ecowin.chart;image/vnd.fujixerox.edmics-mmr;image/vnd.fujixerox.edmics-rlc;application/exi;application/vnd.proteus.magazine;application/epub+zip;message/rfc82;application/vnd.enliven;application/vnd.is-xpr;image/vnd.xiff;application/vnd.xfdl;application/emma+xml;application/vnd.ezpix-album;application/vnd.ezpix-package;image/vnd.fst;video/vnd.fvt;image/vnd.fastbidsheet;application/vn.denovo.fcselayout-link;video/x-f4v;video/x-flv;image/vnd.fpx;image/vnd.net-fpx;text/vnd.fmi.flexstor;video/x-fli;application/vnd.fluxtime.clip;application/vnd.fdf;text/x-fortran;application/vnd.mif;application/vnd.framemaker;imae/x-freehand;application/vnd.fsc.weblaunch;application/vnd.frogans.fnc;application/vnd.frogans.ltf;application/vnd.fujixerox.ddd;application/vnd.fujixerox.docuworks;application/vnd.fujixerox.docuworks.binder;application/vnd.fujitu.oasys;application/vnd.fujitsu.oasys2;application/vnd.fujitsu.oasys3;application/vnd.fujitsu.oasysgp;application/vnd.fujitsu.oasysprs;application/x-futuresplash;application/vnd.fuzzysheet;image/g3fax;application/vnd.gmx;model/vn.gtw;application/vnd.genomatix.tuxedo;application/vnd.geogebra.file;application/vnd.geogebra.tool;model/vnd.gdl;application/vnd.geometry-explorer;application/vnd.geonext;application/vnd.geoplan;application/vnd.geospace;applicatio/x-font-ghostscript;application/x-font-bdf;application/x-gtar;application/x-texinfo;application/x-gnumeric;application/vnd.google-earth.kml+xml;application/vnd.google-earth.kmz;application/vnd.grafeq;image/gif;text/vnd.graphviz;aplication/vnd.groove-account;application/vnd.groove-help;application/vnd.groove-identity-message;application/vnd.groove-injector;application/vnd.groove-tool-message;application/vnd.groove-tool-template;application/vnd.groove-vcar;video/h261;video/h263;video/h264;application/vnd.hp-hpid;application/vnd.hp-hps;application/x-hdf;audio/vnd.rip;application/vnd.hbci;application/vnd.hp-jlyt;application/vnd.hp-pcl;application/vnd.hp-hpgl;application/vnd.yamaha.h-script;application/vnd.yamaha.hv-dic;application/vnd.yamaha.hv-voice;application/vnd.hydrostatix.sof-data;application/hyperstudio;application/vnd.hal+xml;text/html;application/vnd.ibm.rights-management;application/vnd.ibm.securecontainer;text/calendar;application/vnd.iccprofile;image/x-icon;application/vnd.igloader;image/ief;application/vnd.immervision-ivp;application/vnd.immervision-ivu;application/reginfo+xml;text/vnd.in3d.3dml;text/vnd.in3d.spot;mode/iges;application/vnd.intergeo;application/vnd.cinderella;application/vnd.intercon.formnet;application/vnd.isac.fcs;application/ipfix;application/pkix-cert;application/pkixcmp;application/pkix-crl;application/pkix-pkipath;applicaion/vnd.insors.igm;application/vnd.ipunplugged.rcprofile;application/vnd.irepository.package+xml;text/vnd.sun.j2me.app-descriptor;application/java-archive;application/java-vm;application/x-java-jnlp-file;application/java-serializd-object;text/x-java-source,java;application/javascript;application/json;application/vnd.joost.joda-archive;video/jpm;image/jpeg;video/jpeg;application/vnd.kahootz;application/vnd.chipnuts.karaoke-mmd;application/vnd.kde.karbon;aplication/vnd.kde.kchart;application/vnd.kde.kformula;application/vnd.kde.kivio;application/vnd.kde.kontour;application/vnd.kde.kpresenter;application/vnd.kde.kspread;application/vnd.kde.kword;application/vnd.kenameaapp;applicatin/vnd.kidspiration;application/vnd.kinar;application/vnd.kodak-descriptor;application/vnd.las.las+xml;application/x-latex;application/vnd.llamagraphics.life-balance.desktop;application/vnd.llamagraphics.life-balance.exchange+xml;application/vnd.jam;application/vnd.lotus-1-2-3;application/vnd.lotus-approach;application/vnd.lotus-freelance;application/vnd.lotus-notes;application/vnd.lotus-organizer;application/vnd.lotus-screencam;application/vnd.lotus-wordro;audio/vnd.lucent.voice;audio/x-mpegurl;video/x-m4v;application/mac-binhex40;application/vnd.macports.portpkg;application/vnd.osgeo.mapguide.package;application/marc;application/marcxml+xml;application/mxf;application/vnd.wolfrm.player;application/mathematica;application/mathml+xml;application/mbox;application/vnd.medcalcdata;application/mediaservercontrol+xml;application/vnd.mediastation.cdkey;application/vnd.mfer;application/vnd.mfmp;model/mesh;appliation/mads+xml;application/mets+xml;application/mods+xml;application/metalink4+xml;application/vnd.ms-powerpoint.template.macroenabled.12;application/vnd.ms-word.document.macroenabled.12;application/vnd.ms-word.template.macroenabed.12;application/vnd.mcd;application/vnd.micrografx.flo;application/vnd.micrografx.igx;application/vnd.eszigno3+xml;application/x-msaccess;video/x-ms-asf;application/x-msdownload;application/vnd.ms-artgalry;application/vnd.ms-ca-compressed;application/vnd.ms-ims;application/x-ms-application;application/x-msclip;image/vnd.ms-modi;application/vnd.ms-fontobject;application/vnd.ms-excel;application/vnd.ms-excel.addin.macroenabled.12;application/vnd.ms-excelsheet.binary.macroenabled.12;application/vnd.ms-excel.template.macroenabled.12;application/vnd.ms-excel.sheet.macroenabled.12;application/vnd.ms-htmlhelp;application/x-mscardfile;application/vnd.ms-lrm;application/x-msmediaview;aplication/x-msmoney;application/vnd.openxmlformats-officedocument.presentationml.presentation;application/vnd.openxmlformats-officedocument.presentationml.slide;application/vnd.openxmlformats-officedocument.presentationml.slideshw;application/vnd.openxmlformats-officedocument.presentationml.template;application/vnd.openxmlformats-officedocument.spreadsheetml.sheet;application/vnd.openxmlformats-officedocument.spreadsheetml.template;application/vnd.openxmformats-officedocument.wordprocessingml.document;application/vnd.openxmlformats-officedocument.wordprocessingml.template;application/x-msbinder;application/vnd.ms-officetheme;application/onenote;audio/vnd.ms-playready.media.pya;vdeo/vnd.ms-playready.media.pyv;application/vnd.ms-powerpoint;application/vnd.ms-powerpoint.addin.macroenabled.12;application/vnd.ms-powerpoint.slide.macroenabled.12;application/vnd.ms-powerpoint.presentation.macroenabled.12;appliation/vnd.ms-powerpoint.slideshow.macroenabled.12;application/vnd.ms-project;application/x-mspublisher;application/x-msschedule;application/x-silverlight-app;application/vnd.ms-pki.stl;application/vnd.ms-pki.seccat;application/vn.visio;video/x-ms-wm;audio/x-ms-wma;audio/x-ms-wax;video/x-ms-wmx;application/x-ms-wmd;application/vnd.ms-wpl;application/x-ms-wmz;video/x-ms-wmv;video/x-ms-wvx;application/x-msmetafile;application/x-msterminal;application/msword;application/x-mswrite;application/vnd.ms-works;application/x-ms-xbap;application/vnd.ms-xpsdocument;audio/midi;application/vnd.ibm.minipay;application/vnd.ibm.modcap;application/vnd.jcp.javame.midlet-rms;application/vnd.tmobile-ivetv;application/x-mobipocket-ebook;application/vnd.mobius.mbk;application/vnd.mobius.dis;application/vnd.mobius.plc;application/vnd.mobius.mqy;application/vnd.mobius.msl;application/vnd.mobius.txf;application/vnd.mobius.daf;tex/vnd.fly;application/vnd.mophun.certificate;application/vnd.mophun.application;video/mj2;audio/mpeg;video/vnd.mpegurl;video/mpeg;application/mp21;audio/mp4;video/mp4;application/mp4;application/vnd.apple.mpegurl;application/vnd.msician;application/vnd.muvee.style;application/xv+xml;application/vnd.nokia.n-gage.data;application/vnd.nokia.n-gage.symbian.install;application/x-dtbncx+xml;application/x-netcdf;application/vnd.neurolanguage.nlu;application/vnd.na;application/vnd.noblenet-directory;application/vnd.noblenet-sealer;application/vnd.noblenet-web;application/vnd.nokia.radio-preset;application/vnd.nokia.radio-presets;text/n3;application/vnd.novadigm.edm;application/vnd.novadim.edx;application/vnd.novadigm.ext;application/vnd.flographit;audio/vnd.nuera.ecelp4800;audio/vnd.nuera.ecelp7470;audio/vnd.nuera.ecelp9600;application/oda;application/ogg;audio/ogg;video/ogg;application/vnd.oma.dd2+xml;applicatin/vnd.oasis.opendocument.text-web;application/oebps-package+xml;application/vnd.intu.qbo;application/vnd.openofficeorg.extension;application/vnd.yamaha.openscoreformat;audio/webm;video/webm;application/vnd.oasis.opendocument.char;application/vnd.oasis.opendocument.chart-template;application/vnd.oasis.opendocument.database;application/vnd.oasis.opendocument.formula;application/vnd.oasis.opendocument.formula-template;application/vnd.oasis.opendocument.grapics;application/vnd.oasis.opendocument.graphics-template;application/vnd.oasis.opendocument.image;application/vnd.oasis.opendocument.image-template;application/vnd.oasis.opendocument.presentation;application/vnd.oasis.opendocumen.presentation-template;application/vnd.oasis.opendocument.spreadsheet;application/vnd.oasis.opendocument.spreadsheet-template;application/vnd.oasis.opendocument.text;application/vnd.oasis.opendocument.text-master;application/vnd.asis.opendocument.text-template;image/ktx;application/vnd.sun.xml.calc;application/vnd.sun.xml.calc.template;application/vnd.sun.xml.draw;application/vnd.sun.xml.draw.template;application/vnd.sun.xml.impress;application/vnd.sun.xl.impress.template;application/vnd.sun.xml.math;application/vnd.sun.xml.writer;application/vnd.sun.xml.writer.global;application/vnd.sun.xml.writer.template;application/x-font-otf;application/vnd.yamaha.openscoreformat.osfpvg+xml;application/vnd.osgi.dp;application/vnd.palm;text/x-pascal;application/vnd.pawaafile;application/vnd.hp-pclxl;application/vnd.picsel;image/x-pcx;image/vnd.adobe.photoshop;application/pics-rules;image/x-pict;application/x-chat;aplication/pkcs10;application/x-pkcs12;application/pkcs7-mime;application/pkcs7-signature;application/x-pkcs7-certreqresp;application/x-pkcs7-certificates;application/pkcs8;application/vnd.pocketlearn;image/x-portable-anymap;image/-portable-bitmap;application/x-font-pcf;application/font-tdpfr;application/x-chess-pgn;image/x-portable-graymap;image/png;image/x-portable-pixmap;application/pskc+xml;application/vnd.ctc-posml;application/postscript;application/xfont-type1;application/vnd.powerbuilder6;application/pgp-encrypted;application/pgp-signature;application/vnd.previewsystems.box;application/vnd.pvi.ptid1;application/pls+xml;application/vnd.pg.format;application/vnd.pg.osasli;tex/prs.lines.tag;application/x-font-linux-psf;application/vnd.publishare-delta-tree;application/vnd.pmi.widget;application/vnd.quark.quarkxpress;application/vnd.epson.esf;application/vnd.epson.msf;application/vnd.epson.ssf;applicaton/vnd.epson.quickanime;application/vnd.intu.qfx;video/quicktime;application/x-rar-compressed;audio/x-pn-realaudio;audio/x-pn-realaudio-plugin;application/rsd+xml;application/vnd.rn-realmedia;application/vnd.realvnc.bed;applicatin/vnd.recordare.musicxml;application/vnd.recordare.musicxml+xml;application/relax-ng-compact-syntax;application/vnd.data-vision.rdz;application/rdf+xml;application/vnd.cloanto.rp9;application/vnd.jisp;application/rtf;text/richtex;application/vnd.route66.link66+xml;application/rss+xml;application/shf+xml;application/vnd.sailingtracker.track;image/svg+xml;application/vnd.sus-calendar;application/sru+xml;application/set-payment-initiation;application/set-reistration-initiation;application/vnd.sema;application/vnd.semd;application/vnd.semf;application/vnd.seemail;application/x-font-snf;application/scvp-vp-request;application/scvp-vp-response;application/scvp-cv-request;application/svp-cv-response;application/sdp;text/x-setext;video/x-sgi-movie;application/vnd.shana.informed.formdata;application/vnd.shana.informed.formtemplate;application/vnd.shana.informed.interchange;application/vnd.shana.informed.package;application/thraud+xml;application/x-shar;image/x-rgb;application/vnd.epson.salt;application/vnd.accpac.simply.aso;application/vnd.accpac.simply.imp;application/vnd.simtech-mindmapper;application/vnd.commonspace;application/vnd.ymaha.smaf-audio;application/vnd.smaf;application/vnd.yamaha.smaf-phrase;application/vnd.smart.teacher;application/vnd.svd;application/sparql-query;application/sparql-results+xml;application/srgs;application/srgs+xml;application/sml+xml;application/vnd.koan;text/sgml;application/vnd.stardivision.calc;application/vnd.stardivision.draw;application/vnd.stardivision.impress;application/vnd.stardivision.math;application/vnd.stardivision.writer;application/vnd.tardivision.writer-global;application/vnd.stepmania.stepchart;application/x-stuffit;application/x-stuffitx;application/vnd.solent.sdkm+xml;application/vnd.olpc-sugar;audio/basic;application/vnd.wqd;application/vnd.symbian.install;application/smil+xml;application/vnd.syncml+xml;application/vnd.syncml.dm+wbxml;application/vnd.syncml.dm+xml;application/x-sv4cpio;application/x-sv4crc;application/sbml+xml;text/tab-separated-values;image/tiff;application/vnd.to.intent-module-archive;application/x-tar;application/x-tcl;application/x-tex;application/x-tex-tfm;application/tei+xml;text/plain;application/vnd.spotfire.dxp;application/vnd.spotfire.sfs;application/timestamped-data;applicationvnd.trid.tpt;application/vnd.triscape.mxs;text/troff;application/vnd.trueapp;application/x-font-ttf;text/turtle;application/vnd.umajin;application/vnd.uoml+xml;application/vnd.unity;application/vnd.ufdl;text/uri-list;application/nd.uiq.theme;application/x-ustar;text/x-uuencode;text/x-vcalendar;text/x-vcard;application/x-cdlink;application/vnd.vsf;model/vrml;application/vnd.vcx;model/vnd.mts;model/vnd.vtu;application/vnd.visionary;video/vnd.vivo;applicatin/ccxml+xml,;application/voicexml+xml;application/x-wais-source;application/vnd.wap.wbxml;image/vnd.wap.wbmp;audio/x-wav;application/davmount+xml;application/x-font-woff;application/wspolicy+xml;image/webp;application/vnd.webturb;application/widget;application/winhlp;text/vnd.wap.wml;text/vnd.wap.wmlscript;application/vnd.wap.wmlscriptc;application/vnd.wordperfect;application/vnd.wt.stf;application/wsdl+xml;image/x-xbitmap;image/x-xpixmap;image/x-xwindowump;application/x-x509-ca-cert;application/x-xfig;application/xhtml+xml;application/xml;application/xcap-diff+xml;application/xenc+xml;application/patch-ops-error+xml;application/resource-lists+xml;application/rls-services+xml;aplication/resource-lists-diff+xml;application/xslt+xml;application/xop+xml;application/x-xpinstall;application/xspf+xml;application/vnd.mozilla.xul+xml;chemical/x-xyz;text/yaml;application/yang;application/yin+xml;application/vnd.ul;application/zip;application/vnd.handheld-entertainment+xml;application/vnd.zzazz.deck+xml");
		    		profile.addPreference("browser.helperApps.alwaysAsk.force", false);
		    		profile.addPreference("browser.download.manager.showWhenStarting", false);
		    		profile.addPreference("browser.download.folderList", 2);
		    		profile.addPreference("browser.download.dir", FileDownloadPath.getAbsolutePath());
		    		profile.addPreference("browser.download.useDownloadDir", true);
		    		profile.addPreference("pdfjs.disabled", true);
		    		profile.addPreference("media.navigator.permission.disabled", true);

		    		// profile.setPreference("browser.download.dir", DownloadPath);
		    		// profile.setPreference("browser.helperApps.neverAsk.saveToDisk" ,
		    		// "application/octet-stream;application/csv;text/csv;application/vnd.ms-excel;");
		    		// profile.setPreference("browser.helperApps.alwaysAsk.force", false);
		    		// profile.setPreference("browser.download.manager.showWhenStarting",false);
		    		// profile.setPreference("browser.download.folderList", 2);
		    		RemoteWebDriver driver = new FirefoxDriver(profile);*/

		    		driver.manage().window().maximize();
		    		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		        	
		        }
//				options.addArguments("allow-hidden-media-playback");//NOT WORKING FOE ALLOWING MICROPHONE
//	            options.addArguments("use-fake-device-for-media-stream"); //NOT WORKING FOE ALLOWING MICROPHONE
				driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
				driver.manage().deleteAllCookies();
				Logs.info("[Chrome driver launch]: Deleted all the cookies & Launched Successfully");
			    String Starttime =UDF_All_Methods.datesent2();
			    String removespace=Starttime.replace(" ", "");
			    double d=Double.parseDouble(removespace);   //----Converting String to Double
			    Scriptsstardingtime=d;
			    System.out.println("Scripts are running with date and time is:"+UDF_All_Methods.datesent());
			   
				
			    if (Network.contains("dce")) 
			    {
//					driver.get(Constants.streamsproductionurldce);
			    	AdressBarURL=Constants.streamsproductionurldce;
					String dcesheetpath=Constants.sheetpathdce;
					
					testdatasheetpath=dcesheetpath;	
					 Logs.info("****** Scripts started **********"+testdatasheetpath);
				} 
				else if(Network.contains("dcw"))
				{
//					driver.get(Constants.streamsproductionurldcw);
					AdressBarURL=Constants.streamsproductionurldcw;
					 Logs.info("****** Scripts started **********"+testdatasheetpath);
					//String dcwsheetpath=Constants.she;	
				}
				else if(Network.contains("beta"))
				{
//					driver.get(Constants.streamsproductionurlbeta);
					AdressBarURL=Constants.streamsproductionurlbeta;
					String beta1sheetpath=Constants.sheetpathbeta1;
					testdatasheetpath=beta1sheetpath;
					Logs.info("[Login URL]:"+Constants.streamsproductionurlbeta);
				}
				else if(Network.contains("stg"))
				{
					driver.get(Constants.SteramsStagingURL);
					Logs.info("[Login URL]:"+Constants.SteramsStagingURL);
				}
//				else if(Network.equalsIgnoreCase("ulm"))
//				{
//					AdressBarURL=Constants.strIndependentULmBeta_URL;
//				}
			    driver.get(AdressBarURL);
	  }
	  
	  @AfterMethod()
	  public void Endtestcase(ITestResult result) throws Exception
	  {
		    Logs.endTestCase(result.getName());
		    Logs.info("Tottal Number of Test cases =="+UDF_All_Methods.TC_TotalCount+
		    		" No.of Test cases Pass=="+UDF_All_Methods.TC_PassCount+
		    		" No.Of Test cases Faile Count=="+UDF_All_Methods.TC_FailCount);
//		    driver.quit();
	      /*try {
			Robot r = new Robot();        
			  r.keyPress(KeyEvent.VK_CONTROL);
			  r.keyPress(KeyEvent.VK_T);
			  r.keyRelease(KeyEvent.VK_CONTROL);
			  r.keyRelease(KeyEvent.VK_T);
			  
			  Set <String> t=driver.getWindowHandles();
				 System.out.println("No.of windows is:"+t.size());
				 String handle[]=new String[t.size()];
				 int i=0;
				 for(String s:t)
				 {
					 System.out.println(s);
					 handle[i]=s;
					 i++; 
				 }
				if(t.size()>1){
					driver.switchTo().window(handle[1]);
					 driver.get("E:\\Selenium\\Scripts\\com.streams.smartbox.com\\test-output\\Sanity\\Stresams Smartbox.html");
					 System.out.println("  Switched to second window ");
					 Thread.sleep(3000);
					 driver.close();
					 driver.switchTo().window(handle[0]); }
					 else{
						 System.out.println("Single window is opened");
					 }
		} catch (Exception e) {
			Logs.error("unable to open new window duye to unexpected exceprion :"+e);
		}
		  */
		  
	/*	  if (result.getStatus() == result.SUCCESS) 
			{
				//sc.Screenshot("pass "+result.getName());
				String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,"t");
				driver.findElement(By.linkText("urlLink")).sendKeys(selectLinkOpeninNewTab);
			  Logs.endTestCase(result.getName()+"and result is PASSS"+"\n");
			} 
			 else if (result.getStatus() == result.FAILURE) 
			  {
		       //sc.Screenshot("Fail "+result.getName());
				 Logs.endTestCase(result.getName()+"and result is FAIL"+"\n");
			 }
			 else if(result.getStatus() == result.SKIP)
			 {
				 //System.out.println("----Test skipped---"+result.getName());
				 Logs.endTestCase(result.getName()+"and result is SKIP "+"\n");
			 }*/
	  }
	  
	  
	  @AfterSuite()
	  public void kil() throws Exception
	  {
		  try {
//			  UDF_All_Methods signout=new UDF_All_Methods(driver);
//			  Page.logout();
			  //Thread.sleep(3000);
			  System.out.println("Scripts are Ended with date and time is:"+UDF_All_Methods.datesent());
			  driver.quit();
			   String Endtime =UDF_All_Methods.datesent2();
			   String removespace=Endtime.replace(" ", "");
			    double end=Double.parseDouble(removespace);   //----Converting String to Double
			    Scriptsendingtime=end;
			    System.out.println("script ending time is :"+Scriptsendingtime);
			    double OveralScriptstiming=Scriptsendingtime-Scriptsstardingtime;
			  Logs.info("************************* Scripts Ended time is : "+OveralScriptstiming+"**********************************");
		} catch (Exception e) {
		//	driver.quit();	
		} 
		  try {
			Runtime.getRuntime().exec("Taskkill /IM Chromedriver.exe /f");
			Logs.info("[Task kill]... driver kill done");
		} catch (Exception e) {
			Logs.error("[Task kill]... Failed to kill driver");
		}
	  }

	
	
}
