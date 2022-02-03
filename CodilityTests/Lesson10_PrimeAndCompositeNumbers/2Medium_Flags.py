from itertools import groupby

def solution(A):
    #find indices of peaks
    start = 0
    sequence = []
    for key, group in groupby(A):
        sequence.append((key, start))
        start += sum(1 for _ in group)
    peaks = []
    for (b, bi), (m, mi), (a, ai) in zip(sequence, sequence[1:], sequence[2:]):
        if b < m and a < m:
            peaks.append(mi)

    #calculate maximum number of flags distributed on these peaks
    max_flags = 0
    for i in range(1, len(peaks) + 1):
        last_flag_index = peaks[0]
        possible_flags = 1
        for j in range(1, i):
            if peaks[j] - last_flag_index >= i:
                possible_flags += 1
                last_flag_index = peaks[j]
        if possible_flags > max_flags:
            max_flags = possible_flags
    return max_flags

#test
A = [1,5,3,4,3,4,1,2,3,4,6,2]
A1 = [1,2,3,2,3,2,3,2,3,2]
A2 = [3,2,3,2,2,2,3,22,2,3,3,54,73,1,6]
print(solution(A))
