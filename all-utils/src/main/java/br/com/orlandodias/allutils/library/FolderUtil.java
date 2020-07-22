package br.com.orlandodias.allutils.library;

import java.io.File;

public class FolderUtil {

	public static void createFolder(String folderName) {
		try {
			File myFolder = new File(folderName);
			if (!myFolder.exists()) {
				myFolder.mkdir();
			}
		} catch (SecurityException se) {
			System.out.println("-->FileUtil. createFolder. se:" + se.getMessage());
		}
	}

	public static void removeFolder(String folderName) {
		try {
			File myFolder = new File(folderName);
			if (myFolder.exists()) {
				myFolder.delete();
			}
		} catch (SecurityException se) {
			
		}
	}
}