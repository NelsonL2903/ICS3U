package stuffforfun;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class ForFunStuff {

	public static void main(String[] args) throws IOException {

		Document doc = Jsoup.connect("https://www.imdb.com/title/tt1270797/?ref_=fn_al_tt_1").get();

		String title = doc.title();
		System.out.println("title: " + title);

		Elements review = doc.select("div.ratingValue strong");
		System.out.println(review);

	}

}
