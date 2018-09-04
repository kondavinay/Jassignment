package com.kumar.Work;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CsvReader implements MethodsFile {

	public void display2() {

		String csvFile = "C:\\Users\\Vinay Konda\\Desktop\\New folder (3)\\1\\file.csv";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";

		try {

			br = new BufferedReader(new FileReader(csvFile));

			ArrayList<String> pl = new ArrayList<String>();

			while ((line = br.readLine()) != null) {

				String[] details = line.split(cvsSplitBy);

				pl.add(details[0] + "," + details[1] + "," + details[2] + "," + details[3] + "," + details[4] + ","
						+ details[5]);

			}

			String csv[] = pl.toArray(new String[pl.size()]);

			System.out.println("Root Elements : records");

			System.out.println("-------------------------");

			for (String s1 : pl) {
				System.out.println("Duplicates List " + s1);
			}

			System.out.println("\n\n");

			Object[] st = pl.toArray();
			for (Object s : st) {
				if (pl.indexOf(s) != pl.lastIndexOf(s)) {
					pl.remove(pl.lastIndexOf(s));
				}
			}
			ArrayList<String> p1 = new ArrayList<String>();
			for (String str : pl) {
				System.out.println("Distinct List " + str);
			}

			RemoveDuplicate.method(pl);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}
}