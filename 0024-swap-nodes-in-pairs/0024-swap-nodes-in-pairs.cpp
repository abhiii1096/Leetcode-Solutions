/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* swapPairs(ListNode* head) {
        if(head == NULL || head->next == NULL) return head;
        ListNode* newHead = head->next;
        ListNode* curr = head->next, *prev = head , *nextNode = curr->next, *temp = NULL;
        while(curr != NULL)
        {
            nextNode = curr->next;
            if(temp!= NULL) temp->next = curr;
            curr->next = prev;
            prev->next = nextNode;
            temp = prev;
            prev = prev->next;
            if(prev != NULL)
            curr = prev->next;
            else curr = nullptr;
        }
        return newHead;
    }
        
    };
