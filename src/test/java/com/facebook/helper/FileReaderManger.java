package com.facebook.helper;

import java.io.IOException;

public class FileReaderManger {

  private FileReaderManger() {
   }
    public static FileReaderManger getInstance() {
    	FileReaderManger frm = new FileReaderManger();
    	return frm;
    	
    }

  public ConfigurationReader getCrlnstance() throws IOException {
	    ConfigurationReader cr=new ConfigurationReader();
	     return cr;
	     
  }

