package boot;

import java.util.HashMap;
import java.util.List;

public class Printer {
	public static void printSplittedData(List<List<String>> data)
	{
		System.out.println("Files number: "  + data.size());
		data.forEach((l)->{
			System.out.println("------- list -----------");
			l.forEach((fl)->{
				System.out.println(fl);
			});
		});
	}
	public static void printFileMap(HashMap<String,Integer> file)
	{
		file.forEach((k,v)->{
			System.out.println("[key]: " + k + " [value]: " + v);
		});
	}
}
