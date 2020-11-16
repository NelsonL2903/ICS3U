package stuffforfun;

import java.io.IOException;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class ForFunStuff {

	public static void main(String[] args) throws IOException {

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Please input the movie you are searching for");
		String movie = keyboard.nextLine();
		String isl = "http://www.google.com/search?q=imdb " + movie + "&num=1";

		Document isd = Jsoup.connect(isl).get();
		String iilt = isd.title();
		System.out.println(iilt);
		Elements results = isd.select("div.yuRUbf a");
		// System.out.println(results);
		String aimdb = results.toString();
		String imdblink = aimdb.substring(9, 46);
		System.out.println(imdblink);

		Document imdbdoc = Jsoup.connect(imdblink).get();

		String title = imdbdoc.title();
		System.out.println(title);

		Elements review = imdbdoc.select("div.ratingValue strong");

		String strtitle = review.toString();
		String imdbreview = strtitle.substring(15, 18);
		// System.out.println(strtitle);
		// System.out.println(imdbreview);
		double doubleimdb = Double.valueOf(imdbreview) * 10;
		int finalimdb = (int) doubleimdb;
		System.out.println("IMDB Review: " + finalimdb + "%");

	}

}
