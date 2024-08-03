package pt.adrz.samples.main;

import java.text.Normalizer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import pt.adrz.samples.basics.Dates;
import pt.adrz.samples.collections.Collections;
import pt.adrz.samples.euler.Euler;
import pt.adrz.samples.generics.Generics;
import pt.adrz.samples.gui.DynamicListFrame;
import pt.adrz.samples.gui.GuiTmp;
import pt.adrz.samples.swing.hacks.components.SwingHacks;
import pt.adrz.samples.tmp.Calculator;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//testCollections();
		//testDesignPatterns();
		//simpleCalculator();
		//testSwingHacks();
		//testEuler();
		//dates();
		//list();
		//date_calculation();
		//varIncrement();
		specialChars();
		//System.out.println(divide(1000, 2));
	
	}
	
	public static void splite() {
		
		String tmp ="9112478763|10113|33845857|billing";

	}

	public static void specialChars() {
		
		String test = "áaaabãõç";
		String result = null;
		//result = Normalizer.normalize(test, Normalizer.Form.NFD);
		result = flattenToAscii(test);

		System.out.println(result);
	}
	
	public static String flattenToAscii(String string) {
        StringBuilder sb = new StringBuilder(string.length());
        string = Normalizer.normalize(string, Normalizer.Form.NFD);
        for (char c : string.toCharArray()) {
            if (c <= '\u007F') sb.append(c);
        }
        return sb.toString();
    }
	
	public static void challenges() {
	
		//Simple.remove_extra_consecutive("aaab", 2);
	}
	
	public static int divide(int a, int b) {
		
		int sign = 1;
		int result = 0;
		
		if ( b == 0 ) throw new IllegalArgumentException("nao pode ser 0");
		
		while ( a >= 0 ) {
			a -= b;
			result++;
		}

		return result;
	}
	
	public static void date_calculation() {
		
		Date today = new Date();
		Date date1 = new Date(); 
		String dateString = "2014/05/15";

		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		
		try {  date1 = sdf.parse(dateString); } catch (ParseException e) { e.printStackTrace(); }
		int compVal = today.compareTo(date1);
		
		long interval = today.getTime() - date1.getTime();
		
		int days  = (int) interval / (1000*60*60*24);

		System.out.println("today: " + today.toString());
		System.out.println("date1: " + date1.toString());
		System.out.println("compV: " + compVal);
		System.out.println("interval (millisecounds): " + interval);
		System.out.println("days: " + days);
	}
	
	
	
	
	
	
	public static void dates() {
		Dates dates = new Dates();
		dates.temp();
	}
	
	public static void varIncrement() {
		int h = 1; // teste
		int a = h++; // add value then increment
		int b = --h; // decrement then add i value
		System.out.println("h = " + h + " ; a = " + a + " ; b = " + b + " ;");
	}
	

	
	public static void testEuler() {
		Euler.p004_largest_palindrome_product();
		//Euler.p001_multiples_of_3_and_5();
	}
	
	
	public static void testGenerics() {
		Generics generics = new Generics();
		generics.tryBox2();
	}
	
	public static void testCollections() {
		Collections coll = new Collections();
		coll.hash();
		//coll.doSomething();
		//coll.test();
		
	}
	
	public static void testGui() {
		GuiTmp gui = new GuiTmp();
	}
	
	public static void list() {
//		ListExample  list = new ListExample();
		DynamicListFrame listFrame = new DynamicListFrame();
	}
	
	public static void simpleCalculator() {
		Calculator calc = new Calculator();
	}
	
	public static void testSwingHacks() {
		SwingHacks swingHacks = new SwingHacks();
		swingHacks.blurButton();
		swingHacks.tabEfects();
		swingHacks.filteredList();
	}

}
