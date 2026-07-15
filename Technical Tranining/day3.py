# Define values
rows = 4
cols = 4

# Dec and init a 2D array
arr = [[0] * cols for i in range(rows)]

for i in range(rows):
    for j in range(cols):
        arr[i][j] = i

# Print the matrix
print("Original Matrix:")
for i in range(rows):
    for j in range(cols):
        print(arr[i][j], end=" ")
    print()

# Access and modify an element
print("\nElement at [2][2]:", arr[2][2])

arr[2][2] = 10

print("\nModified Matrix:")
for i in range(rows):
    for j in range(cols):
        print(arr[i][j], end=" ")
    print()

# Sum the elements of each row
print("\nRow Sums:")
for i in range(rows):
    total = 0
    for j in range(cols):
        total += arr[i][j]
    print("Sum of row", i, ":", total)

# Transpose of the matrix
transpose = [[0] * rows for i in range(cols)]

for i in range(rows):
    for j in range(cols):
        transpose[j][i] = arr[i][j]

print("\nTranspose Matrix:")
for i in range(cols):
    for j in range(rows):
        print(transpose[i][j], end=" ")
    print()