package all_scripts;

import org.openqa.selenium.WebDriver;

import main_running_script_streams_ucc.StreamsUCC_Main_Script;
import output_results.Logs;
import streams_ucc_UDF.UDF_All_Methods;
import test_data.Excel_Data;

public class Messages_Load extends UDF_All_Methods{

	public Messages_Load(WebDriver driver)
	{
		super(driver);
		
	}

	public static String sheetpath=StreamsUCC_Main_Script.testdatasheetpath;
	private String Fromusername;
	private static String Tousername;
	private static String Reshareusername;
    public static int a,b,c;
	public void Messages() throws Exception
	{
		try {
			Logs.start_test_case("Text validatipons started at owner end and milli seconds is:"+milliseconds);
			Excel_Data.ExcelFile(sheetpath, "testdata");
			
			for (int i = 10; i <=18; i++) 
			{
				
			String fromuesrname=Excel_Data.getCellData(i, 2);			
			Logs.info("from username taken from Excel is :"+fromuesrname);
			Logs.info("***********************************************************:"+i+"_"+fromuesrname);
//			String Sentusrename=Excel_Data.getCellData(2,2);
//    		String Sentusrename="pavantwo@iosclient";
			String Sentusrename="prakah@security";
			if (i==10) {
				a=393;
				b=433;
			}
			else if(i>1)
			{
				System.out.println("[C value is ] ....:"+c);
				a=c+1;
				b=a+40;
			}
			
    		try {
    			this.second_login(fromuesrname, "abc@1234");
				this.buddyclick(Sentusrename, fromuesrname);
				String Resharetargetusrname=Excel_Data.getCellData(3, 2);
				Reshareusername=Resharetargetusrname;
				for (int j = a; j <=b; j++) 
				{
				//    String loppmesage=messagesent+"_"+fromuesrname+"_"+j;
				    String loppmesage=messagesent+"_"+j;
					if (j==b) 
					{
						c=b;
						System.out.println("[Sending max value]..."+c);
						
					}
					try {
						this.Sentmessage(loppmesage);
				   		this.messageuuid(loppmesage);
						this.like_comment_pin_Reshare(messageuuid, fromuesrname, commentsent+"_"+j, loppmesage, Reshareusername);
						} 
						catch (Exception e) 
						{
						Logs.error("[message load fail at user]..."+fromuesrname+"  and getting error is :"+e);
						this.Screenshort("message load fail_", "Fail");
						}
					
					if (i==18 & j==b ) 
					{
						this.Screenshort("Message loop pass", "pass");
						this.senmail(Sentusrename, b, "balapavan@panterranetworks.com", loppmesage);
					}
				}
				} 
				catch (Exception e)
				{
				Logs.error(".[Message loop fail due to].."+e);
				this.Screenshort("Message loop fail due to", "Fail");
				}	
			}
			
			/*this.perfrom_likeoperation(messageuuid, fromuesrname);// like on message 
			this.perfor_comment(commentsent, messagesent, messageuuid); // Commet on messagesent
			this.perfrom_pin(messageuuid);//               pin on message
			this.Reshare(messagesent, Resharetargetusrname); //Reshare on message	
*/		//	this.buddyclick(Resharetargetusrname, fromuesrname);
		//	this.Resharemessahevalidation(messagesent);
		//	this.Logout();
		} catch (Exception e) {
			Logs.error("text validation failed at owner end due to :"+e);
			this.Logout();
		}
	}
	


}
