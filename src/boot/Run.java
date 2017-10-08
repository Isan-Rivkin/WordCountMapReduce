package boot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;

import io.CSV;
import map.IMap;
import map.Mapper;
import reduce.IReduce;
import reduce.Reducer;
import split.ISplit;
import split.Splitter;
import wordCounter.ICounter;
import wordCounter.WordCounter;

public class Run
{

	public static void main(String[] args) throws InterruptedException, ExecutionException 
	{
		
		CSV csv = new CSV();
		String path = "D:\\EclipsseWS\\Mapreduce\\src\\boot\\test.txt";
		List<String> data = csv.getCSV(path);
		int files_num = 2;
		ICounter wordCounter = new WordCounter();
		HashMap<String, Integer> dic = wordCounter.executeCountWords(data, files_num);
		Printer.printFileMap(dic);
//		ISplit splitter = new Splitter();
//		IMap mapper = new Mapper();
//		IReduce reducer = new Reducer();
//		CSV csv = new CSV();
//		String path = "D:\\EclipsseWS\\Mapreduce\\src\\boot\\test.txt";
//		List<String> data = csv.getCSV(path);
//		int files_num = 2;
//		List<List<String>> splited  = splitter.split(data, files_num);
//		//Printer.printSplittedData(splited);
//		List<HashMap<String,Integer>> hashed = new ArrayList<>();
//		splited.forEach((f)->{
//			hashed.add(mapper.map(f));
//		});
//		reducer.addFiles(hashed);
//		HashMap<String,Integer> reduced = reducer.reduce();
//		Printer.printFileMap(reduced);

//		ExecutorService pool = Executors.newFixedThreadPool(2);
//		Future<String> f= pool.submit(new Callable<String>() {
//			private String name="Isan";
//			@Override
//			public String call() throws Exception {
//				Thread.sleep(1);
//				return name+" Rivkin";
//			}
//			
//		});
//		String result = f.get();
//		System.out.println(result);
//		
//		CompletableFuture.supplyAsync(()->{
//			return "split ";
//		}).thenApply((s)->{return s+" Map";})
//		  .thenApply((s)->{return s+" Reduce";})
//		  .thenAccept((s)->{System.out.println(s+" combine");});
	}

}





