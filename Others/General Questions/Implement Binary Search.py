#citation: https://stackoverflow.com/questions/18010660/binary-search-implementation-with-python
def binary_search(lst, value):
    #base case here
    if len(lst) == 1:
        return lst[0] == value

    mid = len(lst)/2
    if lst[mid] < value:
        return binary_search(lst[:mid], value)
    elif lst[mid] > value:
        return binary_search(lst[mid+1:], value)
    else:
        return True

