# 2D Array

A 2D array is stored in memory like a matrix.

## Storage Orders

Elements can be stored in two ways:

1. **Row Major** - store row by row into a 1D array
2. **Column Major** - store column by column into a 1D array

---

## Address of an Element

### Row Major Formula

```
Address = Base + ((i - LR) * NumCols + (j - LC)) * Size
```

- `LR` = lower bound of rows
- `LC` = lower bound of columns
- `NumCols` = total number of columns
- `Size` = size of one element (in bytes)

### Column Major Formula

```
Address = Base + ((j - LC) * NumRows + (i - LR)) * Size
```

- `NumRows` = total number of rows

### Quick Example (Row Major)

Consider a 3x4 integer matrix (rows 0-2, columns 0-3):

```
        Col 0   Col 1   Col 2   Col 3
Row 0 [  10,     20,     30,     40  ]
Row 1 [  50,     60,     70,     80  ]
Row 2 [  90,    100,    110,    120  ]
```

From this matrix we can see:

- `Base` = 1000 (starting memory address, given in question)
- `LR` = 0 (rows start from 0)
- `LC` = 0 (columns start from 0)
- `NumCols`= 4 (each row has 4 columns: Col 0, 1, 2, 3)
- `Size` = 4 (int = 4 bytes)

**Find address of element [2][3] (value 120):**

```
Address = Base + ((i - LR) * NumCols + (j - LC)) * Size
        = 1000 + ((2 - 0) * 4 + (3 - 0)) * 4
        = 1000 + (8 + 3) * 4
        = 1000 + 11 * 4
        = 1000 + 44
        = 1044
```

## To Represent Array

- nested For Loops
- first for --< m tk>\\ m--> no of rows
- second for --< n tk >\\ n --> No of coloumns
- print (i)(j)

# Time Complexiy

- O(m\*n)
