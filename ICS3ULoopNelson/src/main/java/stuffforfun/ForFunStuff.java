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
		String isl = "http://www.google.com/search?q=IMDb " + movie + "&num=1";

		System.out.println(" ");
		Document isd = Jsoup.connect(isl).get();
		String iilt = isd.title();
		System.out.println(iilt);
		Elements iresults = isd.select("div.yuRUbf a");
		// System.out.println(results);
		String aimdb = iresults.toString();
		String imdblink = aimdb.substring(9, 46);
		System.out.println(imdblink);

		Document imdbdoc = Jsoup.connect(imdblink).get();

		String imdbtitle = imdbdoc.title();
		System.out.println(imdbtitle);

		Elements ireview = imdbdoc.select("div.ratingValue strong");

		String strtitle = ireview.toString();
		String imdbreview = strtitle.substring(15, 18);
		// System.out.println(strtitle);
		// System.out.println(imdbreview);
		double doubleimdb = Double.valueOf(imdbreview) * 10;
		int finalimdb = (int) doubleimdb;
		System.out.println("IMDb Review: " + finalimdb + "%");
		System.out.println(" ");

		String rtlt = imdbtitle.substring(0, imdbtitle.length() - 14);
		System.out.println(rtlt);
		String rtmovie = rtlt.replace(" ", "_");

		String rtlink = "https://www.rottentomatoes.com/m/" + rtmovie;
		System.out.println(rtlink);

		Document rtdoc = Jsoup.connect(rtlink).get();

		String rttitle = rtdoc.title();
		System.out.println(rttitle);

		Elements rtreview = rtdoc.select("h2.mop-ratings-wrap__score");
		System.out.println(rtreview);

		String h2title = rtreview.toString();
		int tl = 267 + rtmovie.length();
		int tr = 269 + rtmovie.length();
		int bl = 546 + 2 * (rtmovie.length());
		int br = 548 + 2 * (rtmovie.length());
		String rtomatoreview = h2title.substring(tl, tr);
		String rtomatoreview2 = h2title.substring(bl, br);
		// System.out.println(h2title);
		System.out.println(rtomatoreview);
		System.out.println(rtomatoreview2);

		double doublertcrit = Double.valueOf(rtomatoreview);
		int finalrtcrit = (int) doublertcrit;
		double doublertaud = Double.valueOf(rtomatoreview2);
		int finalrtaud = (int) doublertaud;
		System.out.println("Rotten Tomatoes Critic Review: " + finalrtcrit + "%");
		System.out.println("Rotten Tomatoes Audience Review: " + finalrtaud + "%");

	}

}
