# Multiplication Lab

In this lab, we will develop a Python function that will accept 2 numbers as input and
determine their product without using the multiplication operator.

## Requirements

- 2 inputs, both are numbers
- Must determine product without using the multiplication operator
- Must show tests that work.  The following tests are required and additional tests are encouraged.

| Test                    | Operand 1   | Operand 2   | Result                  |
|-------------------------|-------------|-------------|-------------------------|
| FirstOperandIsZero      | 0           | 1           | 0                       |
| SecondOperandIsZero     | 1           | 0           | 0                       |
| FirstOperandIsNegative  | -2          | 3           | -6                      |
| SecondOperandIsNegative | 2           | -3          | -6                      |
| BothOperandsPositive    | 2           | 3           | 6                       |
| BothOperandsNegative    | -2          | -3          | 6                       |
| BothOperandsMax         | sys.maxsize | sys.maxsize | sys.maxsize*sys.maxsize |
