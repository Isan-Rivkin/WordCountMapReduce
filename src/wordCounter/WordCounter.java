package wordCounter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import map.IMap;
import map.Mapper;
import reduce.IReduce;
import reduce.Reducer;
import split.ISplit;
import split.Splitter;

public class WordCounter implements ICounter 
{
	ISplit splitter = new Splitter();
	IMap mapper = new Mapper();
	IReduce reducer = new Reducer();
	
	@Override
	public HashMap<String, Integer> executeCountWords(List<String> words, int files_num) 
	{
		List<HashMap<String, Integer>> to_reduce = new ArrayList<>();
		split(words, files_num).forEach((splited)->{
			to_reduce.add(map(splited));
		});
		return reduce(to_reduce);
	}

	@Override
	public List<List<String>> split(List<String> data, int files_num) 
	{
		return splitter.split(data, files_num);
	}

	@Override
	public HashMap<String, Integer> map(List<String> file) {
		return mapper.map(file);
	}

	@Override
	public HashMap<String,Integer> reduce(List<HashMap<String, Integer>> files) {
		reducer.addFiles(files);
		return reducer.reduce();
	}

}
