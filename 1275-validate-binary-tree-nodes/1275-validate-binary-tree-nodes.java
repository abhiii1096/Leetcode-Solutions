class Solution {
    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
        // handle find 1 root
        boolean[] isRoot = new boolean[n];
        Arrays.fill(isRoot, true);
        for(int i = 0; i < n; i++) {
            if (leftChild[i] != -1) isRoot[leftChild[i]] = false;
            if (rightChild[i] != -1) isRoot[rightChild[i]] = false;
        }
        
        int rootCount = 0; 
        int root = -1;
        for(int i = 0; i < n; i++) {
            if (isRoot[i]) {
                rootCount++;
                root = i;
            }
        }
        if (rootCount != 1) return false;

        // bfs to find cycle
        boolean[] visited = new boolean[n]; 
        int count = 0;
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(root); 
        
        while(!queue.isEmpty()) {
            int at = queue.poll(); 
            count++;
            if (visited[at]) return false;
            visited[at] = true;
            
            if (leftChild[at] != -1) {
                queue.add(leftChild[at]);
            } 
            
            if (rightChild[at] != -1) {
                queue.add(rightChild[at]);
            }
        }
        
        return count == n;
    }
}