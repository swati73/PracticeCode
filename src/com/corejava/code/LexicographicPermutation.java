package com.corejava.code;

import java.util.Arrays;

public class LexicographicPermutation {

	// Function to find all lexicographic permutations of a given
	// string where the repetition of characters is allowed
	public static void lexicographic(char[] chars, String res) {
		System.out.println("dfsdf" + res);

		// base condition (permutation found)
		if (res.length() == chars.length) {
			// print the permutation and return
			System.out.print(res + " ");
			return;
		}

		// consider all characters of the string one by one
		for (int i = 0; i < chars.length; i++) {
			System.out.println("sddsa::::::::::::::: " + i + "::::::" + res);

			// skip adjacent duplicates
			while (i + 1 < chars.length && chars[i] == chars[i + 1]) {
				i++;
			}
			lexicographic(chars, res + chars[i]);
		}
	}

	// print n! permutation of the characters of the string s (in order)
	public static void perm1(String s) {
		perm1("", s);
	}

	private static void perm1(String prefix, String s) {
		System.out.println("string:::::::::" + s);
		int n = s.length();
		if (n == 0)
			System.out.println("::::::PERMUTAION::::::" + prefix);
		else {
			for (int i = 0; i < n; i++) {
				perm1(prefix + s.charAt(i), s.substring(0, i) + s.substring(i + 1, n));
			}
		}
	}

	// print n! permutation of the elements of array a (not in order)
	public static void perm2(String s) {
		char[] a = s.toCharArray();
		perm2(a, 0);
	}

	// cid is current index;
	private static void perm2(char[] a, int cid) {
		if (cid == (a.length - 1)) {
			System.out.println(new String(a));
			return;
		}
		for (int i = cid; i < a.length; i++) {
			swap(a, i, cid);
			perm2(a, cid + 1);
			swap(a, i, cid);
		}
	}

	// swap the characters at indices i and j
	private static void swap(char[] a, int i, int j) {
		char c = a[i];
		a[i] = a[j];
		a[j] = c;
	}

	public static void main(String[] args) {
		String str = "ABC";

		// sort the string to print in lexicographical order
		char[] chars = str.toCharArray();
		Arrays.sort(chars);
		lexicographic(chars, "");

		// Function to find all lexicographic permutations of a given
		// string where the repetition of characters is not allowed in two ways
		perm1(str);
		System.out.println();
		perm2(str);
	}

}
