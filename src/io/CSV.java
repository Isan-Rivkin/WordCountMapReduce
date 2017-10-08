package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CSV {

	public List<String> getCSV(String path)
	{
		List<String> finalL = new ArrayList<>();
        BufferedReader br;
		try 
		{
			br = new BufferedReader(new InputStreamReader(new FileInputStream(new File(path))));
			String s="";
			while((s=br.readLine())!=null)
			{
				finalL.addAll(Arrays.asList(s.split(",")));
			}
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		return finalL;
	}
}
