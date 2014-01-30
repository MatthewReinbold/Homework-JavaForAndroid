package com.marakana.examples;


// will not compile - compiler says since MsgTypeImplementationExtended is public class, should be in java file named 'MsgTypeImplementationExtended'
public class MsgTypeImplementationExtended extends MsgTypeImplementation {
	@Override
	public String getMsgType() {
		return "MsgTypeImplementationExtended";
	}

	// here we Overload the getMsg() method so we now have an
	// additional method that adds something to the getMsg() string
	public String getMsg(String pre) {
		return pre+" "+getMsg();
	}

	// and again we overload the getMsg() method, this time with an int
	public String getMsg(int post) {
		return " -- "+post;
	}
}