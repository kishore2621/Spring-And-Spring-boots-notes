package com.inheritannce;

class WhatsappV1
{
	public void sendmsg()
	{
		System.out.println("send text");
	}
}
class WhatsappV2 extends WhatsappV1
{
	public void sendVoicemsg()
	{
		System.out.println("send voice message");
	}
}
class WhatsappV3 extends WhatsappV2
{
	public void viedocall()
	{
		System.out.println("viedo call");
	}
}
 class User 
 {
	 public static void main(String[] args) 
	 {
		 WhatsappV1 w1 =new WhatsappV1();
		 w1.sendmsg();
		 WhatsappV2 w2 =new WhatsappV2();
		 w2.sendmsg();
		 w2.sendVoicemsg();
		 WhatsappV3 w3 = new WhatsappV3();
		 w3.sendmsg();
		 w3.sendVoicemsg();
		 w3.viedocall();
		
	}

}
