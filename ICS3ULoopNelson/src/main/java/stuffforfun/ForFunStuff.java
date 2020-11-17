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

		String h2title = rtreview.toString();
		// System.out.println(h2title);

		String h2titlea = h2title.replaceAll("([a-z])", "");
		String h2titleb = h2titlea.replaceAll("([A-Z])", "");
		String h2titlec = h2titleb.replaceAll("-", "");
		String h2titled = h2titlec.replaceAll("_", "");
		String h2titlee = h2titled.replaceAll("=", "");
		String h2titlef = h2titlee.replaceAll(">", "");
		String h2titleg = h2titlef.replaceAll("<", "");
		String h2titleh = h2titleg.replaceAll("", "");
		String h2titlei = h2titleh.replaceAll("/", "");
		String h2titlej = h2titlei.replaceAll("%", "");
		String h2titlek = h2titlej.replaceAll(" ", "");
		String h2titlem = h2titlek.replaceAll("\"", "");
		// System.out.println(h2titlem);

		String rtcrit = h2titlem.substring(1, 3);
		String rtaud = h2titlem.substring(7, 9);
		System.out.println(rtcrit);
		System.out.println(rtaud);

	}

}
