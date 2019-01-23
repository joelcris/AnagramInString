# AnagramInString
Java program for finding a word and all its possible anagrams occurrences   in a given string.

For locating the word and all its possible anagrams we proceed as follows:
Since an ordered version of word is any possible anagram, order the word, look for it in
the first letters of the input string by comparing a substring of n letters at a time.
Let n be the number of letters in the word.
 
Proceed for the next word in the string starting with the second letter, then the third...
until the last possible word in the input string. 
 
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
