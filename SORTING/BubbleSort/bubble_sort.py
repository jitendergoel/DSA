from typing import List


def bubble_sort(arr: List[int], reverse: bool = False) -> List[int]:
    """
    Bubble Sort Algorithm.
    """
    n = len(arr)
    for i in range(n):
        swapped = False
        for j in range(0, n-i-1):
            if arr[j] > arr[j+1]:
                arr[j], arr[j+1] = arr[j+1], arr[j]
                swapped = True
        # print("Pass", i + 1, ":", arr)
        if not swapped:
            break
    return arr


if __name__ == "__main__":
    test_array: List[int] = [64, 34, 25, 12, 22, -1, 90]
    sorted_arr: List[int] = bubble_sort(test_array)
    print("Sorted array:", sorted_arr)
