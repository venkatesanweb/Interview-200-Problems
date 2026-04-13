class Solution {
public:
    vector<vector<int>> findDifference(vector<int>& nums1, vector<int>& nums2) {
        set<int> s1(nums1.begin(), nums1.end());
        set<int> s2(nums2.begin(), nums2.end());
        vector<int> v1, v2;
        for (int x : s1) {
            if (s2.find(x) == s2.end()) {
                v1.push_back(x);
            }
        }

        for (int x : s2) {
            if (s1.find(x) == s1.end()) {
                v2.push_back(x);
            }
        }

        return {v1, v2};
    }
};
