#! python

def multiplier(num1, num2):
        
    prod = 0
        
    
    if num1 ==0 or num2 == 0:
        prod = 0
    else:
        if num1 > 0:
            for ii in range(0,num1):
                prod = prod + num2
        else:
            for ii in range(num1, 0):
                prod = prod - num2
    return prod


print("4 * 5 = {p}".format(p=multiplier(4,5)))
print("-4 * 5 = {p}".format(p=multiplier(-4,5)))
print("4 * -5 = {p}".format(p=multiplier(4,-5)))
print("-4 * -5 = {p}".format(p=multiplier(-4,-5)))
print("0 * 5 = {p}".format(p=multiplier(0,5)))
print("4 * 0 = {p}".format(p=multiplier(4,0)))
print("1 * 5 = {p}".format(p=multiplier(1,5)))
print("4 * 1 = {p}".format(p=multiplier(4,1)))
print("0 * 0 = {p}".format(p=multiplier(0,0)))
print("1 * 1 = {p}".format(p=multiplier(1,1)))
print("-0 * -0 = {p}".format(p=multiplier(-0,-0)))

