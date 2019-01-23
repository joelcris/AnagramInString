import java.util.Arrays;

/*
 * Java program for finding a word and all its possible anagrams occurrences
 * in a given string.
 * 
 * For locating the word and all its possible anagrams we proceed as follows:
 * Since an ordered version of word is any possible anagram, order the word, look for it in
 * the first letters of the input string by comparing a substring of n letters at a time.
 * Let n be the number of letters in the word.
 * 
 * Proceed for the next word in the string starting with the second letter, then the third...
 * until the last possible word in the input string. 
 * 
 * Example:
 * 
 * Input:
 * 		String ="anagram lost in an ocean of letters"
 * 		Word = "an"
 * 
 * Expected Output: 
 * 		String input: anagram lost in an ocean of letters
 * 		word: an
 * 		word length: 2
 * 		word sorted: an
 *
 * 		Anagram found at index : 0
 * 		The substring of input is: an
 * 		The result of this substring sorted is (an)  compared to word (an)
 *
 * 		Anagram found at index : 1
 * 		The substring of input is: na
 * 		The result of this substring sorted is (an)  compared to word (an)
 *
 * 		Anagram found at index : 16
 * 		The substring of input is: an
 * 		The result of this substring sorted is (an)  compared to word (an)
 *
 * 		Anagram found at index : 22
 * 		The substring of input is: an
 * 		The result of this substring sorted is (an)  compared to word (an)
 *
 *@autor Joel Crisanto
 *@version 1.0
 *@since 2019-01-22 
 */

public class AnagramInString {
	
	//Input String
	static String input = "anagram lost in an ocean of letters";
	
	//Array for storing a substring of input with length equals to 'word'
	static char[] inputSubStr;
	
	//String 'Word' to look for, as well as all possible anagrams
	static String word = "an";
	
	//String for store a sorted version of 'word'
	static String wordSorted;
	
	//Int for storing the length of the word
	static int wordLength;

	
	/*
	 * Main method
	 */
	public static void main(String[] args) {
		
		//Print the input for visualization purposes
		System.out.println("String input: " + input);
		
		//Print the word to be located
		System.out.println("word: " + word);
		
		//Store the length of the word
		wordLength = word.length();
		
		//Print the ordered version of word for visualization purposes
		System.out.println("word length: " + wordLength);
		
		wordSorted = sortString(word);
		System.out.println("word sorted: " + wordSorted);
		System.out.println("");

		//Traverse every character in input until the last possible word
		//The subtraction of the wordLength is for prevent StringIndexOutOfBoundsException
		//because we are looking at every n letters 
		for (int i = 0; i <= input.length()-wordLength; i++) {
			
			printWhenFound(i);

		}
			
	}
	
	
	
	/*
	 * Method to ordering and returning a String.
	 */
	public static String sortString(String str) {
		
		//String to Array
		inputSubStr = str.toCharArray();
		
		//order the array using array.sort, a Dual-Pivot Quicksort algorithm 
		Arrays.sort(inputSubStr);
		
		//Return a String version of the sorted Array
		return String.valueOf(inputSubStr);
	}
	
	
	/*
	 * Method to find the anagram by comparing the
	 */
	public static boolean findAnagram(String s1, String s2) {
		
		//compare the sorted word vs the sorted substring of input
		return s1.equals(s2);
	}
	
	
	/*
	 * Method to print the index when anagram is found 
	 */
	public static void printWhenFound(int n) {
		
		//Print when anagram or word found by comparing ordered versions of
		//a substring of input and word. (n,wordLength+n) limits a contiguous set
		//of letters of same size to compare 
		if (findAnagram (sortString(input.substring(n,wordLength+n)), sortString(word))) {
			
		System.out.println("Anagram found at index : " + n);
		System.out.println("The substring of input is: " + input.substring(n,wordLength+n));
		System.out.println("The result of this substring sorted is (" 
				+ sortString(input.substring(n,wordLength+n))+") "+
				" compared to word (" + wordSorted + ")");
		System.out.println();
		}
	}
}
