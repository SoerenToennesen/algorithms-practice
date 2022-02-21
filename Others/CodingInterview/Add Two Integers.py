def add_integers(integer1, integer2):
  res = []
  carry = 0
  n_min = min(len(integer1), len(integer2))
  n_max = max(len(integer1), len(integer2))
  max_integer = integer1 if len(integer1) > len(integer2) else integer2
  for i in range(n_min):
    to_add_with_carry = integer1[i] + integer2[i]
    to_add_temp = to_add_with_carry % 10
    carry_with_carry = to_add_temp + carry
    to_add = to_add_temp % 10
    res.append(to_add + carry)
    carry = to_add_with_carry // 10 + carry_with_carry // 10
  for j in range(i + 1, n_max):
    to_add_with_carry = max_integer[j]
    to_add_temp = to_add_with_carry % 10
    carry_with_carry = to_add + carry
    to_add = to_add_temp % 10
    res.append(to_add + carry)
    carry = to_add_with_carry // 10 + carry_with_carry // 10
  if carry > 0:
    res.append(carry % 10)
  return res

#test
print(add_integers([1,2,3], [4,5,6,7])) # [5,7,9,7]
print(add_integers([7,2,6], [4,5,6,9])) # [1,8,2,0,1] - this is incorrect, but close! 