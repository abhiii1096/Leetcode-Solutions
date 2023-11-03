class Solution {
public:
    vector<string> buildArray(vector<int>& target, int n) {
        vector<string> v;
        stack<int> s;       
        int index = 0;       
        for (int i = 1; i <= n; i++) {
            if (index == target.size()) {
                break;  
            }         
            if (target[index] == i) {
                v.push_back("Push");
                index++;
            } else {
                v.push_back("Push");
                v.push_back("Pop");
            }
        }       
        return v;
    }
};
