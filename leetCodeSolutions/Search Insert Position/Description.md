# 35. Search Insert Position

Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with `O(log n)` runtime complexity.

> ### Example 1:
>> <p><strong>Input:</strong> nums = [1,3,5,6], target = 5<br>
>> <strong>Output:</strong> 2</p>

> ### Example 2:
>> <p><strong>Input:</strong> nums = [1,3,5,6], target = 2<br>
>> <strong>Output:</strong> 1</p>

> ### Example 3:
>> <p><strong>Input:</strong> nums = [1,3,5,6], target = 7<br>
>> <strong>Output:</strong> 4</p>

### Constraints:

* `1 <= nums.length <= 104`
* `-104 <= nums[i] <= 104`
* `nums` contains **distinct** values sorted in **ascending** order.
* `-104 <= target <= 104`