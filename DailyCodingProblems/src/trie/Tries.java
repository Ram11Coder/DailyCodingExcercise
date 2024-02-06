package trie;

public class Tries {

	private static final int ALPHABET_LETTER = 26;

	private class TrieNode {
		private char value;
		private TrieNode[] children = new TrieNode[ALPHABET_LETTER];;
		private boolean isEndOfWord;

		public TrieNode(char value) {
			this.value = value;
		}
	}

	private TrieNode root = new TrieNode(' ');

	public void insert(String word) {
		TrieNode currentNode = root;
		for (char ch : word.toLowerCase().toCharArray()) {
			int currentIndex = ch - 'a';
			if (currentNode.children[currentIndex] == null)
				currentNode.children[currentIndex] = new TrieNode(ch);

			currentNode = currentNode.children[currentIndex];
		}

		currentNode.isEndOfWord = true;
	}

	public static void main(String[] args) {

		Tries trie = new Tries();

		trie.insert("cat");
		trie.insert("can");
		System.out.println("Done");
	}
}
