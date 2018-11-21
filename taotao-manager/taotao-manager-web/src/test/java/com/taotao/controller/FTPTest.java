package com.taotao.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketException;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.junit.Test;

import com.taotao.common.utils.FtpUtil;

public class FTPTest {

	@Test
	public void testFTPClient() throws Exception{
		//创建一个ftp对象
		FTPClient ftpClient = new FTPClient();
		//创建ftp连接
		ftpClient.connect("192.168.30.3",21);
		//登录ftp服务器
		ftpClient.login("ftpuser", "kangta27");
		//上传文件
		//读取本地文件
		FileInputStream inputStream = new FileInputStream(new File("D:\\document\\images\\24442-20181105150013344-185546354.jpg"));
		ftpClient.enterLocalPassiveMode();
		//设置上传路径
		ftpClient.changeWorkingDirectory("/home/ftpuser/www/images");
		//修改上传文件的格式
		ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
		ftpClient.storeFile("hello.jpg",inputStream);
		//关闭连接
		ftpClient.logout();
		
	}
	
	@Test
	public void testFtpUtil() throws Exception{
		FileInputStream inputStream = new FileInputStream(new File("D:\\document\\images\\Koala.jpg"));
		FtpUtil.uploadFile("192.168.30.3", 21, "ftpuser", "kangta27", "/home/ftpuser/www/images", "/2018/11/07", "koala.jpg", inputStream);
	} 
	
}
