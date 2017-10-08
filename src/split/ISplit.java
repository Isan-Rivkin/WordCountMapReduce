package split;

import java.util.List;

public interface ISplit 
{
	public List<List<String>> split(List<String> data, int files);
}
