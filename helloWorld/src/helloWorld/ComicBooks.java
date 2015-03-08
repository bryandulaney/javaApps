package helloWorld;

import java.util.*;

public class ComicBooks {

	private static final String COVERLESS = "coverless";
	private static final String POOR = "poor";
	private static final String GOOD = "good";
	private static final String FINE = "fine";
	private static final String VERY_FINE = "very fine";
	private static final String NEAR_MINT = "near mint";
	private static final String MINT = "mint";
	private static final String PRISTINE_MINT = "pristine mint";

	public ComicBooks() {

	}

	public static void main(String[] args) {
		// Set up has map
		HashMap<String, Float> quality = initializeHashMap();

		// set up collection
		Comic[] comix = new Comic[5];
		comix[0] = new Comic("Amazing Spider-Man", "1A", VERY_FINE, 5_000.00F);
		comix[0].setPrice((Float) quality.get(comix[0].condition));
		comix[1] = new Comic("Incredible Hulk", "181", NEAR_MINT, 240.00F);
		comix[1].setPrice((Float) quality.get(comix[1].condition));
		comix[2] = new Comic("Cerebus", "1A", GOOD, 144.00F);
		comix[2].setPrice((Float) quality.get(comix[2].condition));
		comix[3] = new Comic("The Silver Surfer", "1A", PRISTINE_MINT, 10_000.00F);
		comix[3].setPrice((Float) quality.get(comix[3].condition));
		comix[4] = new Comic("Dr. Strange", "244", COVERLESS, 264.00F);
		comix[4].setPrice((Float) quality.get(comix[4].condition));
		displayValue(comix);
	}

	private static HashMap<String, Float> initializeHashMap() {
		HashMap<String,Float> quality = new HashMap<String,Float>();
		float price0 = 5.00F;
		quality.put(PRISTINE_MINT, price0);
		float price1 = 3.00F;
		quality.put(MINT, price1);
		float price2 = 2.00F;
		quality.put(NEAR_MINT, price2);
		float price3 = 1.50F;
		quality.put(VERY_FINE, price3);
		float price4 = 1.00F;
		quality.put(FINE, price4);
		float price5 = 0.50F;
		quality.put(GOOD, price5);
		float price6 = 0.25F;
		quality.put(POOR, price6);
		float price7 = 0.10F;
		quality.put(COVERLESS, price7);
		return quality;
	}

	private static void displayValue(Comic[] comix) {
		for (int i = 0; i < comix.length; i++) {
			System.out.println("Title: " + comix[i].title);
			System.out.println("Issue: " + comix[i].issueNumber);
			System.out.println("Condition: " + comix[i].condition);
			System.out.println("Price: $" + comix[i].price + "\n");
		}
	}
}

class Comic {
	String title;
	String issueNumber;
	String condition;
	float basePrice;
	float price;

	Comic(String inTitle, String inIssueNumber, String inCondition,
			float inBasePrice) {

		title = inTitle;
		issueNumber = inIssueNumber;
		condition = inCondition;
		basePrice = inBasePrice;
	}

	void setPrice(float factor) {
		price = basePrice * factor;
	}
}