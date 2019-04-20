package com.rahul.command.cookingqueueserialiszble;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("rawtypes")
public class FileOpeUtil {
	public static List readFile(String path) {
		List list = new ArrayList();
		ObjectInputStream ois = null;
		try {
			File file = new File(path);
			if(file.exists()) {
				ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
				list = (List) ois.readObject();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(null != ois) {
				try {
					ois.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return list;
	}
	
	public static void writeFile(String path, List list) {
		ObjectOutputStream oos = null;
		try {
			File file = new File(path);
			if(file.exists()) {
				file.delete();
			}
			oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
			oos.writeObject(list);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(null != oos) {
				try {
					oos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
}
