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
		// System.out.println(iilt);
		Elements iresults = isd.select("div.yuRUbf a");
		// System.out.println(iresults);
		String aimdb = iresults.toString();
		String imdblink = aimdb.substring(9, 46);
		// System.out.println(imdblink);

		Document imdbdoc = Jsoup.connect(imdblink).get();

		String imdbtitle = imdbdoc.title();
		System.out.println(imdbtitle.substring(0, imdbtitle.length() - 7));

		Elements ireview = imdbdoc.select("div.ratingValue strong");

		String strtitle = ireview.toString();
		String imdbreview = strtitle.substring(15, 18);
		// System.out.println(strtitle);
		// System.out.println(imdbreview);
		double doubleimdb = Double.valueOf(imdbreview) * 10;
		int finalimdb = (int) doubleimdb;

		Elements director = imdbdoc.select("div.credit_summary_item a");
		String dirname = director.toString();
		int g = dirname.indexOf("<", 42);
		System.out.println("Directed by: " + dirname.substring(41, g));
		System.out.println(" ");

		System.out.println("IMDb");
		System.out.println("Audience Review: " + finalimdb + "%");
		System.out.println(" ");

		String rtlt = imdbtitle.substring(0, imdbtitle.length() - 14);
		// System.out.println(rtlt);

		String rtgs = "http://www.google.com/search?q=Rotten Tomatoes " + movie + "&num=1";

		Document rtdoc = Jsoup.connect(rtgs).get();

		String rttitle = rtdoc.title();
		// System.out.println(rttitle);

		Elements rtresults = rtdoc.select("div.yuRUbf a");
		// System.out.println(rtresults);
		String art = rtresults.toString();
		String rtlink = art.substring(9);
		int i = rtlink.indexOf("\"", 10);
		// System.out.println(i);
		String rtlink2 = rtlink.substring(0, i);
		// System.out.println(rtlink2);

		Document rtrdoc = Jsoup.connect(rtlink2).get();

		Elements rtreview = rtrdoc.select("h2.mop-ratings-wrap__score");

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

		String rtlink3 = rtlink2.substring(33);
		String rtlink4 = rtlink3.replaceAll("-", "");
		String rtlink5 = rtlink4.replaceAll("([a-z])", "");
		String rtlink6 = rtlink5.replaceAll("([A-Z])", "");
		String rtlink7 = rtlink6.replaceAll("_", "");
		String rtlink8 = rtlink7.replaceAll("=", "");
		String rtlink9 = rtlink8.replaceAll(">", "");
		String rtlink10 = rtlink9.replaceAll("<", "");
		String rtlink11 = rtlink10.replaceAll("/", "");
		String rtlink12 = rtlink11.replaceAll("%", "");
		String rtlink13 = rtlink12.replaceAll("\"", "");

		String h2title2 = h2titlem.replace(rtlink13, "");
		// System.out.println(h2title2);

		String rtcrit = h2title2.substring(1, 3);
		int finalrtcrit = Integer.valueOf(rtcrit);
		String rtaud = h2title2.substring(7, 9);
		int finalrtaud = Integer.valueOf(rtaud);
		System.out.println("Rotten Tomatoes");
		System.out.println("Critic Review: " + finalrtcrit + "%");
		System.out.println("Audience Review: " + finalrtaud + "%");

		System.out.println(" ");
		String mcgs = "http://www.google.com/search?q=Metacritic " + movie + "&num=1";
		Document mcdoc = Jsoup.connect(mcgs).get();

		String mctitle = mcdoc.title();
		// System.out.println(mctitle);

		Elements mcresults = mcdoc.select("div.yuRUbf a");
		// System.out.println(mcresults);
		String amc = mcresults.toString();
		String mclink = amc.substring(9);
		int h = mclink.indexOf("\"", 10);
		// System.out.println(h);
		String mclink2 = mclink.substring(0, h);
		// System.out.println(mclink2);

		Document mcrdoc = Jsoup.connect(mclink2).get();

		Elements mcreview = mcrdoc.select("a.metascore_anchor span");
		// System.out.println(mcreview);

		String amastitle = mcreview.toString();

		String amastitle2 = amastitle.replaceAll("([a-z])", "");
		String amastitle3 = amastitle2.replaceAll("([A-Z])", "");
		String amastitle4 = amastitle3.replaceAll("-", "");
		String amastitle5 = amastitle4.replaceAll("_", "");
		String amastitle6 = amastitle5.replaceAll("=", "");
		String amastitle7 = amastitle6.replaceAll(">", "");
		String amastitle8 = amastitle7.replaceAll("<", "");
		String amastitle9 = amastitle8.replaceAll("", "");
		String amastitle10 = amastitle9.replaceAll("/", "");
		String amastitle11 = amastitle10.replaceAll("%", "");
		String amastitle12 = amastitle11.replaceAll(" ", "");
		String amastitle13 = amastitle12.replaceAll("\"", "");
		// System.out.println(amastitle13);

		String mccrit = amastitle13.substring(0, 2);
		double doublemccrit = Double.valueOf(mccrit);
		int finalmccrit = (int) doublemccrit;
		System.out.println("Metacritic");
		System.out.println("Critic Review: " + finalmccrit + "%");

		String mcaud = amastitle13.substring(3, 6);
		double doublemcaud = Double.valueOf(mcaud) * 10;
		int finalmcaud = (int) doublemcaud;
		System.out.println("Audience Review: " + finalmcaud + "%");
		System.out.println(" ");

		int finalaud = (finalimdb + finalrtaud + finalmcaud) / 3;
		// System.out.println(finalaud);

		int finalcrit = (finalrtcrit + finalmccrit) / 2;
		// System.out.println(finalcrit);

		int finalaverage = (finalcrit + finalaud) / 2;
		System.out.println("Averaged Reviews");
		System.out.println("Critic Review: " + finalcrit + "%");
		System.out.println("Audience Review: " + finalaud + "%");
		System.out.println("Final Review: " + finalaverage + "%");

	}

}
