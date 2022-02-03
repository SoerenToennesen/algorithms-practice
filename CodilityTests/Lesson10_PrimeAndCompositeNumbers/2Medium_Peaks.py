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

    #calculate second part
    count = 0
    i = 1
    while len(A) // i >= i:
        if len(A) % i == 0:
            slices = len(A) // i
            peak_in_all_slices = True
            for j in range(i):
                peak_in_slice = False
                for k in range(j*slices, j*slices+slices):
                    if k in peaks:
                        peak_in_slice = True
                        break
                if not peak_in_slice:
                    peak_in_all_slices = False
                    break
            if peak_in_all_slices:
                count += 1
        i += 1
    return count
    

#test
A = [1,2,3,4,3,4,1,2,3,4,6,2]
A1 = [1,2,3,2,3,2,3,2,3,2]
A2 = [3,2,3,2,2,2,3,22,2,3,3,54,73,1,6]
print(solution(A))
