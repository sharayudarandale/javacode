#include <vector>
#include <climits>  // For INT_MIN
using namespace std;

class Solution {
public:
    // Function to return the second largest element
    int getSecondLargest(vector<int>& arr) {
        // Handle edge case: less than 2 elements
        if (arr.size() < 2) {
            return -1;  // Return -1 or some other value indicating no second largest exists
        }

        int largest = INT_MIN;
        int secondLargest = INT_MIN;

        // Traverse through the array
        for (int num : arr) {
            // Update largest and secondLargest accordingly
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }

        // If no valid second largest element exists
        if (secondLargest == INT_MIN) {
            return -1;  // In case all elements are the same or not enough distinct elements
        }

        return secondLargest;
    }
};

