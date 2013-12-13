import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import org.apache.commons.io.IOUtils;
import com.google.gson.Gson;

public class RiotAPILaunch {
	public static void main(String[] args)
	{
		String CurrentURL;
		CurrentURL = URLmaker.summoner("na", "AisforCynics", "Hidden Key Here");
		Gson gson = new Gson();
		String pageContents;
		
		try {
			pageContents = IOUtils.toString(new URL(CurrentURL));
			System.out.println(pageContents);
			Summoner summoner1 = gson.fromJson(pageContents, Summoner.class);
			System.out.println(summoner1.name);
			System.out.println(summoner1.id);
			System.out.println(summoner1.profileIconId);
			System.out.println(summoner1.revisionDateStr);
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		
		
	}
}
