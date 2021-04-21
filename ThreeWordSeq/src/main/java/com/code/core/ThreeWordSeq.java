package com.code.core;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ThreeWordSeq {

	public ThreeWordSeq() {
		
	}

	public static void main(String[] args) {

		// check if length of args array is
		// greater than 0

		if (args.length > 0) {

			try {
				readFiles(args);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		else
			System.out.println("No command line arguments found.nnnnnnnnn");

	}

	public static void readFiles(String[] args) throws IOException {
	
		String resultStringBuilder = null;

		// iterating the args array and printing
		// the command line arguments
		for (String val : args) {

			try (BufferedReader br
					= new BufferedReader(new FileReader("src/main/resources/" + val))) {
			
				resultStringBuilder = readAlllinesWithStream(br);
			}

			calculateFreq(resultStringBuilder);

		}

	}

	private static String readAlllinesWithStream(BufferedReader br) {

		return br.lines().collect(Collectors.joining(System.lineSeparator()));
	}

	public static void calculateFreq(String pharse) {

		String[] splited = pharse.trim().toLowerCase().split("[.,!?:;'\"-]|\\s");
		String threeWords;
		Map<String, Integer> freq = new HashMap<>();

		for (int i = 0; i < splited.length - 2; i++) {
			threeWords = splited[i] + " " + splited[i + 1] + " " + splited[i + 2];
			freq.compute(threeWords, (k, v) -> (v == null) ? 1 : v + 1);

		}
		freq.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).limit(100)
				.forEach(System.out::println);

	}

}
