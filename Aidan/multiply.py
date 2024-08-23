#! C:\Users\HP\local repository\AWS\Aidan

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
   


result = multiplier(5,0)
print(result)
