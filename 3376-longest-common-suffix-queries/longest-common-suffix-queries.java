class Solution {

    class TrieNode {

        TrieNode[] child = new TrieNode[26];

        int index;
        int len;

        TrieNode() {
            index = Integer.MAX_VALUE;
            len = Integer.MAX_VALUE;
        }
    }

    TrieNode root = new TrieNode();

    // store best answer at node
    private void update(TrieNode node, int idx, int length) {

        if (length < node.len ||
           (length == node.len && idx < node.index)) {

            node.len = length;
            node.index = idx;
        }
    }

    private void insert(String word, int idx) {

        TrieNode node = root;

        update(node, idx, word.length());

        // insert reverse
        for (int i = word.length() - 1; i >= 0; i--) {

            int c = word.charAt(i) - 'a';

            if (node.child[c] == null) {
                node.child[c] = new TrieNode();
            }

            node = node.child[c];

            update(node, idx, word.length());
        }
    }

    private int search(String word) {

        TrieNode node = root;

        for (int i = word.length() - 1; i >= 0; i--) {

            int c = word.charAt(i) - 'a';

            if (node.child[c] == null) {
                break;
            }

            node = node.child[c];
        }

        return node.index;
    }

    public int[] stringIndices(String[] wordsContainer, String[] wordsQuery) 
    {

        // build trie
        for (int i = 0; i < wordsContainer.length; i++) 
        {
            insert(wordsContainer[i], i);
        }

        int[] ans = new int[wordsQuery.length];

        // answer queries
        for (int i = 0; i < wordsQuery.length; i++) 
        {
            ans[i] = search(wordsQuery[i]);
        }

        return ans;
    }
}