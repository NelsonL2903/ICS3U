package stuffforfun;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class ForFunStuff {

	public static void main(String[] args) throws IOException {

		Document doc = Jsoup.connect("https://www.imdb.com/title/tt2278388/?ref_=nv_sr_srsg_3").get();

		String title = doc.title();
		System.out.println("title: " + title);

		Elements review = doc.select("div.ratingValue strong");

		String strtitle = review.toString();
		String imdbreview = strtitle.substring(15, 18);
		System.out.println(strtitle);
		System.out.println(imdbreview);
		double doubleimdb = Double.valueOf(imdbreview) * 10;
		int finalimdb = (int) doubleimdb;
		System.out.println("IMDB Review: " + finalimdb + "%");

	}

}
