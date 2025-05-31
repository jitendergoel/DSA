from typing import List

def insertion_sort(arr: List[int], reverse: bool = False) -> List[int]:
    """
    Insertion Sort Algorithm.
    """
    n = len(arr)
    for i in range(1, n):
        j = i
        while j>0:
            if (not reverse and arr[j] < arr[j-1]) or (reverse and arr[j] > arr[j-1]):
                arr[j], arr[j-1] = arr[j-1], arr[j]
                j-=1
            else:
                break
        print(f"i: {i}, arr: {arr}")
    return arr


if __name__ == "__main__":
    test_arr = [32,23,12,43,65,33,1,34,5,45]
    sorted_arr = insertion_sort(test_arr, reverse=True)
    print(f"Sorted array: {sorted_arr}")
